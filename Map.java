public class Map {

	int[][] MapMatrix;

	public Elements[][] ElementsMatrix = new Elements[5][5];

	Map(int[][] Matrix)
	{
		MapMatrix = Matrix;
		Initialize();
	}

	private void Initialize()
	{
		for(int line = 0; line < 5; line++)
		{
			for(int column = 0; column < 5; column++)
			{
				ElementsMatrix[line][column] = new Elements(column, line, MapMatrix[line][column] == 0);
			}
		}
	}

	public Elements GetElementAtPosition(int[] pos)
	{
		return ElementsMatrix[pos[0]][pos[1]];
	}

	public Elements GetNextSteps(Elements origin)
	{
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
		return null;
	}
}