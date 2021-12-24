/**
 * 
 */

function managerCheck() {
	var view = prompt("비밀면호를 입력해 주세요", "");
	if (view == "1234") {
		location.href = "managerMain";
		return true;
	} else {
		return false;
	}
}

function deletecheck(k) {
	if (confirm("정말삭제하시겠습니까?")) {
		location.href = "delMember?no="+k;
		return true;
	} else {
		return false;
	}
}

function myPostOption(myName,postName) {
	if (myName!=postName) {
		document.getElementById('myPostDiv').className = "d-none";
	}
}

function resetComment(){  
      $("commentForm").load(window.location.href + "commentForm");
}
