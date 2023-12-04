public class Cat extends Animal{
    boolean canFly(){
        if(fly){
            return true;
        }
        return false;
    }

    boolean canRun(){
       if(run){
            return true;
        }
        return false;
    }

    boolean canSwim(){
        if(swim){
            return true;
        }
        return false;
    }
}
