package Module;

public class Ssds {
	private Integer ID;
	private String ssdID;
	private String ssdName;
	private String ssdBrand;
	private String ssdType;
	private Integer ssdStock;
	private Integer ssdPrice;

	public Ssds() {
		super();
	}

	public Ssds(String ssdID, String ssdName, String ssdBrand, String ssdType, Integer ssdStock, Integer ssdPrice) {
		super();
		this.ssdID = ssdID;
		this.ssdName = ssdName;
		this.ssdBrand = ssdBrand;
		this.ssdType = ssdType;
		this.ssdStock = ssdStock;
		this.ssdPrice = ssdPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getSsdID() {
		return ssdID;
	}

	public void setSsdID(String ssdID) {
		this.ssdID = ssdID;
	}

	public String getSsdName() {
		return ssdName;
	}

	public void setSsdName(String ssdName) {
		this.ssdName = ssdName;
	}

	public String getSsdBrand() {
		return ssdBrand;
	}

	public void setSsdBrand(String ssdBrand) {
		this.ssdBrand = ssdBrand;
	}

	public String getSsdType() {
		return ssdType;
	}

	public void setSsdType(String ssdType) {
		this.ssdType = ssdType;
	}

	public Integer getSsdStock() {
		return ssdStock;
	}

	public void setSsdStock(Integer ssdStock) {
		this.ssdStock = ssdStock;
	}

	public Integer getSsdPrice() {
		return ssdPrice;
	}

	public void setSsdPrice(Integer ssdPrice) {
		this.ssdPrice = ssdPrice;
	}

}
