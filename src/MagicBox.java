import java.util.Random;

public class MagicBox<T> {
    protected Random random = new Random();
    protected T[] items;

    public MagicBox(int amount) {
        items = (T[]) new Object[amount];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() throws NotFullException {
        int count = 0;
        for (T item : items) {
            if (item == null) {
                count++;
            }
        }
        if (count != 0) {
            throw new NotFullException(count);
        } else {
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}
