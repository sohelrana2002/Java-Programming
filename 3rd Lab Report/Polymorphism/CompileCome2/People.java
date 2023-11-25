public class People {
    private int num, nid;
    private String name;

    public People() {
        num = 404;
        nid = 404;
        name = "Undifind";
    }

    public void info(int num) {
        this.num = num;
    }

    public void info(String name, int nid) {
        this.name = name;
        this.nid = nid;
    }

    public void display() {
        System.out.println("Phone Number :" + num);
        System.out.println("NID :" + nid);
        System.out.println("Name :" + name);
    }
}