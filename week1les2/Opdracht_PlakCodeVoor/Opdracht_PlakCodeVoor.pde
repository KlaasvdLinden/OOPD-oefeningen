String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
 
  
  for(int i=0; i<idLijst.length; i++){
  println(plakCodeVoorIdLijst(idLijst, "NL")[i].equals("NL" + idLijst[i])) ;
  
  
  }
  
 
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

String [] plakCodeVoorIdLijst(String [] lijst, String code){
 
  String [] array = new String [lijst.length];
  
  for(int i =0; i<lijst.length; i++){
 
    array[i] = code +  lijst[i]; 
  
  }
  
  return array;
  
  
}