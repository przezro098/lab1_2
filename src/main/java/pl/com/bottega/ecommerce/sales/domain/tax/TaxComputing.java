package pl.com.bottega.ecommerce.sales.domain.tax;

import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;

public abstract class TaxComputing {

    public abstract Tax taxCompution(RequestItem requestItem);
}
