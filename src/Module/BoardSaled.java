package Module;

public class BoardSaled {
	private Integer bsaleID;
	private String boardOutID;
	private String coID;
	private String boardID;
	private Integer bCount;

	public BoardSaled() {
		super();
	}

	public BoardSaled(String boardOutID, String coID, String boardID, Integer bCount) {
		super();
		this.boardOutID = boardOutID;
		this.coID = coID;
		this.boardID = boardID;
		this.bCount = bCount;
	}

	public Integer getBsaleID() {
		return bsaleID;
	}

	public void setBsaleID(Integer bsaleID) {
		this.bsaleID = bsaleID;
	}

	public String getBoardOutID() {
		return boardOutID;
	}

	public void setBoardOutID(String boardOutID) {
		this.boardOutID = boardOutID;
	}

	public String getCoID() {
		return coID;
	}

	public void setCoID(String coID) {
		this.coID = coID;
	}

	public String getBoardID() {
		return boardID;
	}

	public void setBoardID(String boardID) {
		this.boardID = boardID;
	}

	public Integer getbCount() {
		return bCount;
	}

	public void setbCount(Integer bCount) {
		this.bCount = bCount;
	}

}
