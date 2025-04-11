public class OrderReportDTO {
    private String customerName;
    private String productName;
    private int quantity;
    private double totalPrice;

    public OrderReportDTO(String customerName, String productName, int quantity, double totalPrice) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Getters & Setters
}