package Dao.orders;

import java.util.List;

import Module.Orders;

public interface OrderDaO {
	// C
	void add(Orders o);

	// R

	List<Orders> queryOrderList();

	List<Orders> queryOrderID(String orderID);

	List<Orders> queryOrderUsername(String username);

	// U
	void update(Orders o);

//		void updateStock(Items I, int stock);
//
//		void updatePrice(Items I, int price);

	// D
	void deleteItem(String orderID);
}
