public class Chimera implements Animal, Bird{
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

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }

    public void run(Runnable action){
        for(int i= 0; i< 20; i++){
            action.run();
        }
    }
}
