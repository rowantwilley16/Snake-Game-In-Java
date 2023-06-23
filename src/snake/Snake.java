package snake;
//The snake class contains the body and head of the snake. The snake is implemented with a linked list.

import java.util.LinkedList;

public class Snake {

	private LinkedList<Cell> snakePartList = new LinkedList<>(); 
	private Cell head;
	
	//constructor
	public Snake(Cell initPos) {
		head = initPos; 
		snakePartList.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}
	
	public void grow() {
		snakePartList.add(head); 
	}
	
	public void move(Cell nextCell) {
		
		System.out.println("snake is moving to " + nextCell.getRow() + " "+ nextCell.getCol());
		
		//remove the snake node from the last known tail position and reset the cellType to Empty
		Cell tail = snakePartList.removeLast(); 
		tail.setCellType(CellType.EMPTY);
		
		head = nextCell; 
		head.setCellType(CellType.SNAKE_NODE);
		snakePartList.addFirst(head);
	}
	
	public boolean crashCheck(Cell nextCell) {
		System.out.println("Going to check for crash"); 
		
		for (Cell cell: snakePartList) {
			if ( cell == nextCell) {
				return true; 
			}
		}
		return false;
	}
	
	public LinkedList<Cell> getSnakePartList(){
		return snakePartList; 
	}
	
	public void setSnakePartList(LinkedList<Cell> snakePartList) {
		this.snakePartList = snakePartList; 
	}
	
	public Cell getHead() {
		return head; 
	}
	
	public void setHead(Cell head) {
		this.head = head; 
	}
	
}
