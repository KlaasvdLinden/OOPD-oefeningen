void setup() {
  
  int [] array1= {1, 5, 6, 9};
  int [] array2= {3, 14, 2, 1};
  
  println(optellenElementen(array1, array2));
}

int [] optellenElementen(int [] array1, int [] array2) {

  int [] array = new int[array1.length];

  for (int i=0; i<array1.length; i++) {
    
    array[i] = array1[i] + array2[i];
  }




  return array;
}