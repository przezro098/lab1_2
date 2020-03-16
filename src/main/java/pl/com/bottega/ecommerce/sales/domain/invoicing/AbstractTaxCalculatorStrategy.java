package pl.com.bottega.ecommerce.sales.domain.invoicing;

public abstract class AbstractTaxCalculatorStrategy {

    public abstract Tax calculateTax(RequestItem requestItem);
}
