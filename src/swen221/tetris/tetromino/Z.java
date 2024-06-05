package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class Z extends S{
  public Z(int x, int y, Color color) {
    super(x, y, color);
  }
 
  //changes the xOffset to change the S shape to a Z shape
  public int xOffset(int i) {
	    if (i < 2) { return i; }
	    return i - 3;
	  }

}
