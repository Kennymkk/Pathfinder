
public class Maze implements Explorable<Position> {
	
	public Position Start, Goal;
	char[][] map = {{'0','0','1','1','0'},{'0','0','0','1','0'},{'0','1','0','0','0'},{'0','1','1','1','1'},{'0','0','0','0','0'}};

	public Position[] GetNextSteps(Position e) {
		
		Position[] positions = new Position[4];
		
		try{
			positions[0] = map[e.i-1][e.j] == '0' ? new Position(e.i-1, e.j) : null;
			if(positions[0] != null)
				map[e.i-1][e.j] = 'x';
		}
		catch(Exception exception){
			positions[0] = null;
		}
		try{
			positions[1] = map[e.i][e.j+1] == '0' ? new Position(e.i, e.j+1) : null;
			if(positions[1] != null)
				map[e.i][e.j+1] = 'x';
		}
		catch(Exception exception){
			positions[1] = null;
		}
		try{
			positions[2] = map[e.i+1][e.j] == '0' ? new Position(e.i+1, e.j) : null;
			if(positions[2] != null)
				map[e.i+1][e.j] = 'x';
		}
		catch(Exception exception){
			positions[2] = null;
		}
		try{
			positions[3] = map[e.i][e.j-1] == '0' ? new Position(e.i, e.j-1) : null;
			if(positions[3] != null)
				map[e.i][e.j-1] = 'x';
		}
		catch(Exception exception){
			positions[3] = null;
		}
		return positions;
	}

	public boolean IsArrived(Position e) {
		if(e.i == Goal.i && e.j == Goal.j)
			return true;
		else
			return false;
	}

	public Position GetStart() {
		
		return Start;
	}
	
	void BuildMatrice(){
		
	}
}
