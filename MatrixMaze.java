public class MatrixMaze implements Explorable {

	String FileName;
	double height;
	double width;
	char[][] Map;
	Elements StartPosition;
	Elements GoalPosition;

	public Elements[][] ElementsMatrix = new Elements[5][5];

	public MatrixMaze(char[][] maze)
	{
		this.Map = maze;
		BuildMatrice();
	}

	private void BuildMatrice()
	{
		for(int line = 0; line < 5; line++)
		{
			for(int column = 0; column < 5; column++)
				ElementsMatrix[line][column] = new Elements(column, line, Map[line][column] == '0');
		}
	}




	@Override
	public Elements GetNextStep(Elements origin) {
		try{
			if(ElementsMatrix[origin.y-1][origin.x].isWalkable && ElementsMatrix[origin.y-1][origin.x].Index == "")
			{
				ElementsMatrix[origin.y-1][origin.x].Index = origin.Index + "1";
				return ElementsMatrix[origin.y-1][origin.x];
			}
			else if(ElementsMatrix[origin.y][origin.x+1].isWalkable && ElementsMatrix[origin.y-1][origin.x].Index == "")
			{
				ElementsMatrix[origin.y][origin.x+1].Index = origin.Index + "2";
				return ElementsMatrix[origin.y][origin.x+1];
			}
			else if(ElementsMatrix[origin.y+1][origin.x].isWalkable && ElementsMatrix[origin.y-1][origin.x].Index == "")
			{
				ElementsMatrix[origin.y+1][origin.x].Index = origin.Index + "3";
				return ElementsMatrix[origin.y+1][origin.x];
			}
			else if(ElementsMatrix[origin.y][origin.x-1].isWalkable && ElementsMatrix[origin.y-1][origin.x].Index == "")
			{
				ElementsMatrix[origin.y][origin.x-1].Index = origin.Index + "4";
				return ElementsMatrix[origin.y][origin.x-1];
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Out of bounds pointer");
			return null;
		}
		catch (Exception e) {
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	         return null;
		}
	}
	@Override
	public void MarkElement(Elements el) {

	}


	@Override
	public Elements GetStart() {
		// TODO Auto-generated method stub
		return StartPosition;
	}
	@Override
	public Elements GetGoal() {
		// TODO Auto-generated method stub
		return GoalPosition;
	}
}