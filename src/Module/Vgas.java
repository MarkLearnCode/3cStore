package Module;

public class Vgas {
	private Integer ID;
	private String vgaID;
	private String vgaName;
	private String vgaBrand;
	private String vgaType;
	private Integer vgaStock;
	private Integer vgaPrice;

	public Vgas() {
		super();
	}

	public Vgas(String vgaID, String vgaName, String vgaBrand, String vgaType, Integer vgaStock, Integer vgaPrice) {
		super();
		this.vgaID = vgaID;
		this.vgaName = vgaName;
		this.vgaBrand = vgaBrand;
		this.vgaType = vgaType;
		this.vgaStock = vgaStock;
		this.vgaPrice = vgaPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getVgaID() {
		return vgaID;
	}

	public void setVgaID(String vgaID) {
		this.vgaID = vgaID;
	}

	public String getVgaName() {
		return vgaName;
	}

	public void setVgaName(String vgaName) {
		this.vgaName = vgaName;
	}

	public String getVgaBrand() {
		return vgaBrand;
	}

	public void setVgaBrand(String vgaBrand) {
		this.vgaBrand = vgaBrand;
	}

	public String getVgaType() {
		return vgaType;
	}

	public void setVgaType(String vgaType) {
		this.vgaType = vgaType;
	}

	public Integer getVgaStock() {
		return vgaStock;
	}

	public void setVgaStock(Integer vgaStock) {
		this.vgaStock = vgaStock;
	}

	public Integer getVgaPrice() {
		return vgaPrice;
	}

	public void setVgaPrice(Integer vgaPrice) {
		this.vgaPrice = vgaPrice;
	}

}
