package qwq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

public class AddNewBook extends ActionSupport {

	private String isbn;
	private String authorid;
	private String publisher;
	private String title;
	private String publishdate;
	private String price;
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublishdate() {
		return publishdate;
	}
	
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthorid() {
		return authorid;
	}
	
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String execute() throws Exception {
		String ret = ERROR;
		String URL = "jdbc:mysql://localhost/BookDB";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, "root", "12345678");
		authorid = "00000099";
		
		String sql = "insert into Book values(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, isbn);
		ps.setString(2, title);
		ps.setString(3, authorid);
		ps.setString(4, publisher);
		ps.setString(5, publishdate);
		ps.setString(6, price);
		if(ps.executeUpdate() != 0) {
			ret = SUCCESS;
		}
		
		if (conn != null) {	
			conn.close();
		}
		return ret;
	}
}