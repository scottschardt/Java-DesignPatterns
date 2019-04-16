import java.util.Date;

public class CustomerTransaction implements Accounting, Reporting { 


    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products){
        this.products = products;
        this.customer = customer;
    }

    public String getName(){
        return customer.getName();
    }
    public Date getDate(){
        return new Date();
    }
    public String productBreakDown(){
        String reportListing = null;
        for(Product product: products){
            reportListing += product.getProductName();
        }
        return reportListing;
    }

    public void prepareInvoice(){
        System.out.println("Invoice prepared...");
    }
    public void chargeCustomer(){
        System.out.println("Customer charged...");
    }
}