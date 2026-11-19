public class App {
    public static void main(String[] args) {
        
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.println("Perimeter of Rectange 1 is: " + rec1.getPerimeter());
        System.out.println("Perimeter of Rectange 2 is: " + rec2.getPerimeter());

        System.out.println("\nArea of Rectange 1 is: " + rec1.getArea());
        System.out.println("Area of Rectange 2 is: " + rec2.getArea());

    }
}
