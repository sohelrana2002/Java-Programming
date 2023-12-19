public class Employee extends Person {
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return("Employee[Name: " + name + ", Age: " + age + ", Id: " +  id+ "]");
    }
}
