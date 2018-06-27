package ueb11;

public class Restaurant {

    public static void main(String[] args) {

        Durchreiche<Speise> durchreiche = new DurchreicheImpl(5);
        Koch koch1 = new Koch("Hans", 15, durchreiche);
        Kellner kellner1 = new Kellner("Peter", 5, durchreiche);
        Kellner kellner2 = new Kellner("Otto", 5, durchreiche);

        Thread t1 = new Thread(koch1);
        Thread t2 = new Thread(kellner1);
        Thread t3 = new Thread(kellner2);

        t1.start();
        t2.start();
        t3.start();

    }
}
