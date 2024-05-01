function agreeCheck(frm){
           if (frm.checkButton.disabled==true)
            frm.checkButton.disabled=false
           else
            frm.checkButton.disabled=true
}

var checkButton = document.getElementById('checkButton');
checkButton.addEventListener("click", function() {
 var href = "/main";
 window.location.href = href;
});