package Board;

import Board.Chessboard;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chessboard myChessboard = new Chessboard();


		while (myChessboard.getGameRunning()) {

			myChessboard.printBoard();
			myChessboard.move();

	}
  }

}
