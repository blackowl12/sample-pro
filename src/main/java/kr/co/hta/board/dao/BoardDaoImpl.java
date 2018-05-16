package kr.co.hta.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.hta.board.vo.Board;
import kr.co.hta.board.vo.User;
import java.sql.ResultSet;

//@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private JdbcTemplate t;
	
	private RowMapper<Board> rowMapper =new RowMapper<Board>(){
		public Board mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
			Board board = new Board();
			board.setNo(rs.getInt("no"));
			board.setTitle(rs.getString("title"));
			board.setNick(rs.getString("nick"));
			board.setContents(rs.getString("contents"));
			board.setLikes(rs.getInt("likes"));
			board.setFilename(rs.getString("filename"));
			board.setCreatDate(rs.getDate("create_date"));
			return board;
		}
	};
	
	@Override
	public void addBoard(Board board) {
		String sql = "insert into simple_board(no, title, nick, contents, filename)"
				+ " values(board_seq.nextval,?,?,?,?)";
		t.update(sql,board.getTitle(), board.getNick(), board.getContents(), board.getFilename());
	}
	@Override
	public List<Board> getBoards() {
		String sql = "select * from simple_board order by no desc";
		return t.query(sql, rowMapper);
	}
	@Override
	public Board getBoardByNo(int boardNo) {
		String sql = "select * from simple_board where no = ?";
		return t.queryForObject(sql, rowMapper, boardNo);
	}
	@Override
	public void deleteBoardByNo(int boardNo) {
		String sql = "delete from simple_board where no = ?";
		t.update(sql,boardNo);
	}
}
