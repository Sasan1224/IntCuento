package view;

import java.util.ArrayList;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	CompoScreen compo;
	String [] story;
	ArrayList <String> words;
	int state;
	int interaction;
	int time;
	int interactionCounter;
	boolean disable;
	boolean interact;
	boolean Rab;
	boolean flower;
	boolean bamboo;
	boolean boxCover;
	boolean Turtle;
	
	public void settings() {
		size (1171,659);
		compo = new CompoScreen(this);
		state = 1;
		interaction = 0;
		interactionCounter=0;
		disable = false;
		interact=false;
		Rab=false;
		flower=false;
		bamboo=false;
		boxCover=false;
		Turtle=false;
	}
	
	public void setup() {
		story = loadStrings("../resources/story.txt");
		words = new ArrayList<String>();
		for (int i = 0; i < story.length; i++) {
			String [] tempArray = story[i].split(" ");
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
			}
		}
		
	}
	
			
	public void draw(){
		
		switch(state) {
		
		case 1 :
			
			compo.paintCompo();
			
			if (mouseX > 658 && mouseX < 658 + 227
					&& mouseY > 430 && mouseY < 430+225 ) {
				compo.drawTurtleHappy();
			} 
			
			else if (mouseX > 849 && mouseX < 849 + 321
					&& mouseY > 0 && mouseY < 0+283 ) {
				compo.drawBlackFlower();
			}
			
			else if (mouseX > 0 && mouseX < 0 + 323
					&& mouseY > 291 && mouseY < 291 +120 && disable == false) {
				compo.drawRabbitCrazy();
			}
			
			else if (mouseX > 1000 && mouseX < 1000 + 120
					&& mouseY > 308 && mouseY < 308 +64) {
				compo.drawBlackBird();
			}
			
			else if (mouseX > 896 && mouseX < 896 + 275
					&& mouseY > 312 && mouseY < 312 +235 ) {
				compo.drawShineBoxCover();
			}
			
			
				
			switch (interaction) {
			case 1:
				compo.drawLeaf();
				break;
			case 2:
				compo.drawLaugh();
				disable = true;
				if (frameCount %30 == 0) {
					disable = false;
					interaction = 0;
				}
				break;
			}
			if (interactionCounter==5) {
				state=2;
			}
			break;
			}
		
	
		}	

	public void mouseClicked() {

		switch (state) {
		case 1:
			if (mouseX > 849 && mouseX < 849 + 321
					&& mouseY > 0 && mouseY < 0+283) {
				if (bamboo==false) {
					interactionCounter+=1;
					bamboo=true;
				}
				interaction = 1;
			}
			else if (mouseX > 0 && mouseX < 0 + 323
					&& mouseY > 291 && mouseY < 291 +120){
				if (Rab==false) {
					interactionCounter+=1;
					Rab=true;
				}
				interaction = 2;
			}
			break;
		case 2: 
			if (mouseX > 367 && mouseX < 367 + 437
					&& mouseY > 360 && mouseY < 360 +86) {
				exit();
			}
		}
	}

	public void mouseDragged() {
		interact =false;
		if (interact==false) {
			if (mouseX > 550 && mouseX < 550 + 335
					&& mouseY > 556 && mouseY < 556+101) {
				interact = true;
				if (interactionCounter==4) {
					if (Turtle==false) {
						if  (mouseX > 542 && mouseX < 542 + 20
								&& mouseY > 588 && mouseY < 588+71){
							interactionCounter+=1;
						Turtle=true;
						}
					}
					compo.dragTurtle();
				}
			}
			if (mouseX > 1000 && mouseX < 1000 + 120
					&& mouseY > 20 && mouseY < 20 +392) {
				interact=true;
				if (interactionCounter>2 && interactionCounter<5) {
					if (flower==false) {
						interactionCounter+=1;
						flower=true;
					}
					compo.dragBird();
				}	
			}	
			if (mouseX > 250 && mouseX < 250 + 846
					&& mouseY > 390 && mouseY < 390 +61) {
				interact=true;
				if (interactionCounter>1 && interactionCounter<4) {
					if (boxCover==false) {
						interactionCounter+=1;
						boxCover=true;
					}
					compo.dragBoxCover();
				}
			}
		}

	}

}


