package Module;

public class ItemsOut {
	private Integer id;
	private String orderID;
	private String itemOutID;
	private String itemID;
	private Integer count;
	private Integer price;
	private Integer allPrice;

	public ItemsOut() {
		super();
	}

	public ItemsOut(String orderID, String itemOutID, String itemID, Integer count, Integer price, Integer allPrice) {
		super();
		this.orderID = orderID;
		this.itemOutID = itemOutID;
		this.itemID = itemID;
		this.count = count;
		this.price = price;
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

	public String getItemOutID() {
		return itemOutID;
	}

	public void setItemOutID(String itemOutID) {
		this.itemOutID = itemOutID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getAllPrice() {
		return allPrice;
	}

	public void setAllPrice(Integer allPrice) {
		this.allPrice = allPrice;
	}

}
