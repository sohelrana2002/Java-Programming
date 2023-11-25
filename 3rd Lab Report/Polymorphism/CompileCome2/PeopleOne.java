public class PeopleOne extends People {

    String add;

    public void setAdd(String add) {
        this.add = add;
    }

    public void display() {
        super.display();

        System.out.println("Adress :" + add);
    }

}