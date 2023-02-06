package Module;

public class PowerSaled {
	private Integer psaleID;
	private String powerOutID;
	private String coID;
	private String powerID;
	private Integer pCount;

	public PowerSaled() {
		super();
	}

	public PowerSaled(String powerOutID, String coID, String powerID, Integer pCount) {
		super();
		this.powerOutID = powerOutID;
		this.coID = coID;
		this.powerID = powerID;
		this.pCount = pCount;
	}

	public Integer getPsaleID() {
		return psaleID;
	}

	public void setPsaleID(Integer psaleID) {
		this.psaleID = psaleID;
	}

	public String getPowerOutID() {
		return powerOutID;
	}

	public void setPowerOutID(String powerOutID) {
		this.powerOutID = powerOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getPowerID() {
		return powerID;
	}

	public void setPowerID(String powerID) {
		this.powerID = powerID;
	}

	public Integer getpCount() {
		return pCount;
	}

	public void setpCount(Integer pCount) {
		this.pCount = pCount;
	}

}
