/**
 * 
 */
// 필수입력 정규식
let reg_blank = /.{1,}/; // < . : 개행 문자를 제외한 모든 단일 문자와 대응>/시작값은 상관없음
							// 글자제한{1개이상,제한없음}
// 이름 정규식
let reg_name = /^[가-힣]+$/; // < ^ : 입력의 시작 부분에 대응>< $ : 입력의 끝 부분에 대응> / [가-힣]으로
							// 시작,끝 숫자제한x
// 아이디 정규식
let reg_id = /^[a-z0-9]{4,20}$/;// 위와 조건동일 / [a-z0-9] 으9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;로 시작,끝 {4~20}
// 이메일 정규식
let reg_mail = /^[0-9a-zA-Z]*@[0-9a-zA-Z]*.[a-zA-Z]{2,3}$/i;
// 숫자영어대소문자 시작후 <@> 필수 동일반복후 <.>필수 영대소문자2-3글자로 끝남 </i>는 대소문자 구분없다
// 설정

// 비밀번호 정규식
let reg_pw = /^[A-Za-z0-9]{4,20}$/; // 영어,숫자
let reg_pw2 = /(?=.*[a-zA-ZS])(?=.*?[#?!@$%^&*-]).{6,20}/; // 영어,

//과제용 정규식
let reg_test = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$/;

function checkAll(form) {
	if (!checkId(form.id.value)) {
		
		return false;
	} else if (!checkPw(form.pwd.value)) {
		
		return false;
	} else if (!checkName(form.name.value)) {
		
		return false;
	}
	return true;
}

function checkId(id) {
	if (!reg_blank.test(id)) {
		document.getElementById("pid").style.display = "block";
		alert("ID를 입력해 주세요");
		return false;
	} else if (!reg_test.test(id)) {
		document.getElementById("pid").style.display = "block";
		alert("ID는 영문대소문자,숫자,특수문자를 포함한 8자리 이상이어야 합니다.")
		return false;
	}
	document.getElementById("pid").style.display = "none";
	return true;
}

function checkName(name) {
	if (!reg_blank.test(name)) {
		document.getElementById("pname").style.display = "block";
		alert("이름을 입력해 주세요");
		return false;
	} else if (!reg_name.test(name)) {
		document.getElementById("pname").style.display = "block";
		alert("이름은 한글로만 입력가능합니다.")
		return false;
	}
	document.getElementById("pname").style.display = "none";
	return true;
}

function checkPw(pw) {
	if (!reg_blank.test(pw)) {
		document.getElementById("ppw").style.display = "block";
		alert("비밀번호를 입력해 주세요");
		return false;
	} else if (!reg_test.test(pw)) {
		
		alert("비밀번호는는 영문대소문자,숫자,특수문자를 포함한 8자리 이상이어야 합니다.")
		return false;
	}
	document.getElementById("ppw").style.display = "none";
	return true;
}

/*function checkEmail(mail) {
	if (!reg_blank.test(mail)) {
		alert("이메일을 입력해 주세요");
		return false;
	} else if (!reg_mail.test(mail)) {
		alert("이메일은 email@email.com 의 형식으로 입력 가능합니다.")
		return false;
	}
	return true;
}*/