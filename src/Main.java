public class Main {
    public static void main(String[] args) {
        int value = 3;
        MagicBox<String> box1 = new MagicBox<>(value);
        MagicBox<Number> box2 = new MagicBox<>(value);

        System.out.println("Попытаемся добавить в box1 слово \"word1\": " + box1.add("word1"));
        System.out.print("Попытаемся вызвать метод pick() у неполной box1: ");
        try {
            box1.pick();
        } catch (NotFullException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Попытаемся добавить в box2 число 1,5: " + box2.add(1.5));
        System.out.println("Попытаемся добавить в box2 число 100: " + box2.add(100));
        System.out.println("Попытаемся добавить в box2 число -1: " + box2.add(-1));
        System.out.println("Попытаемся добавить в box2 число 3,333: " + box2.add(3.333));
        System.out.println();
        try {
            System.out.print("Попытаемся вызвать метод pick() у box2: " + box2.pick());
        } catch (NotFullException e) {
            e.printStackTrace();
        }
    }
}
