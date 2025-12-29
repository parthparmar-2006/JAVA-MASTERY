package CollectionFramework;

import java.util.*;

public class PerformanceLab {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i=0; i<100000; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList Front Insertion: " + (end - start)/1e6 + "ms");

        start = System.nanoTime();
        for (int i=0; i<100000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Front Insertion: " + (end - start)/1e6 + "ms");   
        
        List<String> names = new ArrayList<>(Arrays.asList("Java","Python","C++","C#"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("C++")) {
                it.remove();
            }
        }
        System.out.println("Safe removal result: " + names);    }
}
