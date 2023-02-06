package Dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DBconnection;
import Module.Member;

public class ImplMember implements MemberDaO {

	public static void main(String[] args) {
		// Create
//		Member m = new Member("testuser", "just", "haha@mail", "jack", "0966111222", "taipei");
//		new ImplMember().add(m);

		// read
//		String all = new ImplMember().queryAll();
//		System.out.println(all);

//		List<Member> list = new ImplMember().queryAllList();
//		System.out.println(list);
//		for (Member member : list) {
//			System.out.println(member.getName());
//		}
//		Member m = new ImplMember().queryUsername("mark");
//		System.out.println(m.getName());

		// update
//		m.setAddress("高雄");
//		m.setEmail("ppoo@mail");
//		m.setPassword("abcd");
//		new ImplMember().updatePwd(m);
//		System.out.println(m.getPassword());

		// delete
//		new ImplMember().delete("aaaa");

	}

	// Create
	// Create
	@Override
	public void add(Member m) {
		Connection conn = DBconnection.getDB();
		String SQL = "insert into member(username,password,email,name,phone,address) " + "values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getUsername());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getName());
			ps.setString(5, m.getUsername());
			ps.setString(6, m.getUsername());

			ps.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Read

	// read
	@Override
	public String queryAll() {
		Connection conn = DBconnection.getDB();
		String SQL = "select * from member";
		String show = "";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				show = show + "ID: " + rs.getInt("userid") + " 會員帳號: " + rs.getString("username") + " E-mail: "
						+ rs.getString("email") + " 姓名: " + rs.getString("name") + " 電話: " + rs.getString("phone")
						+ " 地址: " + rs.getString("address") + "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public List<Member> queryAllList() {
		Connection conn = DBconnection.getDB();
		String SQL = "select * from member";
		List<Member> l = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Member m = new Member();
				m.setId(rs.getInt("userID"));
				m.setUsername(rs.getString("username"));
				m.setEmail(rs.getString("email"));
				m.setName(rs.getString("name"));
				m.setPhone(rs.getString("phone"));
				m.setAddress(rs.getString("address"));

				l.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public Member queryUsername(String username) {
		Connection conn = DBconnection.getDB();
		String SQL = "select * from member where username=?";
		Member m = new Member();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				m.setId(rs.getInt("userID"));
				m.setUsername(rs.getString("username"));
				m.setEmail(rs.getString("email"));
				m.setName(rs.getString("name"));
				m.setPhone(rs.getString("phone"));
				m.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return m;
	}

	// update
	@Override
	public void update(Member m) {
		Connection conn = DBconnection.getDB();
		String SQL = "update member set email= ? ,name = ?, phone = ?, address=? " + "where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getName());
			ps.setString(3, m.getPhone());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getUsername());

			ps.executeUpdate();
			System.out.println("update success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updatePwd(Member m) {
		Connection conn = DBconnection.getDB();
		String SQL = "update member set password=? where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getPassword());
//			System.out.println("ps = " + m.getPassword());
			ps.setString(2, m.getUsername());

			ps.executeUpdate();
			System.out.println("update pwd success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// delete
	@Override
	public void delete(String username) {
		Connection conn = DBconnection.getDB();
		String SQL = "delete from member where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.executeUpdate();
			System.out.println("delete success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
