package oop.keyacosmeticsltd.keya_cosmetics__ltd;

public class BudgetDetailsM {
    private String productName;
    private double budget;
    private String department;
    private String allocationDate;


    public BudgetDetailsM(String productName, double budget, String department, String allocationDate) {
        this.productName = productName;
        this.budget = budget;
        this.department = department;
        this.allocationDate = allocationDate;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(String allocationDate) {
        this.allocationDate = allocationDate;
    }

    @Override
    public String toString() {
        return "BudgetDetailsM{" +
                "productName='" + productName + '\'' +
                ", budget=" + budget +
                ", department='" + department + '\'' +
                ", allocationDate='" + allocationDate + '\'' +
                '}';
    }
}
