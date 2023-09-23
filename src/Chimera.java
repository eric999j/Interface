public class Chimera extends Torching implements Animal, Birds{

        // keep one instance
        /*
        private static Chimera instance;
        private Chimera(int level) {
            super(level);
        }
        public static Chimera getInstance(){
            // insure we need synchronized
            if(instance == null){
                synchronized(Chimera.class){ // synchronized lock in multi-thread
                    // insure to make from null
                    if(instance == null){
                        instance = new Chimera(3);
                    }
                }
            }
            return instance;
        }
        */

        private Chimera(int level) {
            super(level);
        }
        private static class InstanceHolder {
            public static Chimera instance = new Chimera(3);
        }

        public static Chimera getInstance() {
            return InstanceHolder.instance;
        }

    @Override
    public String Name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isLegend() {
        return true;
    }

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

    public void run(Runnable action){
        for(int i= 0; i< 20; i++){
            action.run();
        }
    }
}
