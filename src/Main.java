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
            System.out.println("5. Calculate Wages till a condition of total working hours or days is reached for a month - Assume 100 hours");
            System.out.println("6. Exit");
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
                case 4:
                    employeeWageComputation.calculateMonthlyWage();
                    break;
                case 5:
                    employeeWageComputation.calculateWageTillCondition();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

class EmployeeWageComputation {
    public static final int is_present = 0;
    public  static final int is_part_time = 1;
    public static final int is_full_time =2;
    public static final int wagePerHour = 8;
    public static final int WORKING_DAYS_PER_MONTH = 20;

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
        int partTimeHour = 8;
        int partTimeWage = partTimeHour * wagePerHour;
        System.out.println("Daily Wage of Part-Time Employee = ₹" + partTimeWage);
    }
    void calculateMonthlyWage() {
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empHours = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case is_part_time:
                    empHours = 8;
                    break;
                case is_full_time:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            int dailyWage = empHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + day + ": Hours Worked = " + empHours + ", Daily Wage = ₹" + dailyWage);
        }

        System.out.println("\nTotal Monthly Wage: ₹" + totalWage);
    }
    void calculateWageTillCondition() {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        while (totalWorkingHours < 100 && totalWorkingDays < 20) {
            int empHours = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case is_part_time:
                    empHours = 8;
                    break;
                case is_full_time:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalWorkingDays++;
            totalWorkingHours += empHours;
            int dailyWage = empHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": Worked " + empHours + " hours, Daily Wage = ₹" + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage for the Month: ₹" + totalWage);
    }


}