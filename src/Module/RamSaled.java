package Module;

public class RamSaled {
	private Integer rsaleID;
	private String ramOutID;
	private String coID;
	private String ramID;
	private Integer rCount;

	public RamSaled() {
		super();
	}

	public RamSaled(String ramOutID, String coID, String ramID, Integer rCount) {
		super();
		this.ramOutID = ramOutID;
		this.coID = coID;
		this.ramID = ramID;
		this.rCount = rCount;
	}

	public Integer getRsaleID() {
		return rsaleID;
	}

	public void setRsaleID(Integer rsaleID) {
		this.rsaleID = rsaleID;
	}

	public String getRamOutID() {
		return ramOutID;
	}

	public void setRamOutID(String ramOutID) {
		this.ramOutID = ramOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getRamID() {
		return ramID;
	}

	public void setRamID(String ramID) {
		this.ramID = ramID;
	}

	public Integer getrCount() {
		return rCount;
	}

	public void setrCount(Integer rCount) {
		this.rCount = rCount;
	}

}
