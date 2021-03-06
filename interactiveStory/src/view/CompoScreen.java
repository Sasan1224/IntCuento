package view;
//Import controller package, controller class
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;
//class composition where the methods in controller.controller are called to the view
public class CompoScreen extends PApplet{
	//APplet to paint the screen
	PApplet app;
	PImage compo;
	//declaration of the class controller, controller package
	public Controller control;
	
	public CompoScreen(PApplet app) {
		this.app = app;
		compo = app.loadImage("../resources/screenBackground.png");
		//initialization controller
		control = new Controller (app);
	}
	//methods of the composition
	public void paintCompo() {
		app.image(compo,0,0);
	}
	//methods called of the controller
	//sparrow methods
	public void drawRabbit() {
		control.drawRabbit();
	}
	public void drawRabbitCrazy() {
		control.drawRabbitCrazy();
	}
	public void drawLaugh() {
		control.drawLaugh();
	}
	//bamboo methods
	public void drawFlower() {
		control.drawFlower();
	}
	public void drawBlackFlower() {
		control.drawBlackFlower();
	}
	public void drawLeaf() {
		control.drawLeaf();
	}
	//old woman methods
	public void drawTurtle() {
		control.drawTurtle();
	}
	public void drawTurtleHappy() {
		control.drawTurtleHappy();
	}
	public void dragTurtle() {
		control.dragTurtle();
	}
	//Oni methods
	public void drawBird() {
		control.drawBird();
	}
	public void drawBlackBird() {
		control.drawBlackBird();
	}
	public void dragBird(){
		control.dragBird();
	}	
	//box methods
	public void drawBox() {
		control.drawBox();
	}
	//box cover methods
	public void drawBoxCover() {
		control.drawBoxCover();
	}	
	public void drawShineBoxCover() {
		control.drawShineBoxCover();
	}	
	public void dragBoxCover(){
		control.dragBoxCover();
	}	
}