// PrintSales.java
public class PrintSales extends Sales {

    // Constructor that accepts SalesModel
    public PrintSales(SalesModel model) {
        super(model);
    }

    // Print method to display shoe brand and sales amount
    public void Print() {
        System.out.println("Shoe Brand: " + GetShoeBrand());
        System.out.println("Sales Amount: R" + GetBrandSales());
        System.out.println("-".repeat(30));
    }
}