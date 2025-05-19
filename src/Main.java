//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee" +
                "Wage Computation" +
                "Program on Master Branch");
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.checkAttendance();


    }
}
class EmployeeWageComputation {
    public static final int is_present = 0;
    public static final int wage_per_hour = 20;
    public static final int full_day_hour = 1;
    public static final int part_time_wage = 2;

    void checkAttendance(){
        int  empCheck =(int) Math.floor(Math.random()*10)%3;

        String status = "";
        int empHours = 0;

        switch (empCheck){
            case full_day_hour :
                empHours = 8;
                status = "Full-Day";
                break;
            case part_time_wage:
                empHours = 8;
                status = "Part-Time";
                break;
            default:
                empHours = 0;
                status = "absent";
        }

        int dailyWage = empHours * wage_per_hour;
        System.out.println("Employee Status: " + status);
        System.out.println("Employee Hours: " + empHours);
        System.out.println("Daily Wage: ₹" + dailyWage);

    }
}