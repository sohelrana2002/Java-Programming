public class StudentName {
    private String fName;
    private String lName;

    public void setName(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void getName(){
        System.out.println("Your first name is: " + fName);
        System.out.println("Your last name is: " + lName);
    }

}
