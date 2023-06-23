package snake;

public class Cell {

	//instance variables 
	private final int row; 
	private final int col; 
	private CellType cellType;
	
	//constructor for the Cell Class
	public Cell(int row,int col) {
		this.row = row; 
		this.col = col; 
	}
	//getters and setter methods 
	public int getRow() {
		return row; 
	}
	public int getCol() { 
		return col; 
	}
	public void setCellType(CellType cellType) {
		this.cellType = cellType; 
	}
	public CellType getCellType() {
		return cellType; 
	}
	
}
