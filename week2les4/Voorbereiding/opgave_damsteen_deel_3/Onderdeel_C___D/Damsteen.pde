class Damsteen {

  int Xpunt;
  int Ypunt;
  int kleur;
  int diameter;
  boolean isGeselecteerd;

  Damsteen(int damsteenX, int damsteenY, int damsteenKleur, int damsteenDiameter, boolean damsteenGeselecteerd) {

    this.Xpunt = damsteenX;
    this.Ypunt = damsteenY;
    this.kleur = damsteenKleur;
    this.diameter = damsteenDiameter;
    this.isGeselecteerd = damsteenGeselecteerd;
  }

  void tekenDamsteen() {


    if (isGeselecteerd) {

      stroke(0);
      strokeWeight(10);
    } else {

      noStroke();
    }

    fill(kleur);
    ellipseMode(CENTER);
    ellipse(Xpunt, Ypunt, diameter, diameter);
  }
  
  String toString(){
   
    return "De X van de damsteen is:" + " " + Xpunt + " " +  "De Y van de damsteen is:" + " " + Ypunt  ;
    
  }
}