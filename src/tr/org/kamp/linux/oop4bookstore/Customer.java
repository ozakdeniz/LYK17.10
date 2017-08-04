package tr.org.kamp.linux.oop4bookstore;

import java.util.ArrayList;

public class Customer {
	
	protected String customerName;
	protected String customerSurname;
	ArrayList<Purchase> purchaseHistory;
	protected int purchaseCount;
	
	public void placePurchase(Purchase purchase) {
		purchaseHistory.add(purchase);
		purchaseCount++;
	}
	Customer(){
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public ArrayList<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}
	public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}
	public int getPurchaseCount() {
		return purchaseCount;
	}
	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	
	
}