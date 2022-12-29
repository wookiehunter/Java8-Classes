import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
        class InnConsumer<String> implements Consumer<String> {
            @Override
            public void accept(String string) {
                System.out.println(" - " + string);
            }
        }
        InnConsumer innConsumer = new InnConsumer<String>();

        String [] array1 = {"that", "this", "other"};

        ArrayList<String> aList1 = new ArrayList<String>(Arrays.asList(array1));
//        System.out.println(aList1.toString());

        aList1.forEach(innConsumer);

//        Expressions

//        Consumer<String> lambdaConsumer = (String string) -> {
//            System.out.println(" - " + string);
//        };
//        Consumer<String> lambdaConsumer = string -> {
//            System.out.println(" - " + string);
//        };
        Consumer<String> lambdaConsumer = string -> System.out.println(" - " + string);
//        aList1.forEach(lambdaConsumer);
        aList1.forEach(string -> System.out.println(" - " + string));

        aList1.sort((str1, str2) -> str1.compareTo(str2));
        System.out.println(aList1);

//        Predicate

        String[] array2 = {"red", "blue", "cow", "horse", "car", "truck"};
        ArrayList<String> aList2 = new ArrayList(Arrays.asList(array2));
        ArrayList<String> aList3 = new ArrayList<>(Arrays.asList(array2));
        ArrayList<String> aList4 = new ArrayList<>(Arrays.asList(array2));

        Predicate<String> predicate = new Predicate<String>() {
          public boolean test(String color) {
              return color.endsWith("e");
          }
        };
        System.out.println("removeIf(predicate)");
        aList2.removeIf(predicate);
        System.out.println(aList2);

        aList3.removeIf(color -> color.endsWith("w"));
        System.out.println(aList3);

        Stream<String> fitered = aList4.stream().filter(color -> color.endsWith("e"));
        System.out.println(Arrays.toString(fitered.toArray()));

    }
}
