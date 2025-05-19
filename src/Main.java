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
    public static final int is_present = 1;
    public static final int wage_per_hour = 20;
    public static final int full_day_hour = 8;

    void checkAttendance(){
        double randomValue = Math.floor(Math.random()*10)%2;
        int attendance = (int) randomValue;

        if(attendance == is_present){
            int dailyEmployeeWage = wage_per_hour * full_day_hour;
            System.out.println("Employee is present.\n"
                    +"Daily wage of Employee: "+dailyEmployeeWage);
        }else {
            System.out.println("Employee is absent");
            System.out.println("Daily Wage of Employee: ₹0");
        }
    }
}