import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    coordinates.add(new Coordinates(5, 3));
    coordinates.add(new Coordinates(16, 10));

    Coordinates.calculateDistance(coordinates.get(0), coordinates.get(1));
    System.out.print(distance);
  }
}