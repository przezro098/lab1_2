package pl.com.bottega.ecommerce.sales.domain.invoicing;

public abstract class AbstractTaxComputeStrategy {
	public abstract Tax computeTax(RequestItem requestItem);
}
