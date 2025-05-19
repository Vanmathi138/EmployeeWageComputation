//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee" +
                "Wage Computation" +
                "Program on Master Branch");
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.calculateMonthlyWage();


    }
}
class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public  void calculateMonthlyWage() {
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empHours = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWage += dailyWage;

            System.out.println("Day " + day + ": Hours Worked = " + empHours + ", Daily Wage = ₹" + dailyWage);
        }

        System.out.println("\nTotal Monthly Wage: ₹" + totalWage);
    }
}