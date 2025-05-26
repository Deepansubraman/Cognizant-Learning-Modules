import java.util.*;

class ArrayListExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names (type 'end' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equals("end")) break;
            names.add(name);
        }
        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
