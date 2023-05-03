public class Dragon extends Torching{
    public Dragon(int level) {
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
}
