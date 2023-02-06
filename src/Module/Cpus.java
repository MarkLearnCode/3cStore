package Module;

public class Cpus {
	private Integer ID;
	private String cpuID;
	private String cpuName;
	private String cpuBrand;
	private String cpuType;
	private Integer cpuStock;
	private Integer cpuPrice;

	public Cpus() {
		super();
	}

	public Cpus(String cpuID, String cpuName, String cpuBrand, String cpuType, Integer cpuStock, Integer cpuPrice) {
		super();
		this.cpuID = cpuID;
		this.cpuName = cpuName;
		this.cpuBrand = cpuBrand;
		this.cpuType = cpuType;
		this.cpuStock = cpuStock;
		this.cpuPrice = cpuPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getCpuID() {
		return cpuID;
	}

	public void setCpuID(String cpuID) {
		this.cpuID = cpuID;
	}

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public Integer getCpuStock() {
		return cpuStock;
	}

	public void setCpuStock(Integer cpuStock) {
		this.cpuStock = cpuStock;
	}

	public Integer getCpuPrice() {
		return cpuPrice;
	}

	public void setCpuPrice(Integer cpuPrice) {
		this.cpuPrice = cpuPrice;
	}

}
