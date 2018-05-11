package node;

/**
 * @author Will
 * Grid_Node is an Object that will be checked
 */

public class Grid_Node {
	protected int DIM = 15;
	
	private int x;
	private int y;
	
	Grid_Node node_s;
	Grid_Node node_e;
	private Grid_Node parent;
	
	public Grid_Node(int x, int y, int DIM) {
		this.x = x;
		this.y = y;
		this.DIM = DIM;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Grid_Node getParent() {
		return parent;
	}

	public void setParent(Grid_Node parent) {
		this.parent = parent;
	}
	
	public int getDIM() {
		return DIM;
	}
	
	public boolean is_equal() {
		if(node_s.getX() == node_e.getX() && node_s.getY() == node_e.getY()) {
			return true;
		} 
		
		return false;
	} 
}