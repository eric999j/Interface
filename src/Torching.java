public abstract class Torching {
    final private int level; // 1-5

    public Torching(int level){
        this.level = level;
    }

    public abstract String Name();

    public abstract boolean isLegend();

    public int getFireLevel(){
        return level;
    }

}
