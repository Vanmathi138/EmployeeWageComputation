public interface EmployeeWageBuilderInterface {
    void addCompanyEmpWage(String company,int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWages();
}
