class KaartjesAutomaat {

  float prijs;
  String film;
  float ingeworpenGeld;
  boolean genoegBetaald;

  KaartjesAutomaat() {

    this.prijs = 5.00;
    this.film = "Shrek";
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

      resultaat = "Kaartje gekocht voor de film: " + film  + "\n" + "Prijs:" + " €" + prijs + "\n" + "Het wisselgeld bedraagt: " + wisselgeld() ;
    } else if (!genoegBetaald) {

      resultaat = "De prijs voor de film bedraagt: €" + prijs + "\n" + "U heeft het volgende bedrag ingeworpen: €" + ingeworpenGeld
        + "\n" + "Het resterende bedrag bedraagt: €" + (prijs - ingeworpenGeld);
    }



    return resultaat;
  }
}