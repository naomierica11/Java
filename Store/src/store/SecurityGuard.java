package store;

/**
 * This is the SecurityGuard class file extends AbstractStoreEmployee.
 * Represents a security guard in the store.
 * 
 * @author Naomi Erica
 */
public class SecurityGuard extends AbstractStoreEmployee {

    private boolean nightShift;

    /**
     * This is an argument constructor which initializes all the instance variables
     * including the specific attribute for a SecurityGuard.
     *
     * @param numberOfHoursWorked - The parameter Number of hours worked is passed.
     * @param hourlyRate         - The parameter Hourly rate of the Employee in dollars is passed.
     * @param storeDetails       - The parameter Details of the Store is passed.
     * @param basePay            - The parameter Base pay of the Employee in dollars is passed.
     * @param employeeName       - The parameter Full name of the Employee is passed.
     * @param nightShift         - The parameter indicating whether the security guard works night shift.
     */
    public SecurityGuard(double numberOfHoursWorked, double hourlyRate, String storeDetails,
            double basePay, String employeeName, boolean nightShift) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.nightShift = nightShift;
    }

    /**
     * Calculates pay for a SecurityGuard.
     *
     * @return - This method returns the calculated pay for a security guard.
     */
    @Override
    public double calculatePay() {
        double basePayment = super.getNumberOfHoursWorked() * super.getHourlyRate() + super.getBasePay();

        // Additional logic for night shift bonus
        if (nightShift) {
            basePayment += 50.0; // Night shift bonus amount (adjust as needed)
        }

        return basePayment;
    }

    /**
     * Checks if the security guard should be awarded with a promotion.
     *
     * @return - This method returns the eligibility status for promotion for a security guard.
     */
    @Override
    public boolean checkPromotionEligibility() {
        // Custom logic for promotion eligibility for a security guard
        return super.getNumberOfHoursWorked() > 200; // Adjust as needed
    }

    /**
     * Returns whether the security guard works night shift.
     *
     * @return - This method returns a boolean indicating if the security guard works night shift.
     */
    public boolean isNightShift() {
        return nightShift;
    }

    /**
     * Sets whether the security guard works night shift.
     *
     * @param nightShift - The parameter indicating whether the security guard works night shift.
     */
    public void setNightShift(boolean nightShift) {
        this.nightShift = nightShift;
    }

    /**
     * Returns the String representation of security guard details.
     *
     * @return - This method returns a String representation of security guard details.
     */
    @Override
    public String toString() {
        return super.toString() + "Night Shift: " + (nightShift ? "Yes" : "No");
    }

    @Override
    public String getEmployeeName() {
        return super.getEmployeeName();
    }

    @Override
    public int calculatePerformanceRating() {
        // SecurityGuard-specific performance rating calculation
        return (int) (getNumberOfHoursWorked() / 8); // Example calculation
    }

    @Override
    public boolean performNewStoreAction(int inventoryCount) {
        // Provide the implementation for performNewStoreAction for Security
        return false; // replace with actual result
    }

    @Override
    public int performNewEmployeeAction(int hoursWorked) {
        // Provide the implementation for performNewEmployeeAction for Security
        return 0; // replace with actual result
    }
}
