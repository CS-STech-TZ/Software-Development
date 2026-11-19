public class Rectangle {

    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getPerimeter() {

        return (width * 2) + (height * 2);

    }

    double getArea() {
        return width * height;
    } 

}