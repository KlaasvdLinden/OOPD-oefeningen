int getal = 5;
int getal2 = 24;
int[] lijst = {1, 2, 4, 5, 6, 9, 11};

void setup() {

  println(komtGetalVoorIn(getal, lijst));
  println(komtGetalVoorIn(getal2, lijst));
}

boolean komtGetalVoorIn(int getal, int[] lijst) {

  boolean inLijst = false;

  for (int i=0; i<lijst.length; i++) {

    if (getal == lijst[i]) {

      inLijst = true;
    }
  }
  
  return inLijst;
}

/*Resultaat komt overeen met wat ik verwacht. Getest met een waarde die WEL in de 
array voorkomt en met een waarde die NIET in de array voorkomt. Bij de waarde die 
er wel in voorkomt, returnt de functie de waarde TRUE en bij de waarde die niet in 
de array voorkomt,  returnt de functie de waarde FALSE*/