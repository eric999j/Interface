public class Lion implements SoundBehavior {

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }
    @Override
    public void Sound() {
        System.out.println("growl");
    }

    @Override
    public int Speed() {
        return 5;
    }
}
