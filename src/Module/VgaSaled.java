package Module;

public class VgaSaled {
	private Integer vsaleID;
	private String vgaOutID;
	private String coID;
	private String vgaID;
	private Integer vCount;

	public VgaSaled() {
		super();
	}

	public VgaSaled(String vgaOutID, String coID, String vgaID, Integer vCount) {
		super();
		this.vgaOutID = vgaOutID;
		this.coID = coID;
		this.vgaID = vgaID;
		this.vCount = vCount;
	}

	public Integer getVsaleID() {
		return vsaleID;
	}

	public void setVsaleID(Integer vsaleID) {
		this.vsaleID = vsaleID;
	}

	public String getVgaOutID() {
		return vgaOutID;
	}

	public void setVgaOutID(String vgaOutID) {
		this.vgaOutID = vgaOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getVgaID() {
		return vgaID;
	}

	public void setVgaID(String vgaID) {
		this.vgaID = vgaID;
	}

	public Integer getvCount() {
		return vCount;
	}

	public void setvCount(Integer vCount) {
		this.vCount = vCount;
	}

}
