package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculations {

    public Tax calculateTax(RequestItem item);

}
