
package business.externalinterfaces;

import java.time.LocalDate;
import java.util.List;


public interface Order {
    public List<OrderItem> getOrderItems();    
	public LocalDate getOrderDate();		
	public int getOrderId();		
	public double getTotalPrice();
    public Address getShipAddress();
    public Address getBillAddress();
    public CreditCard getPaymentInfo();
    public void setShipAddress(Address address);
    public void setBillAddress(Address address);
    public void setPaymentInfo(CreditCard cc);
}



