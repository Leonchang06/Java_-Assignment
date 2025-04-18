public class Customer extends User {
    private static int nextCustID=1001;
    private int customerID;
    private String phoneNo;
    private String paymentMethod;

    public Customer() {
        this.customerID=nextCustID++;
    }

    public Customer(String name, char gender, int age, String password, String email, String phoneNo,
            String paymentMethod) {
        super(name, gender, age, password, email);
        this.customerID = nextCustID++;
        this.phoneNo = phoneNo;
        this.paymentMethod = paymentMethod;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
