package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceCreator {
    public static Invoice createInvoice(Id invoiceId, ClientData client){
        Invoice invoice = new Invoice(invoiceId,client);
        return invoice;
    }
}
