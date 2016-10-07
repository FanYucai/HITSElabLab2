package qwq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteBook extends ActionSupport {

	private String id;
	private String title;

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title ;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		String ret = ERROR;
//		String ret = SUCCESS;
		String URL = "jdbc:mysql://localhost/BookDB";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, "root", "12345678");
		String sqlisbn = "SELECT ISBN FROM Book WHERE Title=?";
		PreparedStatement psisbn = conn.prepareStatement(sqlisbn);
		psisbn.setString(1, id);		
		title = id;
		ResultSet rs=psisbn.executeQuery();
		if(rs.next()) {
			id = rs.getString(1);
		}
		
		String sql = "DELETE FROM Book WHERE ISBN=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("成功删除"+ps.executeUpdate()+"条数据");
//		ResultSet rs = ps.executeQuery();

		return SUCCESS;
	}
}