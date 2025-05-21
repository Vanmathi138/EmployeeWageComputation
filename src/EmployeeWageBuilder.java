import java.util.ArrayList;

public class EmployeeWageBuilder implements EmployeeWageBuilderInterface{
    private final ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmployeeWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void computeWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            int totalWage = computeWage(companyEmpWage);
            companyEmpWage.setTotalWage(totalWage);
            System.out.println(companyEmpWage);
        }
    }

    private int computeWage(CompanyEmpWage companyEmpWage) {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalDays < companyEmpWage.maxWorkingDays && totalHours < companyEmpWage.maxWorkingHours) {
            int empHours = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    empHours = 4;
                    break;  // Part-time
                case 2:
                    empHours = 8;
                    break;  // Full-time
                default:
                    empHours = 0;// Absent
            }

            totalHours += empHours;
            totalDays++;
            int dailyWage = empHours * companyEmpWage.wagePerHour;
            totalWage += dailyWage;

            System.out.println(companyEmpWage.company + " - Day " + totalDays + ": Hours Worked = " + empHours + ", Daily Wage = ₹" + dailyWage);
        }

        return totalWage;
    }
}
