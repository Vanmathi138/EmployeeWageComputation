import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Scanner scanner = new Scanner(System.in);
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();

        while (true) {
            System.out.println("\nSelect Option:");
            System.out.println("1. Check Attendance of employee");
            System.out.println("2. Calculate daily wage of employee");
            System.out.println("3. Calculate part time wage of employee");
            System.out.println("4. Calculate monthly wage");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();

            System.out.println();

            switch (option) {
                case 1:
                    employeeWageComputation.checkAttendance();
                    break;
                case 2:
                    employeeWageComputation.calculateDailyWage();
                    break;
                case 3:
                    employeeWageComputation.calculatePartTimeWage();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

class EmployeeWageComputation {
    public static final int is_present = 1;
    public static final int wagePerHour = 20;

    void checkAttendance(){
        double randomValue = Math.floor(Math.random()*10)%2;
        int attendance = (int) randomValue;

        if(attendance == is_present){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }
    void calculateDailyWage(){
        int fullDayHour = 8;
        int dailyWage = fullDayHour * wagePerHour;
        System.out.println("Daily Wage of Full-Time Employee = ₹" + dailyWage);
    }

    void calculatePartTimeWage(){
        int partTimeHour = 4;
        int partTimeWage = partTimeHour * wagePerHour;
        System.out.println("Daily Wage of Part-Time Employee = ₹" + partTimeWage);
    }


}