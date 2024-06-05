package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class J extends Tetromino{
  public J(int x, int y, Color color) {
    super(x, y, color);
  }
  
  int rotate = 0;
  boolean swap = false;

  @Override
  /**
   * returns the x value of the specified cell
   */
  public int x(int i) {
    if (i == 0) {
    	
    	if(rotate == 0) {
    		return (!swap) ? centerX() + 1 : centerX() - 1;
    		
    	} else if(rotate == 1) {
    		return centerX() - 1;
    		
    	} else if(rotate == 2) {
    		return (!swap) ? centerX() - 1 : centerX() + 1;
    		
    	} else if(rotate == 3) {
    		return centerX() + 1;
    		
    	}
    }
    
    if(rotate == 0 || rotate == 2) {
    	return centerX() + i - 2; 
    }
    
    return centerX();
  }

  @Override
  /**
   * returns the y value of the specified cell
   */
  public int y(int i) {
	 if(i == 0) {
		 if(rotate == 0) {
			 return centerY() - 1;
	    		
	    	} else if(rotate == 1) {
	    		return (!swap) ? centerY() - 1 : centerY() + 1;
	    		
	    	} else if(rotate == 2) {
	    		return centerY() + 1;
	    		
	    	} else if(rotate == 3) {
	    		return (!swap) ? centerY() + 1 : centerY() - 1;
	    		
	    	}
	 }
	  
	 if(rotate == 1 || rotate == 3) {
		 return centerY() + i - 2;
	 }
	  
    return centerY();
  }

  @Override
  /**
   * rotates the shape 90 degrees clockwise
   */
  public void rotateRight() {
	  rotate = (rotate + 1) % 4;
  }
  
}