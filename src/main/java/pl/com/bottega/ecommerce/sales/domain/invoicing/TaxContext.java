package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class TaxContext {
    private TaxStrategy taxStrategy;

    public void setStrategy(TaxStrategy taxStrategy){
        this.taxStrategy = taxStrategy;
    }

    public Money compute(Money net, BigDecimal ratio){
        return taxStrategy.computeTax(net, ratio);
    }
}
