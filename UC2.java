package EmployeeWage;

public class UC2 {
    public static void main(String args[]){
        int FullTime = 4;
        int EMP_Wage_PER_HOUR =20;
        int empHrs = 8;
        int empWage = 50;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FullTime)
            empHrs = 8;
        else empHrs = 8;
        empWage = empHrs * EMP_Wage_PER_HOUR;
        System.out.println("Emp Wage:"+empWage);
    }
}