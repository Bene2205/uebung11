package ueb11;

public interface Durchreiche<T> {
	/**
	 * Etwas aus der Durchreiche nehmen.
	 * @return
	 */
	T get() throws InterruptedException;

	/**
	 * Etwas in die Durchreiche stellen.
	 * @param o
	 */
	void put(T o);
}

