class KaartjesAutomaat {


  float ingeworpenGeld;
  boolean genoegBetaald;

  float prijs;
  String film;

  Kaartje [] kaartjes = { new Kaartje(2.00, "Shrek"), new Kaartje(3.00, "Shrek 2"), 
    new Kaartje(4.00, "Shrek 3")};

  Kaartje gekozenFilm;


  KaartjesAutomaat(int getal) {

    gekozenFilm = kaartjes[getal];
    prijs = gekozenFilm.prijs;
    film = gekozenFilm.titel;
  }


  void werpGeldIn(float ingeworpenGeld) {

    this.ingeworpenGeld += ingeworpenGeld;
  }

  void leegAutomaat() {

    this.ingeworpenGeld = 0;
  }

  void genoegBetaald() {

    if (this.ingeworpenGeld < this.prijs) {

      this.genoegBetaald = false;
    } else { 

      this.genoegBetaald = true;
    }
  }

  float wisselgeld() {

    float wisselgeld;
    if (ingeworpenGeld - prijs > 0) {

      wisselgeld = ingeworpenGeld - prijs;
    } else {

      wisselgeld = 0;
    }

    return wisselgeld;
  }

  String kaartje() {

    String resultaat = "";

    if (genoegBetaald) {

      resultaat = "Kaartje gekocht voor de film: " + film  + "\n" + "Prijs:" + " €" + prijs + "\n" + "Het wisselgeld bedraagt: €" + wisselgeld() ;
    } else if (!genoegBetaald) {

      resultaat = "De prijs voor " + film + " bedraagt: €" + prijs + "\n" + "U heeft het volgende bedrag ingeworpen: €" + ingeworpenGeld
        + "\n" + "Het resterende bedrag bedraagt: €" + (prijs - ingeworpenGeld);
    }



    return resultaat;
  }
}