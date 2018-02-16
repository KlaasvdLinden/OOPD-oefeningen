class Damsteen {

  int Xpunt;
  int Ypunt;
  int kleur;
  int diameter;

  Damsteen(int damsteenX, int damsteenY, int damsteenKleur, int damsteenDiameter) {

    this.Xpunt = damsteenX;
    this.Ypunt = damsteenY;
    this.kleur = damsteenKleur;
    this.diameter = damsteenDiameter;
  }

  void tekenDamsteen() {


    fill(kleur);
    noStroke();
    ellipseMode(CENTER);
    ellipse(Xpunt, Ypunt, diameter, diameter);
  }
}