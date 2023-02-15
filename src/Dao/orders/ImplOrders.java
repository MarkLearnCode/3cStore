package Dao.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Dao.DBconnection;
import Module.Orders;

public class ImplOrders implements OrderDaO {

	public static void main(String[] args) {
//		List<Orders> l = new ImplOrders().queryOrderList();
//		for (Orders o : l) {
//			System.out.println(o.getAllPrice());
//		}
//		LocalDateTime date = LocalDateTime.now();
//		Timestamp da= Timestamp.valueOf(date);
//		System.out.println("da = "+da);
//		Orders o =new Orders("cpu", da, "22", "22", "22", 11, 11);
//		new ImplOrders().add(o);
//		List<Orders> l = new ImplOrders().queryOrderDate();
//		System.out.println(l.size());
		

	}

	@Override
	public void add(Orders o) {
		Connection conn = DBconnection.getDB();
		String SQL = "insert into orders(orderID, date, username, shipAddress, contactPhone, allItems, allPrice) "
				+ "values(?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, o.getOrderID());
			ps.setTimestamp(2, o.getDate());
			ps.setString(3, o.getUsername());
			ps.setString(4, o.getShipAddress());
			ps.setString(5, o.getContactPhone());
			ps.setInt(6, o.getAllItems());
			ps.setInt(7, o.getAllPrice());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Orders> queryOrderList() {
		List<Orders> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from orders";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orders o = new Orders();
				o.setId(rs.getInt("id"));
				o.setOrderID(rs.getString("orderID"));
				o.setDate(rs.getTimestamp("date"));
				o.setUsername(rs.getString("username"));
				o.setShipAddress(rs.getString("shipAddress"));
				o.setContactPhone(rs.getString("contactPhone"));
				o.setAllItems(rs.getInt("allItems"));
				o.setAllPrice(rs.getInt("allPrice"));
				l.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public List<Orders> queryOrderID(String orderID) {
		List<Orders> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from orders where orderID='" + orderID + "';";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orders o = new Orders();
				o.setId(rs.getInt("id"));
				o.setOrderID(rs.getString("orderID"));
				o.setDate(rs.getTimestamp("date"));
				o.setUsername(rs.getString("username"));
				o.setShipAddress(rs.getString("shipAddress"));
				o.setContactPhone(rs.getString("contactPhone"));
				o.setAllItems(rs.getInt("allItems"));
				o.setAllPrice(rs.getInt("allPrice"));
				l.add(o);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public List<Orders> queryOrderUsername(String username) {
		List<Orders> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from orders where username='" + username + "';";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orders o = new Orders();
				o.setId(rs.getInt("id"));
				o.setOrderID(rs.getString("orderID"));
				o.setDate(rs.getTimestamp("date"));
				o.setUsername(rs.getString("username"));
				o.setShipAddress(rs.getString("shipAddress"));
				o.setContactPhone(rs.getString("contactPhone"));
				o.setAllItems(rs.getInt("allItems"));
				o.setAllPrice(rs.getInt("allPrice"));
				l.add(o);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}
	
	@Override
	public List<Orders> queryOrderDate() {
		String date = LocalDate.now().toString(); 
		List<Orders> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from orders where date(date)='" + date + "';";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orders o = new Orders();
				o.setId(rs.getInt("id"));
				o.setOrderID(rs.getString("orderID"));
				o.setDate(rs.getTimestamp("date"));
				o.setUsername(rs.getString("username"));
				o.setShipAddress(rs.getString("shipAddress"));
				o.setContactPhone(rs.getString("contactPhone"));
				o.setAllItems(rs.getInt("allItems"));
				o.setAllPrice(rs.getInt("allPrice"));
				l.add(o);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public void update(Orders o) {
		Connection conn = DBconnection.getDB();
		String SQL = "update orders set shipAddress=?, contactPhone=?, allItems=?, allPrice=? where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, o.getShipAddress());
			ps.setString(2, o.getContactPhone());
			ps.setInt(3, o.getAllItems());
			ps.setInt(4, o.getAllPrice());
			ps.setInt(5, o.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteItem(String orderID) {
		Connection conn = DBconnection.getDB();
		String SQL = "delete from orders where orderID=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, orderID);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
