package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class paymentCreator {
    public static Payment createPayment(ClientData data, Money money) {
        Id id = Id.generate();
        return new Payment(id, data, money);
    }
}
