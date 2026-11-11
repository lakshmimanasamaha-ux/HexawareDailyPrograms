
import java.util.*;

class Order {
    int id;
    String customer, product;
    double price;

    Order(int id, String customer, String product, double price) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.price = price;
    }
}

public class RetailOrderDesk {

    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1.Add Order");
            System.out.println("2.Display Orders");
            System.out.println("3.Remove Order");
            System.out.println("4.Update Order");
            System.out.println("5.Sort by ID");
            System.out.println("6.Sort by Customer");
            System.out.println("7.Sort by Product");
            System.out.println("8.Sort by Price");
            System.out.println("9.Binary Search");
            System.out.println("10.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addOrder(); break;
                case 2: displayOrders(); break;
                case 3: removeOrder(); break;
                case 4: updateOrder(); break;
                case 5: sortById(); break;
                case 6: sortByCustomer(); break;
                case 7: sortByProduct(); break;
                case 8: sortByPrice(); break;
                case 9: binarySearch(); break;
                case 10: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice!");
            }

        } while (choice != 10);
    }

    static void addOrder() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String c = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String p = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        orders.add(new Order(id, c, p, price));
        System.out.println("Order Added!");
    }

    static void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No Orders!");
            return;
        }

        for (Order o : orders) {
            System.out.println(o.id + " " + o.customer + " "
                    + o.product + " " + o.price);
        }
    }

    static void removeOrder() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).id == id) {
                orders.remove(i);
                System.out.println("Order Removed!");
                return;
            }
        }
        System.out.println("Order Not Found!");
    }

    static void updateOrder() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Order o : orders) {
            if (o.id == id) {
                System.out.print("Enter New Customer: ");
                o.customer = sc.nextLine();

                System.out.print("Enter New Product: ");
                o.product = sc.nextLine();

                System.out.print("Enter New Price: ");
                o.price = sc.nextDouble();

                System.out.println("Order Updated!");
                return;
            }
        }
        System.out.println("Order Not Found!");
    }

    static void sortById() {
        orders.sort((a, b) -> a.id - b.id);
        displayOrders();
    }

    static void sortByCustomer() {
        orders.sort((a, b) -> a.customer.compareToIgnoreCase(b.customer));
        displayOrders();
    }

    static void sortByProduct() {
        orders.sort((a, b) -> a.product.compareToIgnoreCase(b.product));
        displayOrders();
    }

    static void sortByPrice() {
        orders.sort((a, b) -> Double.compare(a.price, b.price));
        displayOrders();
    }

    static void binarySearch() {
        orders.sort((a, b) -> a.id - b.id);

        System.out.print("Enter ID to Search: ");
        int id = sc.nextInt();

        int low = 0, high = orders.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (orders.get(mid).id == id) {
                Order o = orders.get(mid);
                System.out.println("Order Found!");
                System.out.println(o.id + " " + o.customer
                        + " " + o.product + " " + o.price);
                return;
            } else if (orders.get(mid).id < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Order Not Found!");
    }
}
