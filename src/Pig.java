public class Pig implements SoundBehavior{
    private String sound;

    public String Name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void Sound() {
        System.out.println(this.getSound());
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int Speed() {
        return 1;
    }

}
