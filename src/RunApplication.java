// RunApplication.java
public class RunApplication {
    public static void main(String[] args) {
        System.out.println("SALES APPLICATION");

        // Create SalesModel objects with sample data
        SalesModel nikeSales = new SalesModel("Nike", 1500000);
        SalesModel adidasSales = new SalesModel("Adidas", 1800000);
        SalesModel reebokSales = new SalesModel("Reebok", 1200000);

        // Create PrintSales objects
        PrintSales nike = new PrintSales(nikeSales);
        PrintSales adidas = new PrintSales(adidasSales);
        PrintSales reebok = new PrintSales(reebokSales);

        // Display sales information
        nike.Print();
        adidas.Print();
        reebok.Print();

        // Calculate and display total sales
        int totalSales = nike.GetBrandSales() + adidas.GetBrandSales() + reebok.GetBrandSales();
    }
}