public class Animal{
    private String animalName;
    private String food;

    public Animal(String animalName, String food){
        this.animalName = animalName;
        this.food = food;
    };

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public void setFood(String food){
        this.food = food;
    }

    public String getAnimalName(){
        return animalName;
    }

    public String getFood(){
        return food;
    }

    public String toString(){
        return(
            "Animal[Animal name: " + animalName + ", and favorite food: " + food + "]"
        );
    }
}