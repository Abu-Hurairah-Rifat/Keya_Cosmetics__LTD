package oop.keyacosmeticsltd.keya_cosmetics__ltd;

public class AccountantWage {
    boolean status;
    int employeeID, wageAmount;
    double bonus;
    String employeeName;

    public AccountantWage(boolean status, int employeeID, int wageAmount, double bonus, String employeeName) {
        this.status = status;
        this.employeeID = employeeID;
        this.wageAmount = wageAmount;
        this.bonus = bonus;
        this.employeeName = employeeName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getWageAmount() {
        return wageAmount;
    }

    public void setWageAmount(int wageAmount) {
        this.wageAmount = wageAmount;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "AccountantWage{" +
                "status=" + status +
                ", employeeID=" + employeeID +
                ", wageAmount=" + wageAmount +
                ", bonus=" + bonus +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
