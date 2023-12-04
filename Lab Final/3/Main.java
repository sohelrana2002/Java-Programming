public class Main {
    
    public static void main(String[] args) {
        System.out.println("For Bird");
        Animal b = new Bird();
        b.setFly(true);
        b.setRun(true);
        b.setSwim(false);
        if(b.canRun() && b.canSwim()){
            System.out.println("100% Human");
        }
        if(b.canFly() && b.canRun()){
            System.out.println("50% Human 50% bird");
        }
        if(b.canSwim()){
            System.out.println("100% fish");
        }

        System.out.println("For fish");
        Animal f = new Fish();
        f.setFly(false);
        f.setRun(false);
        f.setSwim(true);
        if(f.canRun() && f.canSwim()){
            System.out.println("100% Human");
        }
        if(f.canFly() && f.canRun()){
            System.out.println("50% Human 50% bird");
        }
        if(f.canSwim()){
            System.out.println("100% fish");
        }

        System.out.println("For cat");
        Animal c = new Cat();
        c.setFly(true);
        c.setRun(true);
        c.setSwim(false);
        if(c.canRun() && c.canSwim()){
            System.out.println("100% Human");
        }
        if(c.canFly() && c.canRun()){
            System.out.println("50% Human 50% bird");
        }
        if(c.canSwim()){
            System.out.println("100% fish");
        }
    }
}
