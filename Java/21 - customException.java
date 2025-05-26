import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class customException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age is less than 18");
            } else {
                System.out.println("Access granted");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
