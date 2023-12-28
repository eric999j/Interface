public class Pig implements SoundBehavior {
    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void Sound() {
        System.out.println("wee");
    }

    @Override
    public int Speed() {
        return 1;
    }
}
