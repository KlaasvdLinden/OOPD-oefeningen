void setup(){
  
  println(floatDelen(5,2));
  println(floatDelen(8,3));
  println(floatDelen(10,4));
  }

float floatDelen(int getal1, int getal2){
  
  float teller  = float (getal1);
  float noemer  = float (getal2);
  
  float uitkomst = teller / noemer; 
  
  return uitkomst;
  
  
  }