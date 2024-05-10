
IMP.init("imp01723330");3

function requestPay() {
    IMP.request_pay({
        pg: "html5_inicis",
        pay_method: "card",
        merchant_uid: `payment-${crypto.randomUUID()}`, // 주문 고유 번호
        name: "노르웨이 회전 의자",
        amount: 1,
        buyer_email: "gildong@gmail.com",
        buyer_name: "홍길동",
        buyer_tel: "010-4242-4242",
        buyer_addr: "서울특별시 강남구 신사동",
        buyer_postcode: "01181",
    }, function (response) {
        console.log("확인");
        const notified = fetch(`http://localhost:8080/payment/complete`, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({
                imp_uid: response.imp_uid,
                merchant_uid: response.merchant_uid,
            }),
        });
    });
}