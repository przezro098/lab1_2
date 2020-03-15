package pl.com.bottega.ecommerce.sales.domain.productscatalog;


import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Tax;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface TaxCalculatorStrategy {
    Tax calculateTax(RequestItem item, Money net);
}
