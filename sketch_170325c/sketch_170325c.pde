//1. Make a variable to hold the X co-ordinate of the dot, and set it to something.
int x=30;
int x2=100;
void setup() {
  size(800, 200);
}

void draw() {
  background (300,300,300);
  //3. make it a nice color
   ellipse(100,30,100,100);
   if (x2==500)
    playSound();
    if(mousePressed) {
       x2=x2+60;
     }
 ellipse(x,30,60,60);
  //4. if the mouse is pressed...
  if (x==800)
    playSound();
     if(mousePressed) {
       x=x+1;
     }

//5. ... change the X co-ordinate so that the dot moves to the right
      
  //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.

//6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change)

//7. Use this method to play a ding when your dot crosses the finish line. 


}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("58673__timtube__cheer (2).wav");
    sound.trigger();
    soundPlayed = true;
  }
}