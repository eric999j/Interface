public class Chimera extends Torching implements Animal, Bird{

    public Chimera(int level) {
        super(level);
    }

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isLegend() {
        return true;
    }

    @Override
    public void Sound() {
        System.out.println("growl");
    }

    @Override
    public int Speed() {
        return 5;
    }

    @Override
    public boolean Wings() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    public void run(Runnable action){
        for(int i= 0; i< 20; i++){
            action.run();
        }
    }
}
