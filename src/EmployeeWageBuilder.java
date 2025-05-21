import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWageBuilder implements EmployeeWageBuilderInterface{

    private final ArrayList<CompanyEmpWage> companyEmpWageList;
    private final HashMap<String, CompanyEmpWage> companyMap = new HashMap<>();

    public EmployeeWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
        companyMap.put(company,companyEmpWage);
    }

    @Override
    public void computeWages() {
        for (CompanyEmpWage company : companyEmpWageList) {
            int totalWage = computeWage(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
            System.out.println("Daily Wages for " + company.company + ": " + company.dailyWage + "\n");
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
                    break;  // part time
                case 2:
                    empHours = 8;
                    break;  // Fulltime
                default:
                    empHours = 0;// Absent
            }

            totalHours += empHours;
            totalDays++;
            int dailyWages = empHours * companyEmpWage.wagePerHour;
            totalWage += dailyWages;

            companyEmpWage.dailyWage.add(dailyWages);
            System.out.println(companyEmpWage.company + " - Day " + totalDays + ": Hours Worked = " + empHours + ", Daily Wage = ₹" + dailyWages);
        }

        return totalWage;
    }
    public int getTotalWage(String companyName) {
        if (companyMap.containsKey(companyName)) {
            return companyMap.get(companyName).totalWage;
        } else {
            System.out.println("Company not found.");
            return -1;
        }
    }
}
