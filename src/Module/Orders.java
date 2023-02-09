package Module;

<<<<<<< HEAD
import java.sql.Timestamp;

public class Orders {
	private Integer id;
	private String orderID;
	private Timestamp date;
=======
<<<<<<< HEAD:src/Module/Clientorder.java
public class ClientOrder {
	private Integer orderID;
	private String coID;
=======
public class Orders {
	private Integer id;
	private String orderID;
>>>>>>> 6417b660980ae9c944e43e0344c881e8b9d16fe5:src/Module/Orders.java
>>>>>>> 6224c685310dbdd9d8e5df056f774f26d801d707
	private String username;
	private String shipAddress;
	private String contactPhone;
	private Integer allItems;
	private Integer allPrice;
<<<<<<< HEAD:src/Module/Clientorder.java
	
	public ClientOrder() {
		super();
	}

	public ClientOrder(String coID, String username, String shipAddress, String contactPhone, Integer allItems,
=======

	public Orders() {
		super();
	}

<<<<<<< HEAD
	public Orders(String orderID, Timestamp date, String username, String shipAddress, String contactPhone,
			Integer allItems, Integer allPrice) {
=======
	public Orders(String orderID, String username, String shipAddress, String contactPhone, Integer allItems,
>>>>>>> 6417b660980ae9c944e43e0344c881e8b9d16fe5:src/Module/Orders.java
			Integer allPrice) {
>>>>>>> 6224c685310dbdd9d8e5df056f774f26d801d707
		super();
		this.orderID = orderID;
		this.date = date;
		this.username = username;
		this.shipAddress = shipAddress;
		this.contactPhone = contactPhone;
		this.allItems = allItems;
		this.allPrice = allPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Integer getAllItems() {
		return allItems;
	}

	public void setAllItems(Integer allItems) {
		this.allItems = allItems;
	}

	public Integer getAllPrice() {
		return allPrice;
	}

	public void setAllPrice(Integer allPrice) {
		this.allPrice = allPrice;
	}

}
