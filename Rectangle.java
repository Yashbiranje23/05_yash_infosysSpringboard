public class Rectangle {
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        // Validate if length is non-negative (assuming length cannot be negative)
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length cannot be negative.");
        }
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        // Validate if breadth is non-negative (assuming breadth cannot be negative)
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            System.out.println("Invalid breadth. Breadth cannot be negative.");
        }
    }

    // Getter method for length (optional)
    public int getLength() {
        return length;
    }

    // Getter method for breadth (optional)
    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        // Creating an instance of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Setting the length and breadth using the setter methods
        myRectangle.setLength(5);
        myRectangle.setBreadth(3);

        // Retrieving and printing the values
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
    }
}