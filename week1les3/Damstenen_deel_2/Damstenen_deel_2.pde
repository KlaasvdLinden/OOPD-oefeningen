class Damsteen {

  int Xpunt;
  int Ypunt;
  int kleur;
  float diameter;

  Damsteen(int damsteenX, int damsteenY, int damsteenKleur, float damsteenDiameter) {

    this.Xpunt = damsteenX;
    this.Ypunt = damsteenY;
    this.kleur = damsteenKleur;
    this.diameter = damsteenDiameter;
  }
}


final int WIT = 255;
final int ZWART = 0;
final int DIAMETER = 50;


Damsteen witteDamsteen1 = new Damsteen(0, 0, WIT, DIAMETER);
Damsteen zwarteDamsteen1 = new Damsteen(0, height, ZWART, DIAMETER);

Damsteen witteDamsteen2 = new Damsteen(width, 0, WIT, DIAMETER);
Damsteen zwarteDamsteen2 = new Damsteen(height, width, ZWART, DIAMETER);

Damsteen[] damsteenArray = {witteDamsteen1, zwarteDamsteen1, witteDamsteen2, zwarteDamsteen2}; 

void setup() {

  size(200, 200);
}

void draw() {

  tekenDamsteen(damsteenArray);
}

void tekenDamsteen(Damsteen[] array) {

  for (int i=0; i<array.length; i++) {

    fill(array[i].kleur);
    noStroke();
    ellipseMode(CORNERS);
    ellipse(array[i].Xpunt, array[i].Ypunt, array[i].diameter, array[i].diameter);
  }
}