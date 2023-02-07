package Module;

public class ClientOrder {
	private Integer orderID;
	private String coID;
	private String username;
	private String shipAddress;
	private String contactPhone;
	private Integer allItems;
	private Integer allPrice;
	
	public ClientOrder() {
		super();
	}

	public ClientOrder(String coID, String username, String shipAddress, String contactPhone, Integer allItems,
			Integer allPrice) {
		super();
		this.coID = coID;
		this.username = username;
		this.shipAddress = shipAddress;
		this.contactPhone = contactPhone;
		this.allItems = allItems;
		this.allPrice = allPrice;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
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
