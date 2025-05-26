import java.util.*;

class HashMapExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Enter ID and name pairs (type -1 to stop):");
        while (true) {
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine();
            String name = sc.nextLine();
            map.put(id, name);
        }
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        if (map.containsKey(searchId)) {
            System.out.println("Name: " + map.get(searchId));
        } else {
            System.out.println("ID not found");
        }
    }
}
