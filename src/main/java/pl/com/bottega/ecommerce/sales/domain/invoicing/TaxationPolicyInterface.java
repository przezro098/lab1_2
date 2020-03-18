package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxationPolicyInterface {
    public Tax computeTax(RequestItem itemToTax);
}
