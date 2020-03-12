package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public interface TaxStrategy {
    public Money computeTax(Money net, BigDecimal ratio);
}
