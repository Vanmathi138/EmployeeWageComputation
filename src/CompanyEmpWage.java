import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
    public final String company;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;
    public int totalWage;
    public ArrayList<Integer> dailyWage;

    public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWage = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString() {
        return "Total wage for " + company + " is ₹" + totalWage;
    }
}
