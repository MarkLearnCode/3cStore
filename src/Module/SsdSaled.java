package Module;

public class SsdSaled {
	private Integer ssaleID;
	private String ssdOutID;
	private String coID;
	private String ssdID;
	private Integer sCount;

	public SsdSaled() {
		super();
	}

	public SsdSaled(String ssdOutID, String coID, String ssdID, Integer sCount) {
		super();
		this.ssdOutID = ssdOutID;
		this.coID = coID;
		this.ssdID = ssdID;
		this.sCount = sCount;
	}

	public Integer getSsaleID() {
		return ssaleID;
	}

	public void setSsaleID(Integer ssaleID) {
		this.ssaleID = ssaleID;
	}

	public String getSsdOutID() {
		return ssdOutID;
	}

	public void setSsdOutID(String ssdOutID) {
		this.ssdOutID = ssdOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getSsdID() {
		return ssdID;
	}

	public void setSsdID(String ssdID) {
		this.ssdID = ssdID;
	}

	public Integer getsCount() {
		return sCount;
	}

	public void setsCount(Integer sCount) {
		this.sCount = sCount;
	}

}
