import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee e = new Employee("Sohel Rana", "Day", 1000);

        System.out.print("Employee Name: " + e.getName());
        System.out.print("\nEmployee Shift: " + e.getShift());
        System.out.print("\nEmployee Salary: " + e.getsSalary() + "\n");
        System.out.print(e.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Employee name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Shift: ");
        String empShift = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        long empSalary = sc.nextLong();

        e.setName(empName);
        e.setShift(empShift);
        e.setSalary(empSalary);

        System.out.print("Employee Name: " + e.getName());
        System.out.print("\nEmployee Shift: " + e.getShift());
        System.out.print("\nEmployee Salary: " + e.getsSalary() + "\n");
        System.out.print(e.toString());
    }
}
