package kr.co.bit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.bit.day4.MemberVO;

public class MyController extends HttpServlet {
	
	private ArrayList<MemberVO> list;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		list = new ArrayList<MemberVO>();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("working");
		
		String cmd = request.getParameter("cmd"); 
		cmd= cmd==null?cmd="":cmd;
		System.out.println("working");
		request.setCharacterEncoding("UTF-8");
		String url = "./mvc/home.jsp";
		
		if(cmd.equals("viewRegist")) {
			
			url = "./mvc/regist_member.jsp";
			
		} else if(cmd.equals("regist")) {
		
				
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String zip1 = request.getParameter("zip1");
		String zip2 = request.getParameter("zip2");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String tool = request.getParameter("tool");
		String project = request.getParameter("project");
		String[] langs = request.getParameterValues("lang");
		String[] temp = {"","","",""};
		for(String index : langs){
			int idx = Integer.parseInt(index);
			temp[idx] = index;
		}
		//MemberVO 데이터 클래스를 만들어서 인스턴스를 하나 생성
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setEmail(email);
		vo.setZipcode(zip1+"-"+zip2);
		vo.setAddr1(addr1);
		vo.setAddr2(addr2);
		vo.setTool(tool);
		vo.setProject(project);
		vo.setLangs(temp);
		//out.print(vo);
		list.add(vo);
		request.setAttribute("vo", vo);
		//response.sendRedirect("storage.jsp");
		url= "./mvc/home.jsp";
	}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
