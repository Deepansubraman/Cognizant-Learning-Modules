import java.util.*;

class LambdaExpression{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        Collections.sort(list, (a, b) -> a.compareTo(b));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
