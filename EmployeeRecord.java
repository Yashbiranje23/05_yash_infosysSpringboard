
public class EmployeeRecord {
    public static void main(String[] args) {
        // Array of employee salaries
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate average salary
        double averageSalary = calculateAverage(salaries);

        // Display salaries and average
        System.out.println("Employee Salaries:");
        displaySalaries(salaries);
        System.out.println("\nAverage Salary: " + averageSalary);

        // Display employees with salaries greater than and lesser than the average
        displayEmployeesWithGreaterSalary(salaries, averageSalary);
        displayEmployeesWithLesserSalary(salaries, averageSalary);
    }

    // Method to calculate the average salary
    private static double calculateAverage(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        return sum / salaries.length;
    }

    // Method to display employee salaries
    private static void displaySalaries(double[] salaries) {
        for (double salary : salaries) {
            System.out.println(salary);
        }
    }

    // Method to display employees with salaries greater than the average
    private static void displayEmployeesWithGreaterSalary(double[] salaries, double averageSalary) {
        System.out.println("\nEmployees with Salaries Greater Than Average:");
        for (double salary : salaries) {
            if (salary > averageSalary) {
                System.out.println(salary);
            }
        }
    }

    // Method to display employees with salaries lesser than the average
    private static void displayEmployeesWithLesserSalary(double[] salaries, double averageSalary) {
        System.out.println("\nEmployees with Salaries Lesser Than Average:");
        for (double salary : salaries) {
            if (salary < averageSalary) {
                System.out.println(salary);
            }
        }
    }
}