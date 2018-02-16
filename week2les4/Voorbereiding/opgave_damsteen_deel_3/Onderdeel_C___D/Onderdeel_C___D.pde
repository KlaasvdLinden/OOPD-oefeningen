final int WIT = 255;
final int ZWART = 0;
final int DIAMETER = 100;

Damsteen[] damsteenArray = new Damsteen [4]; 

void setup() {

  size(600, 600);
  for (int i=0; i< damsteenArray.length; i++) {

    damsteenArray[i] = new Damsteen(DIAMETER + DIAMETER * i, height /2, WIT, DIAMETER, true);
  }
}

void draw() {

  for (int i=0; i<damsteenArray.length; i++) {

    damsteenArray[i].tekenDamsteen();
  }
}