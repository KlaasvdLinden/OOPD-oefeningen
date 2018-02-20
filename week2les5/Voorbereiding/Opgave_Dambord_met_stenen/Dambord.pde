class Dambord {

  float d = 50;

  Damsteen [] stenen = {
    new Damsteen(d, d, d, 0), 
    new Damsteen(d * 2, d, d, 0), 
    new Damsteen(d, d * 2, d, 255), 
    new Damsteen(d * 2, d *2, d, 255), 
  };

  void tekenDamstenen() {

    for (int i=0; i<stenen.length; i++) {

      stenen[i].tekenDamsteen();
    }
  }
}