package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.board;
import model.dto.boarddto;

/**
 * Servlet implementation class write
 */
@WebServlet("/member/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String write = request.getParameter("write");
		String content = request.getParameter("content");
		String pw = request.getParameter("pw");
		System.out.println(title+content+pw+write);
		boarddto boarddto = new boarddto(0,title,write,content,pw,null,0); 
		board board =new board();
		boolean result = board.lboard(title,write,content,pw);
		if(result) {
			System.out.println("성공");
		}
		response.getWriter().print(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
