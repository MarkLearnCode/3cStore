package Dao.ClientOrdar;

import java.util.List;

import Module.ClientOrder;

public interface ClientOrderDaO {
	//C
		void addOrder();
	//R
		String queryAllOrder();
		List<ClientOrder> queryAllOrderList();
		ClientOrder queryOrderID();
		
		
		
	//U
	
	//D
}
