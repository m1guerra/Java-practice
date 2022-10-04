import java.util.Scanner;

class QuickStart {
    public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("What is your name? ");
      String name = scanner.nextLine();

      System.out.printf("Hello %s. How old are you? ", name);
      int age = Integer.parseInt(scanner.nextLine());

      System.out.printf("%d is an excellent age to start programming.", age);

      scanner.close();
    }
}