
public class Player {
	private char name;
	private int points;
	private int set;
	private int game;
	public Player(char name,int points,int set,int game)
	{
		this.name=name;
		this.points=points;
		this.set=set;
		this.game=game;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getSet() {
		return set;
	}
	public void setSet(int set) {
		this.set = set;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	public void incrementPoints()
	{
		this.points=this.points+1;
	}
	public void incrementGames()
	{
		this.game++;
	}
	public void incrementSets()
	{
		this.set++;
	}
	

}
