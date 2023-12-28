public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.Name());
        lion.setSound("growl");
        lion.Sound();
        System.out.println("speed "+lion.Speed()+"\n");

        Pig pig = new Pig();
        System.out.println(pig.Name());
        pig.setSound("wee");
        pig.Sound();
        System.out.println("speed "+pig.Speed()+"\n");

        Dragon dragon = new Dragon(5);
        System.out.println(dragon.Name());
        System.out.println("is legend: "+ dragon.isLegend());
        System.out.println("fire level: "+ dragon.getFireLevel()+"\n");

        Chimera chimera = Chimera.getInstance(); // Singleton
        System.out.println(chimera.Name());
        System.out.println("has wings: "+chimera.Wings());
        System.out.println("can fly: "+chimera.canFly());
        chimera.setSound("bleat");
        chimera.Sound();
        System.out.println("speed "+chimera.Speed());
        System.out.println("is legend: "+ chimera.isLegend());
        System.out.println("fire level: "+ chimera.getFireLevel()+"\n");

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