// 수정하기 버튼 클릭 시 모달 열기
var btnOpenedit = document.getElementById('btnOpenedit');
var modal = document.getElementById('modal');
btnOpenedit.onclick = function() {
    modal.style.display = 'block';
};

// 수정 모달 닫기
var btnClose = document.getElementById('btnClose');
btnClose.onclick = function() {
    modal.style.display = 'none';
};

// 수정 완료 버튼 클릭 시 페이지 이동
var btnCheck = document.getElementById('btnCheck');
btnCheck.addEventListener("click", function() {
    var href = "/profileedit";
    window.location.href = href;
});

// 회원탈퇴 버튼 클릭 시 모달 열기
var btnOpenwith = document.getElementById('btnOpenwith');
var modal2 = document.getElementById('modal2');
btnOpenwith.onclick = function() {
    modal2.style.display = 'block';
};

// 회원탈퇴 모달 닫기
var btnClose2 = document.getElementById('btnClose2');
btnClose2.onclick = function() {
    modal2.style.display = 'none';
};

// 회원탈퇴 확인 버튼 클릭 시 페이지 이동
var btnCheck2 = document.getElementById('btnCheck2');
btnCheck2.addEventListener("click", function() {
    var href = "/withdrawal";
    window.location.href = href;
});
