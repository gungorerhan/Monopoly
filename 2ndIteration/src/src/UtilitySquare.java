public class UtilitySquare extends Square {
	private int cost;
	private int rent;
	private int owner;
	public UtilitySquare(int squareLocation,String name,int cost) {
		super(squareLocation,name,cost);
		this.cost = cost;
		this.rent = -1;
		this.owner = -1;
	}

}