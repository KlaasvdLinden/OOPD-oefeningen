class Product {
  String naam;
  int prijs;
  
  Product(String productNaam, int productPrijs){
   
    this.naam = productNaam;
    this.prijs = productPrijs;
    
  }; //constructor
}

void setup() {
  
  Product product1 = new Product("pc", 500);
  Product product2=  new Product("mac", 2500);

  
  Product[] productArray = {product1, product2};

  for (int i=0; i<productArray.length; i++) {

   println(productArray[i].naam + " kost: " +  productArray[i].prijs + " euro");
  }
}