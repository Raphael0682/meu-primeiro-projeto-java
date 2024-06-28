import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ExemploCollections {
    public static void main(String[] args) {
        // Usando ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("ArrayList: " + list);

        // Usando HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");  // Elemento duplicado, não será adicionado
        System.out.println("HashSet: " + set);

        // Usando LinkedList como Queue
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Primeiro");
        queue.add("Segundo");
        queue.add("Terceiro");
        System.out.println("LinkedList como Queue: " + queue);

        // Usando HashMap
        HashMap<Integer, String> map = new HashMap<>();
            for (int i = 0; i <= 100; i++) {
                map.put(i, Integer.toHexString(i));
            }
        System.out.println("HashMap: " + map);
    }
}
