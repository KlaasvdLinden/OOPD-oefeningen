KaartjesAutomaat klant = new KaartjesAutomaat(); 
void setup() { 

  klant.werpGeldIn(0.5);
  klant.werpGeldIn(0.5);
  klant.werpGeldIn(0.5);
  klant.werpGeldIn(1);
  klant.werpGeldIn(0.20);
  klant.werpGeldIn(0.05);
  klant.genoegBetaald();
  println(klant.kaartje());
}

void draw() {
}