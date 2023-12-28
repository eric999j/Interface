public class Chimera extends TorchBehavior implements SoundBehavior, FlyBehavior {

        /*
        // v1: keep one instance

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

        // v2
        private Chimera(int level) {
            super(level);
        }
        private static class InstanceHolder {
            public static Chimera instance = new Chimera(3);
        }

        public static Chimera getInstance() {
            return InstanceHolder.instance;
        }
       */

        /*
         private and static for prevent public calling
         and allocate specific memory location

         volatile means the working memory of each thread is
         not used, and access, reading and writing are always
         done from the main memory.
        */
        private volatile static Chimera uniqueInstance;
        private String sound;

        private Chimera(int level) {super(level);}

        public static Chimera getInstance() {
            // if not instantized, into synchronized block
            if (uniqueInstance == null){
                synchronized (Chimera.class){ // use synchronized good for multithread, but lower performance
                    // check again in synchronized block
                    if(uniqueInstance == null)
                        uniqueInstance = new Chimera(3);
                }
            }
            return uniqueInstance;
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
        System.out.println(this.getSound());
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

    @Override
    public boolean Wings() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public int getFireLevel(){
        return 5;
    }

    public void run(Runnable action){
        for(int i= 0; i< 20; i++){
            action.run();
        }
    }
}
