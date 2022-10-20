package model.dto;

public class boarddto {

	
	
	private int l_no;
	private  String	l_title ;
	private	String l_content ;
	private String	l_wrtier ;
	private	String l_pw ;
	private	String l_date;
	private  int l_view;
	
	public boarddto(int l_no, String l_title, String l_content, String l_wrtier, String l_pw, String l_date,
			int l_view) {
		super();
		this.l_no = l_no;
		this.l_title = l_title;
		this.l_content = l_content;
		this.l_wrtier = l_wrtier;
		this.l_pw = l_pw;
		this.l_date = l_date;
		this.l_view = l_view;
	}
	
	@Override
	public String toString() {
		return "boarddto [l_no=" + l_no + ", l_title=" + l_title + ", l_content=" + l_content + ", l_wrtier=" + l_wrtier
				+ ", l_pw=" + l_pw + ", l_date=" + l_date + ", l_view=" + l_view + "]";
	}
	
	public boarddto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getL_no() {
		return l_no;
	}
	public void setL_no(int l_no) {
		this.l_no = l_no;
	}
	public String getL_title() {
		return l_title;
	}
	public void setL_title(String l_title) {
		this.l_title = l_title;
	}
	public String getL_content() {
		return l_content;
	}
	public void setL_content(String l_content) {
		this.l_content = l_content;
	}
	public String getL_wrtier() {
		return l_wrtier;
	}
	public void setL_wrtier(String l_wrtier) {
		this.l_wrtier = l_wrtier;
	}
	public String getL_pw() {
		return l_pw;
	}
	public void setL_pw(String l_pw) {
		this.l_pw = l_pw;
	}
	public String getL_date() {
		return l_date;
	}
	public void setL_date(String l_date) {
		this.l_date = l_date;
	}
	public int getL_view() {
		return l_view;
	}
	public void setL_view(int l_view) {
		this.l_view = l_view;
	}
	
	
	
	
	
	
}
