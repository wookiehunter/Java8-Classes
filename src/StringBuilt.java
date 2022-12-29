import java.lang.StringBuilder;

public class StringBuilt {
    public static void main(String[] args) {
        java.lang.String str = "Hello";
        String str2 = "Hello";
        System.out.println(str == str2);

        String str3 = new String("Hello");
        System.out.println(str == str3); // false

        // Concatenation

        String st = "Hi, ";
        String st1 = st + "Charles!!";
        System.out.println(st1);

        String pi = "3.14" + 15926;
        System.out.println(pi);

        String str5 = 5+3 + "abc" + 3+5;
        System.out.println(str5);
        String str6 = (5+3) + "abc" + (3+5);
        System.out.println(str6);

        String str7 = "PI is ";
        str7 += "3.14";
        System.out.println(str7);

        str7 += "__" + 5*4;
        System.out.println(str7);

        // Methods
        // .equals() - case sensitive
        // .equalsIgnoreCase()
        // .length()
        // .toLowerCase()
        // .toUpperCase
        // .startsWith(test)
        // .endsWith(test)
        // .contains(test)
        // .trim()
        // .charAt(index)
        // .indexOf(test)
        // .subString(startIndex, endIndex)
        // .replace(old, new)

        // StringBuilder
        String str10 = "Xello";
        System.out.println(str10);
        String str11 = str10.replace("X", "H");
        System.out.println(str11);

        StringBuilder sB1 = new StringBuilder("Vello");
        System.out.println(sB1);
        StringBuilder sB2 = sB1.replace(0,1, "H");
        System.out.println(sB1);
        System.out.println(sB2);

        sB1 = new StringBuilder();
        System.out.println(sB1.length());
        System.out.println(sB1.capacity());

        sB1 = new StringBuilder("Hello");
        sB1.append(" ").append("matey");
        System.out.println(sB1);

        sB2 = new StringBuilder("boy!");
        sB1.append(" ").append(sB2);
        System.out.println(sB1);

        int indx = sB1.indexOf("m");
        System.out.println(indx);
        Character chr = sB1.charAt(indx);
        System.out.println(chr);

        sB1 = new StringBuilder("Hi there");
        sB1.replace(2,3,"-*-");
        System.out.println(sB1);

        sB1.deleteCharAt(3);
        System.out.println(sB1);

        sB1.delete(2,4);
        System.out.println(sB1);

        sB1.insert(2, " ");
        System.out.println(sB1);

        String str1 = sB1.substring(0,2);
        System.out.println(str1);
    }
}
