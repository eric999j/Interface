public abstract class TorchBehavior{
    final private int level; // 1-5

    public TorchBehavior(int level){
        this.level = level;
    }

    public abstract String Name();

    public abstract boolean isLegend();

    public int getFireLevel(){
        return level;
    }

}
