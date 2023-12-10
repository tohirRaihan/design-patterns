package design_principles.single_responsibility_principle;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("John");
        customer1.setAddress("Pune");
        Order order1 = new Order();
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomer(customer1);

        order1.prepareOrder();

        BillCalculation billCalculation = new BillCalculation(order1);
        billCalculation.calculateBill();

        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.delivery();
    }
}

class Customer {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Order {

    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();

        this.orderId = orderId + "-" + random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(int totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }

    public void prepareOrder() {
        System.out.println("Preparing order for customer -"
                + this.getCustomer().getName()
                + " who has ordered "
                + this.getItemName());
    }
}

class BillCalculation {

    private Order order;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public void calculateBill() {
        /*
         * In the real world, we would want a kind of lookup
         * functionality implemented here where we look for
         * the price of each item included in the order, add
         * them up and add taxes, delivery charges, etc on
         * top to reach the total price. We will simulate
         * this behaviour here, by generating a random number
         * for total price.
         */
        Random rand = new Random();
        int totalAmt = rand.nextInt(200) * this.order.getQuantity();

        this.order.setTotalBillAmt(totalAmt);
        System.out.println("Order with order id  "
                + this.order.getOrderId()
                + " has a total bill amount of "
                + this.order.getTotalBillAmt());
    }
}

class DeliveryApp {

    private Order order;

    public DeliveryApp(Order order) {
        this.order = order;
    }

    public void delivery() {
        // Here, we would want to interface with another
        // system which actually assigns the task of
        // delivery to different persons
        // based on location, etc.
        System.out.println("Delivering the order");
        System.out.println(
                "Order with order id as "
                        + this.order.getOrderId()
                        + " being delivered to "
                        + this.order.getCustomer().getName());
        System.out.println(
                "Order is to be delivered to: "
                        + this.order.getCustomer().getAddress());
    }
}