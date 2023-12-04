abstract public class Animal{
    protected boolean fly, swim, run;

    public void setFly(boolean fly){
        this.fly = fly;
    }
    public void setSwim(boolean swim){
        this.swim = swim;
    }
    public void setRun(boolean run){
        this.run = run;
    }

    public boolean getFly(){
        return fly;
    }

    public boolean getSwim(){
        return swim;
    }

    public boolean getRun(){
        return run;
    }

    abstract boolean canFly();
    abstract boolean canRun();
    abstract boolean canSwim();
}