package Dao.items;

import java.util.List;

import Module.Items;

public interface ItemsDaO {
	// C
	void add(Items I);

	// R

	List<Items> queryAllList();

	List<Items> queryItemType(String itemType);
	
	Items queryItemID(String itemID);

	// U
	void update(Items I);

	void updateStock(Items I, int stock);

	void updatePrice(Items I, int price);

	// D
	void deleteItem(String itemID);
}
