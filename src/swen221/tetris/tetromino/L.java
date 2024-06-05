package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class L extends J{
  public L(int x, int y, Color color) {
    super(x, y, color);
    swap();
  }
  
  //switches from J to L mode :)
  //this was 100% the best way to do this :)
  public void swap() {
	  swap = true;
  }

  
  //TODO: add more methods if needed
}
