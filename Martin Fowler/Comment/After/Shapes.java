public void calculateArea(String type, int side, int width) {
    int area = 0;

    if (shapeType == "square") {
        area = side * side;
    } else if (type == "rectangle") {
        area = side * width;
    } else if (type == "circle") {
        area = 3.14 * side * side;
    }

    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public static void main(String[] args) {

        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        calc("square", squareSide, 0);
        calc("rectangle", rectangleWidth, rectangleHeight);
        calc("circle", circleRadius, 0);
    }
}
