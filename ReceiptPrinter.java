package hwone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReceiptPrinter {
    public static void main(String[] args) {
        printReceipt();
    }

    public static void printReceipt() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        String formattedDate = dateFormat.format(date);

        System.out.println("----------------------------------------------");
        System.out.printf("Name\t\tQty\t\tPrice\t\tTotal%n");
        System.out.println("----\t\t---\t\t-----\t\t-------");
        System.out.printf("%-10s\t%3d\t\t$%.2f\t\t$%.2f%n", productName, quantity, price, total);
        System.out.println();
        System.out.println("\t\tThank you. Come again!!!");
        System.out.println();
        System.out.println("Purchased on: " + formattedDate);
        System.out.println("----------------------------------------------");
    }
}
