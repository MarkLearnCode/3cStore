package Dao.items;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DBconnection;
import Module.Items;

public class ImplItems implements ItemsDaO {

	public static void main(String[] args) {
//		Items i = new Items("230207C006", "CPU", "I9", "13900K", "INTEL", 10, 20300);
//		new ImplItems().add(i);
//		List<Items> l = new ImplItems().queryAllList();
//		for (Items items : l) {
//			if (items.getBrand().equals("Intel")) {
//				System.out.println(items.getBrand());
//			}
//		}
//		List<Items> l = new Dao.items.ImplItems().queryItemType("SSD");
//		for (Items items : l) {
//			System.out.println(items.getBrand());
//		}

	}

	// C
	@Override
	public void add(Items I) {
		Connection conn = DBconnection.getDB();
		String SQL = "insert into items(itemID, itemType, Grade, itemName, Brand, Stock, Price) "
				+ "values(?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, I.getItemID());
			ps.setString(2, I.getItemType());
			ps.setString(3, I.getGrade());
			ps.setString(4, I.getItemName());
			ps.setString(5, I.getBrand());
			ps.setInt(6, I.getStock());
			ps.setInt(7, I.getPrice());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Read
	@Override
	public List<Items> queryAllList() {
		List<Items> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from items";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Items i = new Items();
				i.setId(rs.getInt("id"));
				i.setItemID(rs.getString("itemID"));
				i.setItemType(rs.getString("itemType"));
				i.setGrade(rs.getString("Grade"));
				i.setItemName(rs.getString("itemName"));
				i.setBrand(rs.getString("Brand"));
				i.setStock(rs.getInt("Stock"));
				i.setPrice(rs.getInt("Price"));

				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public List<Items> queryItemType(String itemType) {
		List<Items> l = new ArrayList<>();
		Connection conn = DBconnection.getDB();
		String SQL = "select * from items where itemType='" + itemType + "';";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Items i = new Items();
				i.setId(rs.getInt("id"));
				i.setItemID(rs.getString("itemID"));
				i.setItemType(rs.getString("itemType"));
				i.setGrade(rs.getString("Grade"));
				i.setItemName(rs.getString("itemName"));
				i.setBrand(rs.getString("Brand"));
				i.setStock(rs.getInt("Stock"));
				i.setPrice(rs.getInt("Price"));

				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	// UPDATE
	@Override
	public void update(Items i) {
		Connection conn = DBconnection.getDB();
		String SQL = "update items set itemID=?, itemType=?, Grade=?, itemName=?, Brand=?, Stock=?, Price=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, i.getItemID());
			ps.setString(2, i.getItemType());
			ps.setString(3, i.getGrade());
			ps.setString(4, i.getItemName());
			ps.setString(5, i.getBrand());
			ps.setInt(6, i.getStock());
			ps.setInt(7, i.getPrice());
			ps.setInt(8, i.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateStock(Items i, int stock) {
		Connection conn = DBconnection.getDB();
		String SQL = "update items set Stock=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			i.setStock(stock);
			ps.setInt(1, i.getStock());
			ps.setInt(2, i.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updatePrice(Items i, int price) {
		Connection conn = DBconnection.getDB();
		String SQL = "update items set Price=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			i.setPrice(price);
			ps.setInt(1, i.getPrice());
			ps.setInt(2, i.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteItem(String itemID) {
		Connection conn = DBconnection.getDB();
		String SQL = "delete from items where itemID=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, itemID);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
