class Damsteen{
 
  int Xpunt;
  int Ypunt;
  int kleur;
  int diameter;
  
  Damsteen(int damsteenX, int damsteenY, int damsteenKleur, int damsteenDiameter){
    
    this.Xpunt = damsteenX;
    this.Ypunt = damsteenY;
    this.kleur = damsteenKleur;
    this.diameter = damsteenDiameter;
    
  }
  
  
}

void setup(){
  
  size(500,500);
  Damsteen witteDamsteen = new Damsteen(50, 50, 255, 50);
  Damsteen zwarteDamsteen = new Damsteen(150, 50, 0, 50);
  
  ellipseMode(CENTER);
  
  fill(witteDamsteen.kleur);
  noStroke();
  ellipse(witteDamsteen.Xpunt, witteDamsteen.Ypunt, witteDamsteen.diameter, witteDamsteen.diameter);
  
  fill(zwarteDamsteen.kleur);
  noStroke();
  ellipse(zwarteDamsteen.Xpunt, zwarteDamsteen.Ypunt, zwarteDamsteen.diameter, zwarteDamsteen.diameter);
  
}