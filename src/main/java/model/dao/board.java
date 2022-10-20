package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import controll.list;
import model.dto.boarddto;

public class board {
	Connection con;	PreparedStatement ps;	ResultSet rs;
	public  board() {
		try { 
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsptest", 
					"root",
					"1234");
	
	}catch (Exception e) { System.out.println(e);}
		
	}	
	
	public ArrayList<boarddto>view() {
		ArrayList<boarddto>list = new ArrayList<>();
		String sql = "select *from board";
		try { 
		
			 ps = con.prepareStatement(sql);
			 rs = ps.executeQuery();
			
			 while(rs.next()) {
				 boarddto boarddto = new boarddto(
						 rs.getInt(1),rs.getString(2),
							rs.getString(3),rs.getString(4),
							rs.getString(5),rs.getString(6),
							rs.getInt(7));
						 list.add(boarddto);
			
			 }return list;
			
			 
		}catch (Exception e) { System.out.println(e);}
		return list;
	}

	public boolean lboard(String title, String write, String content, String pw) {
		String sql = "insert into board(l_title,l_content,l_wrtier,l_pw) values(?,?,?,?)";
		 
		try { ps = con.prepareStatement(sql);
		 ps.setString(1, title);
		 ps.setString(2, write);
		 ps.setString(3, content);
		 ps.setString(4, pw);
		 ps.executeUpdate();
		 
			return true;
			
		} catch (Exception e) {
				System.out.println(e);
		}
		return false;
	}
	
}
