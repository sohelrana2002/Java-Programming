public class HomeComponent implements Component{
    public void getComponent(String name){
        System.out.println("Component Name: " + name);
    };
    
    public void display(){
        System.out.println("This is normal method");
    }
};