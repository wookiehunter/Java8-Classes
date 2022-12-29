import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayDemo {
    public static void main(String[] args) {

        String [] array = {"that", "this", "other"};

        ArrayList<String> aList1 = new ArrayList<String>(Arrays.asList(array));
        System.out.println(aList1.toString());

        aList1.add("neither");
        System.out.println(aList1.toString());

        aList1.add(1, "dither");
        System.out.println(aList1);

        String [] array2 = {"when", "what", "why"};
        List<String> list1 = new ArrayList<>(Arrays.asList(array2));

        aList1.addAll(1, list1);
        System.out.println(aList1);

        String item = aList1.get(2);
        System.out.println(item);

        aList1.set(0, "Green");
        System.out.println(aList1);

        aList1.remove("Green");
        System.out.println(aList1);

        String [] array3 = {"when", "what", "why"};
        List<String> list2 = new ArrayList<>(Arrays.asList(array3));
        System.out.println(list2);
        boolean flag = aList1.removeAll(list2);
        System.out.println(aList1);

        int size = aList1.size();
        System.out.println(size);

        aList1.clear();
        System.out.println(aList1);

//        Inspect and Traverse

        String [] array4 = {"that", "this", "other"};

        ArrayList<String> aList3 = new ArrayList<String>(Arrays.asList(array4));
        System.out.println(aList3.toString());

        boolean flag1 = aList3.contains("that");
        System.out.println(flag1);

        String [] array5 = {"this", "that", "other"};

        ArrayList<String> aList4 = new ArrayList<String>(Arrays.asList(array5));
        System.out.println(aList4.toString());

        flag1 = aList3.equals(aList4);
        System.out.println(flag1);

        for (String word:aList4) {
            System.out.println(" - " + word);
        }

        ListIterator<String> iterator = aList4.listIterator();
        while (iterator.hasNext()) {
            System.out.println(" - " + iterator.next());
        }

        aList4.forEach(name -> System.out.println(" - " + name));

        aList4.sort(null);
        System.out.println(aList4);

//        autoboxing

        ArrayList<Integer> intList1 = new ArrayList<>();
        Integer number = 9;
        intList1.add(number);
        System.out.println(intList1);

        intList1.add(10);
        System.out.println(intList1);

        int iNum = intList1.get(1);
        System.out.println(iNum);

    }
}
