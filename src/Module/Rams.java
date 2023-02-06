package Module;

public class Rams {
	private Integer ID;
	private String ramID;
	private String ramName;
	private String ramBrand;
	private String ramType;
	private Integer ramStock;
	private Integer ramPrice;

	public Rams() {
		super();
	}

	public Rams(String ramID, String ramName, String ramBrand, String ramType, Integer ramStock, Integer ramPrice) {
		super();
		this.ramID = ramID;
		this.ramName = ramName;
		this.ramBrand = ramBrand;
		this.ramType = ramType;
		this.ramStock = ramStock;
		this.ramPrice = ramPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getRamID() {
		return ramID;
	}

	public void setRamID(String ramID) {
		this.ramID = ramID;
	}

	public String getRamName() {
		return ramName;
	}

	public void setRamName(String ramName) {
		this.ramName = ramName;
	}

	public String getRamBrand() {
		return ramBrand;
	}

	public void setRamBrand(String ramBrand) {
		this.ramBrand = ramBrand;
	}

	public String getRamType() {
		return ramType;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public Integer getRamStock() {
		return ramStock;
	}

	public void setRamStock(Integer ramStock) {
		this.ramStock = ramStock;
	}

	public Integer getRamPrice() {
		return ramPrice;
	}

	public void setRamPrice(Integer ramPrice) {
		this.ramPrice = ramPrice;
	}

}
