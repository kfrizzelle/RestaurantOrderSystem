/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderSystem;

import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class ReceiptBuilder {
    
    private String[] items;
    private String customerName;
    private double ITEM_PRICE = 9.99;
    private double TAX_RATE = 0.051;
    private double GOOD_TIP = 0.25;
    private double subTotal = 0;
    private double total = 0;
    private double tip = 0;
    private double tax = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    
    public double calculateSubTotal(){
        subTotal=items.length*ITEM_PRICE;
        return Double.valueOf(df.format(subTotal));
    }
    
    public double calculateTax(){
        tax=items.length*ITEM_PRICE*TAX_RATE;
        return Double.valueOf(df.format(tax));
    }
    
    public double calculateTotal(){
        total=(items.length*ITEM_PRICE*TAX_RATE)+(items.length*ITEM_PRICE);
        return Double.valueOf(df.format(total));
    }
    
    public double calculateTip(){
        tip=((items.length*ITEM_PRICE*TAX_RATE)+(items.length*ITEM_PRICE))*GOOD_TIP;
        return Double.valueOf(df.format(tip));
    }
    
    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    
    
}
