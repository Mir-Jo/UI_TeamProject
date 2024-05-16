package com.example.picket.controller;

import com.example.picket.dto.DoPaymentForm;
import com.example.picket.dto.PaymentRequest;
import com.example.picket.entity.Customer;
import com.example.picket.entity.Ticket;
import com.example.picket.service.CustomerService;
import com.example.picket.service.PaymentService;
import com.example.picket.service.TicketService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static java.lang.Long.parseLong;

@Controller
@RequiredArgsConstructor
public class PayController {

    private final TicketService ticketCreateService;
    private final CustomerService customerService;
    private final PaymentService paymentService;

    @PostMapping("/Pay")
    public void gotoPay(@RequestBody PaymentRequest request){
//        try {
//            String imp_uid = request.getImp_uid();
//            String merchant_uid = request.getMerchant_uid();
//
//            // 1. 포트원 API 엑세스 토큰 발급
//            String tokenUrl = "https://api.iamport.kr/users/getToken";
//            String tokenPayload = "{\"imp_key\": \"7475107828256200\", \"imp_secret\": \"0kRpXxM0h8MPyTpOFo3SBrrl7u8j71gn80J7OZFSiyiZ1YZwQoBFibg3oaCj6nqbiNMmb7Ke5lV2VEXB\"}";
//            String tokenResponse = sendPostRequest(tokenUrl, tokenPayload);
//            String access_token = extractAccessToken(tokenResponse);
//
//            // 2. 포트원 결제내역 단건조회 API 호출
//            String paymentUrl = "https://api.iamport.kr/payments/" + imp_uid;
//            String paymentResponse = sendGetRequest(paymentUrl, access_token);
//            JSONObject paymentJson = new JSONObject(paymentResponse);
//
//            System.out.println(paymentResponse);
//
//            String paymentStatus = paymentJson.getJSONObject("response").getString("status");
//            switch (paymentStatus) {
//                case "ready":
//                    // 가상 계좌가 발급된 상태입니다.
//                    // 계좌 정보를 이용해 원하는 로직을 구성하세요.
//                    break;
//                case "paid":
//                    // 모든 금액을 지불했습니다! 완료 시 원하는 로직을 구성하세요.
//                    break;
//                default:
//                    // 기타 상태 처리
//                    break;
//            }
//
//            // 3. 고객사 내부 주문 데이터의 가격과 실제 지불된 금액을 비교합니다.
//            // 여기에 해당하는 코드 추가
//
//        } catch (Exception e) {
//            // 결제 검증에 실패했습니다.
//            // 여기에 해당하는 코드 추가
//        }
//    }
//
//    private String sendPostRequest(String url, String payload) throws IOException {
//        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//        connection.setRequestMethod("POST");
//        connection.setRequestProperty("Content-Type", "application/json");
//        connection.setDoOutput(true);
//        connection.getOutputStream().write(payload.getBytes());
//        int responseCode = connection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                return reader.lines().collect(Collectors.joining());
//            }
//        } else {
//            throw new IOException("HTTP error code: " + responseCode);
//        }
//    }
//
//    private String extractAccessToken(String tokenResponse) {
//        JSONObject jsonResponse = new JSONObject(tokenResponse);
//        return jsonResponse.getString("access_token");
//    }
//
//    private String sendGetRequest(String url, String accessToken) throws IOException {
//        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//        connection.setRequestMethod("GET");
//        connection.setRequestProperty("Authorization", accessToken);
//        int responseCode = connection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                return reader.lines().collect(Collectors.joining());
//            }
//        } else {
//            throw new IOException("HTTP error code: " + responseCode);
//        }

    }


    @PostMapping("/doPay")
    public ResponseEntity<Void> doPay(HttpServletRequest request, @RequestBody DoPaymentForm doPaymentForm){
        System.out.println("결제확인: " + doPaymentForm.toString());

        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");

        customerService.pointUpdate(doPaymentForm.getCustomerPoint(), customer.getId());
        customer.setPoint(parseLong(doPaymentForm.getCustomerPoint()));
        session.setAttribute("customer", customer);
        List<Ticket> tickets = ticketCreateService.ticketCreateInput(doPaymentForm.getTicketCount(), doPaymentForm.getPerformanceTitle());
        if(!tickets.isEmpty()){
            paymentService.paymentInfoInput(tickets, customer, doPaymentForm);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
