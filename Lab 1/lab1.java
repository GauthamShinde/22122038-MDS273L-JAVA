import java.util.Scanner;

public class lab1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter employee name: ");
    String name = input.nextLine();

    System.out.print("Enter employee age: ");
    int age = input.nextInt();

    System.out.print("Enter employee gender (m/f): ");
    char gender = input.next().charAt(0);

    System.out.print("Enter employee state: ");
    input.nextLine(); // to clear buffer
    String state = input.nextLine();

    System.out.print("Enter employee company: ");
    String company = input.nextLine();

    System.out.println("\nEmployee Details:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
    System.out.println("State: " + state);
    System.out.println("Company: " + company);

    if (state.equals("Andhra Pradesh") || state.equals("Karnataka") ||
        state.equals("Kerala") || state.equals("Tamil Nadu")) {
      System.out.print("The Employee is from the southern states of India; ");
      switch (state) {
        case "Andhra Pradesh":
          System.out.println("Preferred work location is in Hyderabad");
          break;
        case "Karnataka":
          System.out.println("Preferred work location is in Bengaluru");
          break;
        case "Kerala":
          System.out.println("Preferred work location is in Thiruvananthapuram");
          break;
        case "Tamil Nadu":
          System.out.println("Preferred work location is in Chennai");
          break;
      }
    }

    if (company.equals("Facebook") || company.equals("Google") ||
        company.equals("Microsoft") || company.equals("Samsung") ||
        company.equals("IBM") || company.equals("Apple")) {
      System.out.println("The employee is working in Top MNC Companies");
    }
  }
}