package kr.co.hta.board.vo;

import java.sql.Date;

public class User {

	private String id;
	private String pwd;
	private String name;
	private Date createDate;
	
	@Override
	public String toString() {
		return "User [user=" + id + ", pwd=" + pwd + ", name=" + name + ", createDate=" + createDate + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
