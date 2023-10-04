import java.util.Scanner;

public class Main {
public static void main(String[] args) {
char grade;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your result grade: ");
grade = sc.next().charAt(0);
switch (grade) {
case 'A':
System.out.println("Excellent!");
break;
case 'B':
System.out.println("Good!");
break;
case 'C':
System.out.println("Well done");
break;
case 'D':
System.out.println("You passed");
break;
case 'F':
System.out.println("Better try again");
break;
default:
System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);
}
}