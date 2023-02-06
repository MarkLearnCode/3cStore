package Module;

public class Boards {
	private Integer ID;
	private String boardID;
	private String boardName;
	private String boardBrand;
	private String boardType;
	private Integer boardStock;
	private Integer boardPrice;

	public Boards() {
		super();
	}

	public Boards(String boardID, String boardName, String boardBrand, String boardType, Integer boardStock,
			Integer boardPrice) {
		super();
		this.boardID = boardID;
		this.boardName = boardName;
		this.boardBrand = boardBrand;
		this.boardType = boardType;
		this.boardStock = boardStock;
		this.boardPrice = boardPrice;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getBoardID() {
		return boardID;
	}

	public void setBoardID(String boardID) {
		this.boardID = boardID;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardBrand() {
		return boardBrand;
	}

	public void setBoardBrand(String boardBrand) {
		this.boardBrand = boardBrand;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public Integer getBoardStock() {
		return boardStock;
	}

	public void setBoardStock(Integer boardStock) {
		this.boardStock = boardStock;
	}

	public Integer getBoardPrice() {
		return boardPrice;
	}

	public void setBoardPrice(Integer boardPrice) {
		this.boardPrice = boardPrice;
	}

}
