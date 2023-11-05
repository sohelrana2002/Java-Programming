public class Employee{
    private String name;
    private String shift;
    private long salary;

    public Employee(String name, String shift, long salary){
        this.name = name;
        this.shift = shift;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setShift(String shift){
        this.shift = shift;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public String getShift(){
        return shift;
    }
    public long getsSalary(){
        return salary;
    }

    public String toString(){
        return ("Employee[Name: " + name + ", Shift: " + shift + ", Salary: " + salary + "]");
    }
}