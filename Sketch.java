import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(36, 175, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  fill(44, 148, 33);
  rect(0, 400, 500, 400);

  fill(184, 48, 48);
  rect(100, 300, 300, 200);

  fill(163, 163, 163);
  triangle(50, 300, 250, 100, 450, 300);

  fill(255);
  rect(200, 400, 100, 250);
  
  fill(247, 165, 0);
  ellipse(275, 460, 15, 15);

  fill(153, 219, 255);
  ellipse(250, 210, 75, 75);

  fill(0);
  line(250, 172, 250, 247);

  fill(0);
  line(211, 210, 286, 210);

  fill(247, 165, 0);
  ellipse(0, 0, 150, 150);

  }
  
  // define other methods down here.
}