package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class MultipliedTax implements TaxStrategy {
    @Override
    public Tax computeTax(Money net, BigDecimal ratio, String desc) {
        return new Tax(net.multiplyBy(ratio), desc);
    }
}
