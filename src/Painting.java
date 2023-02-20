import java.util.Scanner;

public class Painting {
    private String name;
    private String author;
    private double price;
    private int year;
    private int uniqueNumber;

    public Painting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter painting name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter author name: ");
        this.author = scanner.nextLine();
        System.out.print("Enter painting price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter year of creation: ");
        this.year = scanner.nextInt();
        System.out.print("Enter unique number: ");
        this.uniqueNumber = scanner.nextInt();
    }

    public Painting(String name, String author, double price, int year, int uniqueNumber) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year of creation: " + year);
        System.out.println("Unique number: " + uniqueNumber);
    }
}