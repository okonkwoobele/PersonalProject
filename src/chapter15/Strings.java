package chapter15;

public class Strings {
    public static void main(String[] args) {
        String name = "Zainab";
        String trmpval = name;
        name+="Ayo";
        System.out.println(name);
        System.out.println(trmpval);
        StringBuilder stringBuilder = new StringBuilder("kabir");
        StringBuilder value = stringBuilder;
        stringBuilder.append("james");
        System.out.println(stringBuilder);
        System.out.println(value);
        //stringBuilders are mutable while string are non
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        System.out.println(buffer1);
        System.out.println(buffer2);
        System.out.println(buffer3);

    }
}
