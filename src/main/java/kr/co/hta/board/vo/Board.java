package kr.co.hta.board.vo;

import java.sql.Date;

public class Board {

	private int no;
	private String title;
	private String nick;
	private String contents;
	private int likes;
	private String filename;
	private Date creatDate;
	
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", nick=" + nick + ", contents=" + contents + ", likes=" + likes
				+ ", filename=" + filename + ", creatDate=" + creatDate + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	
	
}
