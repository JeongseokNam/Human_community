package com.human.Interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter{ //상속은 슈퍼클래스의 기능을 상속받은것이다.

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();//세션id 가져오기
		Object obj = session.getAttribute("id"); //세션에서 id를 가져옴
		if (obj == null) {
			response.sendRedirect(request.getContextPath()+"/");
			return false; // 원래 호출한 컨트롤러를 인터셉트해서 다른컨트롤러로 호출, 그러니 원래 호출컨트롤러는 false
		}
		return true; //로그인한 사람임으로 원래의 컨트롤러로 진행하라.
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	} 

}
