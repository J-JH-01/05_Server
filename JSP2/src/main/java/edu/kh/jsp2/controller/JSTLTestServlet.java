package edu.kh.jsp2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/test")
public class JSTLTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// c:forEach 연습을 위한 List 생성
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("지환");
		nameList.add("준희");
		nameList.add("상곤");
		nameList.add("화영");
		nameList.add("인규");
		nameList.add("와티");
		nameList.add("퉁퉁");
		nameList.add("쇼지");
		nameList.add("켄켄");
		nameList.add("요시로");
		nameList.add("재민");
		
		
		// request scope (현재 Servlet -> 위임된 JSP까지 유지)
		// 객체 속성으로 List를 세팅
		req.setAttribute("nameList", nameList);
		// req에 키밸류로 담아서 전달
		
		// 요청 처리
		
	// -------------
		
	// 응답 처리
		
	//webapp 폴더 기준
	String path = "/WEB-INF/views/jstl/test.jsp";
	// 요청 발송자 + 요청 위임까지 한번에 메서드체이닝으로 쓴것
	req.getRequestDispatcher(path).forward(req, resp);
		
	}
	
	
}
