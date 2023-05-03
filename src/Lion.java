public class Lion implements Animal{

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
