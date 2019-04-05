public class Main {

	public static void main(String[] args) {


		char[][] Laby = {{'0','0','1','1','0'}, {'0','0','0','1','0'}, {'0','1','0','0','0'}, {'0','1','1','1','1'}, {'0','0','0','0','0'}};

		MatrixMaze ExplorableMap = new MatrixMaze(Laby);

		for(Elements[] Array : ExplorableMap.ElementsMatrix)
		{
			for(Elements e : Array)
				System.out.print(e.Index);
			System.out.println();
		}

		ExplorableMap.GetNextStep(ExplorableMap.ElementsMatrix[4][4]);

	}
}