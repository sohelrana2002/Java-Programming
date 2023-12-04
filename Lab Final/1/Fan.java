public class Fan{
    private static final int SLOW = 1, MEDIAM = 2, FAST = 3;

    public void start(){
        System.out.println("Fan is started");
    }

    public void slow(){
        System.out.println("Fan's speed power: " + SLOW +  " (slow)");
    }

    public void mediam(){
        System.out.println("Fan's speed power: " + MEDIAM +  " (mediam)");
    }

    public void fast(){
        System.out.println("Fan's speed power: " + FAST +  " (fast)");
    }

    public void stop(){
        System.out.println("Fan is stoped");
    }
}