package Module;

public class Powers {
	private Integer ID;
	private String powerID;
	private String powerName;
	private String powerBrand;
	private String powerType;
	private Integer powerStock;
	private Integer powerPrice;

	public Powers() {
		super();
	}

	public Powers(String powerID, String powerName, String powerBrand, String powerType, Integer powerStock,
			Integer powerPrice) {
		super();
		this.powerID = powerID;
		this.powerName = powerName;
		this.powerBrand = powerBrand;
		this.powerType = powerType;
		this.powerStock = powerStock;
		this.powerPrice = powerPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getPowerID() {
		return powerID;
	}

	public void setPowerID(String powerID) {
		this.powerID = powerID;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getPowerBrand() {
		return powerBrand;
	}

	public void setPowerBrand(String powerBrand) {
		this.powerBrand = powerBrand;
	}

	public String getPowerType() {
		return powerType;
	}

	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	public Integer getPowerStock() {
		return powerStock;
	}

	public void setPowerStock(Integer powerStock) {
		this.powerStock = powerStock;
	}

	public Integer getPowerPrice() {
		return powerPrice;
	}

	public void setPowerPrice(Integer powerPrice) {
		this.powerPrice = powerPrice;
	}

}
