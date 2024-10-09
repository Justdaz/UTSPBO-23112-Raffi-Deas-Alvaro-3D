import user.Admin;
import user.Customer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang!");
        System.out.print("Anda Admin atau Customer? ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("Admin")) {
            Admin admin = new Admin();
            admin.login(); 
        } else if (role.equalsIgnoreCase("Customer")) {
            Customer customer = new Customer();
            customer.reservasiKamar(); 
        } else {
            System.out.println("Role tidak valid.");
        }
    }
}
