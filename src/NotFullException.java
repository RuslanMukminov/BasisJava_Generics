public class NotFullException extends Exception {
    public NotFullException(int count) {
        super("Коробка не полна! Осталось заполнить " + count + " ячеек!");
    }
}
