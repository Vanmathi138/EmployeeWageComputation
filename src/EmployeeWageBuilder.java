public class EmployeeWageBuilder {
    private String company;
    private  int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    public EmployeeWageBuilder(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours){
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void computeWage(){
        int totalWorkingDays =0;
        int totalWorkingHours =0;
        totalWage = 0;

        while (totalWorkingDays< maxWorkingDays && totalWorkingHours< maxWorkingHours){
            int empHours =0;
            int empCheck = (int) Math.floor(Math.random()*10)%3;

            switch (empCheck){
                case 1:
                    empHours = 4; //part time
                    break;
                case 2:
                    empHours = 8; //full time
                    break;
                default:
                    empHours = 0;
            }
            totalWorkingDays++;
            totalWorkingHours += empHours;
            int dailyWage = empHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println(company + " - Day " + totalWorkingDays + ": Hours = " + empHours + ", Daily Wage = ₹" + dailyWage);
        }
        System.out.println("\nCompany: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage for " + company + ": ₹" + totalWage);
        System.out.println("--------------------------------------");
    }
    public int getTotalWage(){
        return totalWage;
    }

}
