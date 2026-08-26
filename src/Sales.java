// Sales.java
public abstract class Sales implements ISales {
    protected String shoeBrand;
    protected int brandSales;

    // Constructor that accepts a SalesModel
    public Sales(SalesModel model) {
        this.shoeBrand = model.ShoeBrand;
        this.brandSales = model.BrandSales;
    }

    // Method to retrieve shoe brand
    @Override
    public String GetShoeBrand() {
        return shoeBrand;
    }

    // Method to retrieve brand sales
    @Override
    public int GetBrandSales() {
        return brandSales;
    }
}