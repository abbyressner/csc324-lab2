package Project;
import Project.Matrix;

public class Agent{

  int[] state = {this.x, this.y};
  int x;
  int y;

  void initAgent(){
    // Pick random x coord
    // Pick random y coord
    // If (x,y) is empty then place agent there to start
  }

  /*
   * Returns an int array of length 4 with all possible directions in which travel is possible. [left, right, up ,down]
   */
  int[] collides(int[] state){
    int[] direct = new int[]{0,0,0,0};
    if (this.y < 24 && Matrix.isempty(x, y + 1)) direct[0] = 1; // if we can move to the right and its empty
    if (this.y > 0 && Matrix.isempty(x,y - 1))  direct[1] = 1; // if we can move to the left and its empty
    if (this.x < 24 && Matrix.isempty(x + 1, y)) direct[2] = 1; // if we can move down and its empty
    if (this.x > 0 && Matrix.isempty(x - 1, y)) direct[3] = 1; // if we can move up and its empty
    return direct;
  }

  void act(){
    // {left, right, up, down}
    Agent lmao = new Agent();
    // this.state = nextState
  }
}