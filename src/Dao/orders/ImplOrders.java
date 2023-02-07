package Dao.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	}

	@Override
	public void add(Orders o) {
		Connection conn = DBconnection.getDB();
		String SQL = "insert into orders(orderID, username, shipAddress, contactPhone, allItems, allPrice) "
				+ "values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, o.getorderID());
			ps.setString(2, o.getUsername());
			ps.setString(3, o.getShipAddress());
			ps.setString(4, o.getContactPhone());
			ps.setInt(5, o.getAllItems());
			ps.setInt(6, o.getAllPrice());

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
				o.setid(rs.getInt("id"));
				o.setorderID(rs.getString("orderID"));
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
				o.setid(rs.getInt("id"));
				o.setorderID(rs.getString("orderID"));
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
		String SQL = "select * from orders where Orders='" + username + "';";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Orders o = new Orders();
				o.setid(rs.getInt("id"));
				o.setorderID(rs.getString("orderID"));
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
			ps.setInt(5, o.getid());
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
