package ueb11;

import java.util.ArrayList;

public class DurchreicheImpl<T> implements Durchreiche<T> {

    ArrayList<T> q;
    int kMax;

    DurchreicheImpl(int kMax) {
        this.kMax = kMax;
        q = new ArrayList<>();
    }

    @Override
    public T get() {
        synchronized (this) {
            while (q.isEmpty()) {
                try {
                    System.out.println("Durchreiche ist leer");
                    this.wait(500);
                    System.out.println("gibt nix mehr");
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T o = q.remove(0);
            this.notifyAll();
            return o;
        }
    }

    @Override
    public void put(T o) {
        synchronized (this) {
            if (q.size() == kMax) {
                try {
                    System.out.println("Durchreiche is voll");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q.add(o);
            this.notifyAll();
        }
    }

}
