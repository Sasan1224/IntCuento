package model;

import processing.core.PApplet;
//model package, Interactive class
public class Interactive extends PApplet{
	//declaration of PApplet
	PApplet app;
	//declaration of classes
	Rabbit rabbit;
	Object bamboo;
	Object Turtle;
	Object oni;
	Object box;
	Object boxCover;
	Leaf leaf;
	
	public Interactive (PApplet app){
		this.app=app;
		//initialization of the classes
		rabbit = new Rabbit(0, 0, app);
		bamboo = new Bamboo(685, 0, app);
		leaf = new Leaf (600,0, app);
		Turtle = new Turtle(600, 399, app);
		oni = new Oni (900, 300, app);
		box = new Box (0, 0, app);
		boxCover = new BoxCover(863, 300, app);
	}
	//call of all the methods of the classes
	//rabbit methods
	public void drawRabbit() {
		rabbit.paintObject();
	}
	public void drawRabbitCrazy() {
		rabbit.paintShine();
	}
	public void drawLaugh() {
		rabbit.paintLaugh();
	}
	//bamboo methods
	public void drawBamboo() {
		bamboo.paintObject();
	}
	public void drawShineBamboo() {
		bamboo.paintShine();
	}
	public void drawLeaf() {
		leaf.paintLeaf();
	}
	//old woman methods
	public void drawTurtle() {
		Turtle.paintObject();
	}
	public void drawTurtleHappy() {
		Turtle.paintShine();
	}
	public void dragTurtle() {
		Turtle.dragObject();
	}
	//Oni methods
	public void drawOni() {
		oni.paintObject();
	}
	public void drawShineOni() {
		oni.paintShine();
	}
	public void dragOni(){
		oni.dragObject();
	}
	//box methods
	public void drawBox() {
		box.paintObject();
	}
	//box cover methods
	public void drawBoxCover(){
		boxCover.paintObject();
	}
	public void drawShineBoxCover() {
		boxCover.paintShine();
	}		
	public void dragBoxCover(){
		boxCover.dragObject();
	}	
}
