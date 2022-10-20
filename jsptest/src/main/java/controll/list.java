package controll;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.board;
import model.dto.boarddto;

/**
 * Servlet implementation class list
 */
@WebServlet("/board/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); 
		board dao = new board();
		System.out.println(1);
		ArrayList<boarddto>list = dao.view();
		JSONArray array = new JSONArray();
		
		for(int i = 0 ; i<list.size(); i++) {
			JSONObject object = new JSONObject();
			object.put("no", list.get(i).getL_no());
			object.put("title", list.get(i).getL_title());
			object.put("wrtier", list.get(i).getL_wrtier());
			object.put("date", list.get(i).getL_date());
			array.add(object);
			
		}
		System.out.println(array);
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().print( array );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static void add(boarddto boarddto) {
		// TODO Auto-generated method stub
		
	}

}
