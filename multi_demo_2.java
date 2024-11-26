class Rectangle {
    int length = 10;
    int breadth = 20;

    void shape() {
        System.out.println("1st method: Rectangle with length " + length + " and breadth " + breadth +
                " area = " + (length * breadth));
    }
}

class ShapeDetails extends Rectangle {
    void displayDetails() {
        System.out.println("Intermediate class: Details of shape dimensions - Length = " + length +
                ", Breadth = " + breadth);
    }
}

class Triangle extends ShapeDetails {
    void triangleArea() {
        System.out.println("3rd method: Triangle area = " + (0.5 * length * breadth));
    }
}

public class multi_demo_2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        ShapeDetails shape = new ShapeDetails();
        Triangle tria = new Triangle();
        rect.shape();
        shape.displayDetails();
        tria.triangleArea(); 
    }
}
