public class Lion implements SoundBehavior {

    private String sound;

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void Sound() {
        System.out.println(getSound());
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public int Speed() {
        return 5;
    }
}
