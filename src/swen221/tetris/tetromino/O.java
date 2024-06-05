package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class O extends Tetromino{
  public O(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
  }

  @Override
  /**
   * returns the x value of the specified cell
   */
  public int x(int i) {
	  return (i % 2 == 0) ? centerX() + 1 : centerX() ;
  }

  @Override
  /**
   * returns the y value of the specified cell
   */
  public int y(int i) {
    return (i < 2) ? centerY() : centerY() + 1;	
  }

  @Override
  public void rotateRight() {
    //it literally cannot rotate
  }
}
