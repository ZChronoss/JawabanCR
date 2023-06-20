class Coordinates{
  
  private int x, y;

  Coordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  
  public String getAllCoordinates(){
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public static double calculateDistance(Coordinates c1, Coordinates c2){
    int delta_X = Math.abs(c1.getX() - c2.getX());
    int delta_Y = Math.abs(c1.getY() - c2.getY());
    double distance = Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));

    return distance;

  }
}