package Player;

import Pieces.AbstractPiece;
public class Bishop extends AbstractPiece{

	public Bishop(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		if (isWhite) {
			System.out.print("\u2657");
		} else {
			System.out.print("\u265D");
		}
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		return false;
	}

}
