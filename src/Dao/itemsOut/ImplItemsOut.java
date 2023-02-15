package Dao.itemsOut;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Dao.DBconnection;
import Dao.orders.ImplOrders;
import Module.ItemsOut;
import Module.Orders;

public class ImplItemsOut implements ItemsOutDaO {

	public static void main(String[] args) {
//		List<ItemsOut> l = new ImplItemsOut().queryItemOutOrder("230205ORD001");
//		for (ItemsOut i : l) {
//			System.out.println("id= " + i.getItemID() + " count= " + i.getCount() + " price= " + i.getPrice());
		
//		System.out.println(new ImplItemsOut().queryItemOutOrderBydate().size());
			
//		ItemsOut it = new ItemsOut("test", null, null, null, null, null, null);
//		new ImplItemsOut().add(it);
		
//		System.out.println(new ImplItemsOut().queryItemOutOrderBydate().size());
		
		List<Orders> or = new ImplOrders().queryOrderUsername("xxxx");
		System.out.println(or.size());
		
		
//		List<ItemsOut> itemsOutData = new ImplItemsOut().queryItemOutOrder("230215ORD011");
		List<ItemsOut> itemsOutData = new ArrayList<>();
//		for (ItemsOut i : itemsOutData) {
//			System.out.println(i.getItemID());
//		}
		for (Orders o : or) {
			itemsOutData.addAll(new ImplItemsOut().queryItemOutOrder(o.getOrderID()));
			System.out.println(itemsOutData.size());
		}
			
		
//		List<Orders> order = new ImplOrders().queryOrderUsername(m.getUsername());
		
	}

	// C
	@Override
	public void add(ItemsOut i) {
		Connection conn = DBconnection.getDB();
		String SQL = "insert into itemsout(orderID, shipDate, itemOutID, itemID, count, price, allPrice) "
				+ "values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, i.getOrderID());
			ps.setTimestamp(2, i.getDate());
			ps.setString(3, i.getItemOutID());
			ps.setString(4, i.getItemID());
			ps.setInt(5, i.getCount());
			ps.setInt(6, i.getPrice());
			ps.setInt(7, i.getAllPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// R
	@Override
	public List<ItemsOut> queryAllList() {
		List<ItemsOut> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from itemsOut";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			ItemsOut i = new ItemsOut();
			while (rs.next()) {
				i.setId(rs.getInt("id"));
				i.setOrderID(rs.getString("orderID"));
				i.setDate(rs.getTimestamp("shipDate"));
				i.setItemOutID(rs.getString("itemOutID"));
				i.setItemID(rs.getString("itemID"));
				i.setCount(rs.getInt("count"));
				i.setPrice(rs.getInt("price"));
				i.setAllPrice(rs.getInt("allPrice"));

				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public List<ItemsOut> queryItemOutOrder(String orderID) {
		List<ItemsOut> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from itemsOut where orderID='" + orderID + "';";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemsOut i = new ItemsOut();
				i.setId(rs.getInt("id"));
				i.setOrderID(rs.getString("orderID"));
				i.setDate(rs.getTimestamp("shipDate"));
				i.setItemOutID(rs.getString("itemOutID"));
				i.setItemID(rs.getString("itemID"));
				i.setCount(rs.getInt("count"));
				i.setPrice(rs.getInt("price"));
				i.setAllPrice(rs.getInt("allPrice"));

				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}
	
	@Override
	public List<ItemsOut> queryItemOutOrderBydate() {
		String date = LocalDate.now().toString(); 
		List<ItemsOut> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from itemsOut where DATE(shipDate)='" + date + "';";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemsOut i = new ItemsOut();
				i.setId(rs.getInt("id"));
				i.setOrderID(rs.getString("orderID"));
				i.setDate(rs.getTimestamp("shipDate"));
				i.setItemOutID(rs.getString("itemOutID"));
				i.setItemID(rs.getString("itemID"));
				i.setCount(rs.getInt("count"));
				i.setPrice(rs.getInt("price"));
				i.setAllPrice(rs.getInt("allPrice"));

				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}
	
	// U
	@Override
	public void update(ItemsOut i) {
		Connection conn = DBconnection.getDB();
		String SQL = "update ItemsOut set itemID=?, count=?,price=?,allPrice=?";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, i.getItemID());
			ps.setInt(2, i.getCount());
			ps.setInt(3, i.getPrice());
			ps.setInt(4, i.getAllPrice());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// D
	@Override
	public void deleteItem(String itemsOutID) {
		Connection conn = DBconnection.getDB();
		String SQL = "delete from ItemsOut where itemOutID=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, itemsOutID);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
}
