public class Person{
    protected String name;
    protected int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return("Person[Name: " + name + ", Age: " + age + "]");
    }
}