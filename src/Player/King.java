package Player;

import Pieces.AbstractPiece;
public class King extends AbstractPiece{

	public King(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		if (isWhite) {
			System.out.print("\u2654");
		} else {
			System.out.print("\u265A");
		}
	}

	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		//can move in any directions
		return Math.abs(destRow - srcRow) <= 1
				|| Math.abs(destCol - srcCol) <= 1;
	}

}
