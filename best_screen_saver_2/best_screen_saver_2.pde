
 

void setup(){
   size(900,900);
   background(20,20,20);
}

void draw(){
  makeMagical();
  for(int i=0;i<300;i++){
  fill(random(255),random(255),random(255));
  ellipse(getWormX(i),getWormY(i),10,10); 
  }

}
float frequency = .001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+10000 + frameCount * frequency), 0, 1, 0, height);
}
