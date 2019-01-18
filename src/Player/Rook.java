package Player;

import Pieces.AbstractPiece;
public class Rook extends AbstractPiece{

	public Rook(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (isWhite){
			System.out.print("\u2656");
		}
		else{
			System.out.print("\u265C");
		}		
	}
	
	@Override
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO Auto-generated method stub
		return false;
	}

}
