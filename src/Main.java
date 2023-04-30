public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.Name());
        lion.Sound();
        System.out.println("speed "+lion.Speed()+"\n");

        Pig pig = new Pig();
        System.out.println(pig.Name());
        pig.Sound();
        System.out.println("speed "+pig.Speed()+"\n");

        Chimera chimera = new Chimera();
        System.out.println(chimera.Name());
        System.out.println("has wings: "+chimera.Wings());
        System.out.println("can fly: "+chimera.canFly());
        System.out.println("speed "+chimera.Speed()+"\n");

        // lambda + runnable is more flexible and support multi-core cpu

        /*
        *  chimera.run(()-> {chimera.Sound();});
        *  replace statement lambda with expression lambda
        *
        * chimera.run(()-> chimera.Sound());
        * replace lambda with method reference
        *
        * chimera.run(chimera::Sound);
        *
        * */
        chimera.run(chimera::Sound);

    }
}