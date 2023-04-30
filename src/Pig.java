public class Pig implements Animal{

    @Override
    public void Sound() {
        System.out.println("wee");
    }

    @Override
    public int Speed() {
        return 1;
    }

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }
}
