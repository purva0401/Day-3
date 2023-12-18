public static final int PartTime = 1;
    public static final int FullTime = 2;
    public static final int Emp_Wage_Per_Hour = 20;
    public static final int Num_of_Working_Days = 4;

    public static void main(String[] args) {
        int empHrs = 0, empWage = 0, totalEmpWage=0;
        for (int day = 0; day<Num_of_Working_Days; day++){
            int empCheck = (int) Math.floor(Math.random()*10)% 3;
            switch (empCheck){
                case PartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * Emp_Wage_Per_Hour;
            totalEmpWage += empWage;
            System.out.println("Emp Wage:" + empWage);
        }
        System.out.println("Total Emp Wage:" + totalEmpWage);
    }
}