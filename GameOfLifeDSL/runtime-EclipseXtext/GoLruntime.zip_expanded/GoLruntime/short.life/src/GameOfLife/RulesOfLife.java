	package GameOfLife;

	import java.awt.Point;
	import java.util.ArrayList;

	public class RulesOfLife {
      public static ArrayList<Point> setAliveCells() {
      	ArrayList<Point> points = new ArrayList<Point>(0);
        
        points.add(new Point(40, 24));
        points.add(new Point(40, 25));
        points.add(new Point(40, 26));
        points.add(new Point(40, 27));
        points.add(new Point(40, 28));
        points.add(new Point(40, 29));
        points.add(new Point(40, 30));
        points.add(new Point(40, 31));
        points.add(new Point(41, 24));
        points.add(new Point(41, 25));
        points.add(new Point(41, 26));
        points.add(new Point(41, 27));
        points.add(new Point(41, 28));
        points.add(new Point(41, 29));
        points.add(new Point(41, 30));
        points.add(new Point(41, 31));
        points.add(new Point(42, 24));
        points.add(new Point(42, 25));
        points.add(new Point(42, 26));
        points.add(new Point(42, 27));
        points.add(new Point(42, 28));
        points.add(new Point(42, 29));
        points.add(new Point(42, 30));
        points.add(new Point(42, 31));
        points.add(new Point(43, 24));
        points.add(new Point(43, 25));
        points.add(new Point(43, 26));
        points.add(new Point(43, 27));
        points.add(new Point(43, 28));
        points.add(new Point(43, 29));
        points.add(new Point(43, 30));
        points.add(new Point(43, 31));
        points.add(new Point(44, 24));
        points.add(new Point(44, 25));
        points.add(new Point(44, 26));
        points.add(new Point(44, 27));
        points.add(new Point(44, 28));
        points.add(new Point(44, 29));
        points.add(new Point(44, 30));
        points.add(new Point(44, 31));
        points.add(new Point(45, 24));
        points.add(new Point(45, 25));
        points.add(new Point(45, 26));
        points.add(new Point(45, 27));
        points.add(new Point(45, 28));
        points.add(new Point(45, 29));
        points.add(new Point(45, 30));
        points.add(new Point(45, 31));
        points.add(new Point(46, 24));
        points.add(new Point(46, 25));
        points.add(new Point(46, 26));
        points.add(new Point(46, 27));
        points.add(new Point(46, 28));
        points.add(new Point(46, 29));
        points.add(new Point(46, 30));
        points.add(new Point(46, 31));
        
        return points;
      }

	public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
        	// Iterate through the array, follow game of life rules
       	 for (int i=1; i<gameBoard.length-1; i++) {
            for (int j=1; j<gameBoard[0].length-1; j++) {
                int surrounding = 0;
                if (gameBoard[i-1][j-1]) { surrounding++; }
                if (gameBoard[i-1][j])   { surrounding++; }
                if (gameBoard[i-1][j+1]) { surrounding++; }
                if (gameBoard[i][j-1])   { surrounding++; }
                if (gameBoard[i][j+1])   { surrounding++; }
                if (gameBoard[i+1][j-1]) { surrounding++; }
                if (gameBoard[i+1][j])   { surrounding++; }
                if (gameBoard[i+1][j+1]) { surrounding++; }
			        if (gameBoard[i][j] && (surrounding >1)){
			        	survivingCells.add(new Point(i-1,j-1));
			        }
			        if (gameBoard[i][j] && (surrounding <1)){
			        	continue;
			        }
			        if ((!gameBoard[i][j]) && (surrounding >2)){
			        	survivingCells.add(new Point(i-1,j-1));
			        }
            }
        }
}

}
	
