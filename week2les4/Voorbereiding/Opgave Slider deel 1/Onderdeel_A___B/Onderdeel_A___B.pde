void setup() {
  size(300, 200);
  background(0);

  float sliderBreedte = 200;
  float sliderHoogte = 50;
  float sliderX = (width - sliderBreedte) / 2;
  float sliderY = 50;
  int sNPosities = 5;

  Slider slider1 = new Slider(sliderX, sliderY, sliderBreedte, sliderHoogte, sNPosities);
}