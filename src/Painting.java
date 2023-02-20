import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Painting {
    private String name;
    private String author;
    private double price;
    private int year;
    private int uniqueNumber;

    public Painting(int id, String authorName, String title, int year, double price) {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        this.author = scanner.nextLine();
        this.price = scanner.nextDouble();
        this.year = scanner.nextInt();
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
    public static void printMostExpensive(List<Painting> paintings) {
        List<Painting> mostExpensive = new ArrayList<>();
        double maxPrice = 0.0;
        for (Painting p : paintings) {
            if (p.getPrice() > maxPrice) {
                mostExpensive.clear();
                mostExpensive.add(p);
                maxPrice = p.getPrice();
            } else if (p.getPrice() == maxPrice) {
                mostExpensive.add(p);
            }
        }
        System.out.println("Most expensive painting(s):");
        for (Painting p : mostExpensive) {
            p.printInfo();
        }
    }

    public static double averagePrice(List<Painting> paintings, String author) {
        double sum = 0.0;
        int count = 0;
        for (Painting p : paintings) {
            if (author.isEmpty() || p.getAuthor().equalsIgnoreCase(author)) {
                sum += p.getPrice();
                count++;
            }
        }
        return count == 0 ? 0.0 : sum / count;
    }
}