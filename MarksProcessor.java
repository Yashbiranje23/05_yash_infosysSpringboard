public class MarksProcessor {
    private int[] marksArray;

    // Constructor to initialize the array
    public MarksProcessor() {
        marksArray = new int[5];
    }

    // Method to store marks in the array
    public void storeMarks(int[] marks) {
        if (marks.length == marksArray.length) {
            for (int i = 0; i < marksArray.length; i++) {
                marksArray[i] = marks[i];
            }
        } else {
            System.out.println("Invalid number of subjects. Expected: " + marksArray.length);
        }
    }

    // Method to display marks using enhanced for loop
    public void displayMarks() {
        System.out.println("Marks for 5 subjects:");

        for (int mark : marksArray) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of MarksProcessor
        MarksProcessor marksProcessor = new MarksProcessor();

        // Storing marks in the array
        int[] subjectMarks = {80, 75, 90, 85, 88};
        marksProcessor.storeMarks(subjectMarks);

        // Displaying marks using the displayMarks method
        marksProcessor.displayMarks();
    }
}
