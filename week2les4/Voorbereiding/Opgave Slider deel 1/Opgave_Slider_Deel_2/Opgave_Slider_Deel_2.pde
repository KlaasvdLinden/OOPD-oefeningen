float s1Breedte = 200;
float s1Hoogte = 50;
float s1X = (width - s1Breedte) / 2;
float s1Y = 50;
int s1NPosities = 5;


Slider slider1 = new Slider(s1X, s1Y, s1Breedte, s1Hoogte, s1NPosities);

void setup() {
  size(600, 600);
  background(0);
}

void draw() {
  
  int s1HuidigePositie = slider1.bepaalSliderPositie(s1X, s1Breedte, s1NPosities);
  slider1.tekenSlider(s1X, s1Y, s1Breedte, s1Hoogte, s1HuidigePositie, s1NPosities);
}