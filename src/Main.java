import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Paintings paintings = new Paintings();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Add Picture");
            System.out.println("2. Delete Picture");
            System.out.println("3. Picture Information");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Author's Name: ");
                    scanner.nextLine();
                    String authorName = scanner.nextLine();
                    System.out.print("Enter Picture Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Year of Creation: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    try {
                        Painting painting = new Painting(id, authorName, title, year, price);
                        paintings.addPainting(painting);
                        System.out.println("Successfully added!");
                    } catch (Exception e) {
                        System.out.println("Error!" + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter ID of the picture you want to delete: ");
                    id = scanner.nextInt();
                    if (paintings.deletePainting(id)) {
                        System.out.println("Successfully deleted!");
                    } else {
                        System.out.println("Error: couldn't find a picture with this ID");
                    }
                    break;
                case 3:
                    System.out.print("Enter author's name: ");
                    scanner.nextLine();
                    authorName = scanner.nextLine();
                    System.out.println(paintings.getPaintings());
                    System.out.print("Press Enter to Continue...");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Thank you for using MiroLudiq's program !");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
}