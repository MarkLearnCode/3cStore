package Dao.itemsOut;

import java.util.List;

import Module.ItemsOut;

public interface ItemsOutDaO {
	// C
	void add(ItemsOut i);

	// R

	List<ItemsOut> queryAllList();

	List<ItemsOut> queryItemOutOrder(String orderID);

	// U
	void update(ItemsOut I);
//
//		void updateStock(Items I, int stock);
//
//		void updatePrice(Items I, int price);

	// D
	void deleteItem(String itemsOutID);
}
