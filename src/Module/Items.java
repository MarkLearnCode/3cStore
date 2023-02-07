package Module;

public class Items {
	private Integer id;
	private String itemID;
	private String itemType;
	private String grade;
	private String itemName;
	private String brand;
	private Integer stock;
	private Integer price;

	public Items() {
		super();
	}

	public Items(String itemID, String itemType, String grade, String itemName, String brand, Integer stock,
			Integer price) {
		super();
		this.itemID = itemID;
		this.itemType = itemType;
		this.grade = grade;
		this.itemName = itemName;
		this.brand = brand;
		this.stock = stock;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
