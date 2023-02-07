package Module;

public class Orders {
	private Integer id;
	private String orderID;
	private String username;
	private String shipAddress;
	private String contactPhone;
	private Integer allItems;
	private Integer allPrice;

	public Orders() {
		super();
	}

	public Orders(String orderID, String username, String shipAddress, String contactPhone, Integer allItems,
			Integer allPrice) {
		super();
		this.orderID = orderID;
		this.username = username;
		this.shipAddress = shipAddress;
		this.contactPhone = contactPhone;
		this.allItems = allItems;
		this.allPrice = allPrice;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getorderID() {
		return orderID;
	}

	public void setorderID(String orderID) {
		this.orderID = orderID;
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
