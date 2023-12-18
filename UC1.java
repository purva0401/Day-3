package EmployeeWage;

public class UC1 {
    public static void main(String args[]){

    int FullTime = 5;
    double empCheck = Math.floor(Math.random() * 10) % 2;
    if(empCheck == FullTime)
            System.out.println("Employee is Present");
    else
            System.out.println("Employee is Absent");
}
}
