package company;

public class Purchase {
    private int invoiceNumber;
    private double sale;
    private double tax;
    private static final double TAX_RATE = .075;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSale(double sale) {
        this.sale = sale;
        this.tax = sale * TAX_RATE;
    }

    public void display () {
        System.out.printf("Invoice: %d\n",invoiceNumber );
        System.out.printf("Sales Amount $ %7.2f\n",sale);
        System.out.printf("Tax Amount   $ %7.2f\n",tax);
        System.out.printf("Total Cost   $ %7.2f\n",sale+tax);
    }

    public static void main(String[] args) {
        // write your code here
        Purchase purchase = new Purchase();
        purchase.setInvoiceNumber(111);
        purchase.setSale(153.66);
        purchase.display();
    }
}
