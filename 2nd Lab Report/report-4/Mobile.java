public class Mobile{
    private String mobileName;
    private String price;
    private String model;

    public Mobile(String mobileName,  String model, String price){
        this.mobileName = mobileName;
        this.model = model;
        this.price = price;
    };

    public void setMobileName(String mobileName){
        this.mobileName = mobileName;
    }

     public void setModel(String model){
        this.model = model;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getMobileName(){
        return mobileName;
    }

    public String getModel(){
        return model;
    }

    public String getPrice(){
        return price;
    }


    public String toString(){
        return(
            "Mobile[Mobile name: " + mobileName + ", Model Name: " + model + ", Price: " + price + "]"
        );
    }
}