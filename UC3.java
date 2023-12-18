package EmployeeWage;

public class UC3 {
    public static void main(String[] args) {
        int PartTime = 1;
        int FullTime = 2;
        int Emp_Wage_Per_Hour = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
                if(empCheck == PartTime)
                    empHrs = 4;
                else if (empCheck == FullTime)
                    empHrs = 8;
                else
                    empHrs = 0;
                empWage = empHrs * Emp_Wage_Per_Hour;
        System.out.println("Emp Wage:" + empWage);
    }
}
