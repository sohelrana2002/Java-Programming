public class Overriding{
    public String name;
    public int id;


    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

     public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return(
            "Student[Name: " + name + ", Id: " + id + "]"
        );
    }

}