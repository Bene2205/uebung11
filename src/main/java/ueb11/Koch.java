package ueb11;

public class Koch implements Runnable{

    String name;
    int anzahlSpeise;
    Durchreiche<Speise> durchreiche;

    Koch(String name, int anzahlSpeise, Durchreiche<Speise> durchreiche) {
        this.name = name;
        this.anzahlSpeise = anzahlSpeise;
        this.durchreiche = durchreiche;
    }

    @Override
    public void run() {
        for (int i = 0; i < anzahlSpeise; i++) {
            Speise s = new Speise("Essen " + i);
            System.out.println(name + " hat " + s.toString() + " in Durchreiche gestellt");
            durchreiche.put(s);
        }

    }
}
