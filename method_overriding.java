class find_rect {
    int length = 10;
    int breadth = 20;

    void shape() {
        System.out.println("1st method: Rectangle with length " + length + " and breadth " + breadth +" arear ="+(length*breadth));
    }
}

class find_tria extends find_rect {
    void shape() {
        System.out.println("2nd method: Triangle area = " + (0.5 * length * breadth));
    }
}

public class method_overriding {
    public static void main(String[] args) {
        find_rect rect = new find_rect();
        find_tria tria = new find_tria();

        rect.shape();
        tria.shape();
    }
}
