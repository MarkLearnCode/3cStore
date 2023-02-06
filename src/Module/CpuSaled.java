package Module;

public class CpuSaled {
	private Integer csaleID;
	private String cpuOutID;
	private String coID;
	private String cpuID;
	private Integer cCount;

	public CpuSaled() {
		super();
	}

	public CpuSaled(String cpuOutID, String coID, String cpuID, Integer cCount) {
		super();
		this.cpuOutID = cpuOutID;
		this.coID = coID;
		this.cpuID = cpuID;
		this.cCount = cCount;
	}

	public Integer getCsaleID() {
		return csaleID;
	}

	public void setCsaleID(Integer csaleID) {
		this.csaleID = csaleID;
	}

	public String getCpuOutID() {
		return cpuOutID;
	}

	public void setCpuOutID(String cpuOutID) {
		this.cpuOutID = cpuOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getCpuID() {
		return cpuID;
	}

	public void setCpuID(String cpuID) {
		this.cpuID = cpuID;
	}

	public Integer getcCount() {
		return cCount;
	}

	public void setcCount(Integer cCount) {
		this.cCount = cCount;
	}

}
