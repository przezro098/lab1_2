package pl.com.bottega.ecommerce.sales.domain.invoicing;

public abstract class AbstractTaxStrategy {
    public abstract Tax calculateTax(RequestItem requestItem);
}
