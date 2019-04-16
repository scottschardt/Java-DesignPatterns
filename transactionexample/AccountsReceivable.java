public class AccountsReceivable{
    private Accounting transactionObject;

    public AccountsReceivable(CustomerTransaction transactionObject){
        transactionObject = atransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }
    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}