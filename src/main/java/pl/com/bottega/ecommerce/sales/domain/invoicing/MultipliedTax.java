package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class MultipliedTax implements TaxStrategy {
    @Override
    public Money computeTax(Money net, BigDecimal ratio) {
        return net.multiplyBy(ratio);
    }
}
