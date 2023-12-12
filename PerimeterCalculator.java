class Rectangle {
    private int length;
    private int breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    // Setter methods for length and breadth
    public void setLength(int length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length cannot be negative.");
        }
    }

    public void setBreadth(int breadth) {
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            System.out.println("Invalid breadth. Breadth cannot be negative.");
        }
    }

    // Getter methods (optional)
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    // Method to calculate perimeter
    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class PerimeterCalculator {
    public static void main(String[] args) {
        // Creating an instance of the Rectangle class
        Rectangle myRectangle = new Rectangle(5, 3);

        // Invoking the calculatePerimeter method
        myRectangle.calculatePerimeter();
    }
}
