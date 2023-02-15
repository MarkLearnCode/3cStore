package Dao.OtherFunction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Dao.items.ImplItems;
import Dao.itemsOut.ImplItemsOut;
import Dao.orders.ImplOrders;
import Module.Items;
import Module.ItemsOut;
import Module.Orders;

public class AutoID {
	 
	 
	 public static String orderAutoID() {
		 List<Orders> orderID = new ImplOrders().queryOrderDate();
		 String ID = ""; 
		 LocalDateTime now = LocalDateTime.now();
		 ID = now.toString();
		 ID = ID.replace("-", "");
		 ID = ID.substring(2,8);
		 ID = ID + "ORD";
		 if(orderID.size()==0) {
			 ID = ID + "001";
			 System.out.println(ID);
			 return ID;
		 }else if(orderID.size()>0 && orderID.size()<=9) {
			 ID = ID +"00"+ (orderID.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(orderID.size()>9 && orderID.size()<=99) {
			 ID = ID +"0"+ (orderID.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(orderID.size()>99 && orderID.size()<=999) {
			 ID = ID +(orderID.size()+1);
			// orderID.add(ID);
			// System.out.println(ID);
			 return ID;
		 }
			 return "error";
	 }
	 
	 
	 public static String itemsAutoID(String type) {
		 List<Items> items = new ImplItems().queryItemType(type);
		 String ID = ""; 
		 LocalDateTime now = LocalDateTime.now();
		 ID = now.toString();
		 ID = ID.replace("-", "");
		 ID = ID.substring(2,8);
		 ID = ID + type.substring(0,1);
		 if(items.size()==0) {
			 ID = ID + "001";
			 System.out.println(ID);
			 return ID;
		 }else if(items.size()>0 && items.size()<=9) {
			 ID = ID +"00"+ (items.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(items.size()>9 && items.size()<=99) {
			 ID = ID +"0"+ (items.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(items.size()>99 && items.size()<=999) {
			 ID = ID +(items.size()+1);
			// orderID.add(ID);
			// System.out.println(ID);
			 return ID;
		 }
			 return "error";
	 }
	 
	 public static String itemOutAutoID() {
		 List<ItemsOut> itemsOutID =new ImplItemsOut().queryItemOutOrderBydate();
		 String ID = ""; 
		 LocalDateTime now = LocalDateTime.now();
		 ID = now.toString();
		 ID = ID.replace("-", "");
		 ID = ID.substring(2,8);
		 ID = ID + "OUT";
		 if(itemsOutID.size()==0) {
			 ID = ID + "001";
			 System.out.println(ID);
			 return ID;
		 }else if(itemsOutID.size()>0 && itemsOutID.size()<=9) {
			 ID = ID +"00"+ (itemsOutID.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(itemsOutID.size()>9 && itemsOutID.size()<=99) {
			 ID = ID +"0"+ (itemsOutID.size()+1);
			 System.out.println(ID);
			 return ID;
		 }else if(itemsOutID.size()>99 && itemsOutID.size()<=999) {
			 ID = ID +(itemsOutID.size()+1);
			// orderID.add(ID);
			// System.out.println(ID);
			 return ID;
		 }
			 return "error";
	 }
	 
	 
	 
	 public static void main(String[] args) {
//		 String x = AutoID.itemsAutoID("CPU");
//		 System.out.println(x);
//		 System.out.println(AutoID.itemOutAutoID());
		 System.out.println(orderAutoID()); 
	}
}
