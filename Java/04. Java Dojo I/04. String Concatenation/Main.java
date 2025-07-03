import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("First Name: ");
    String firstName = scanner.next();
    
    System.out.print("Last name: ");
    String lastName = scanner.next();
    
    String name = firstName + " " + lastName;
    
    System.out.println("My name is " + name + ".");
  }
}
