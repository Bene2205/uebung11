package ueb11;

public class Kellner implements Runnable{

    String name;
    Durchreiche<Speise> durchreiche;
    int kBedien;

    Kellner(String name,int kBedien, Durchreiche<Speise> durchreiche) {
        this.name = name;
        this.durchreiche = durchreiche;
        this.kBedien = kBedien;
    }

    @Override
    public void run() {
        for(int i = 0; i < kBedien; i++) {
            try {
                Speise s = durchreiche.get();
                System.out.println(name + " hat " + s.toString() + " aus Durchreiche genommen");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
