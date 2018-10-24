package pl.edu.agh.dronka.shop.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemElectronics implements Item {

	private String name;

	private Category category;

	private int price;

	private int quantity;

	private boolean secondhand;

	private boolean polish;
	
	private boolean mobile;
	
	private boolean warranty;

	public ItemElectronics(String name, Category category, int price, int quantity, boolean warranty, boolean mobile) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.warranty = warranty;
		this.mobile = mobile;
	}

	public ItemElectronics(String name, Category category, int price, int quantity) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public ItemElectronics() {
	}

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSecondhand(boolean secondhand) {
		this.secondhand = secondhand;
	}

	public boolean isSecondhand() {
		return secondhand;
	}

	public void setPolish(boolean polish) {
		this.polish = polish;
	}

	public boolean isPolish() {
		return polish;
	}
	public Map<String, Object> getPropertiesMap() {
		Map<String, Object> propertiesMap = new LinkedHashMap<>();
		propertiesMap.put("Nazwa", this.getName());
		propertiesMap.put("Cena", this.getPrice());
		propertiesMap.put("Kategoria", this.getCategory().getDisplayName()); 
		propertiesMap.put("Ilość", Integer.toString(this.getQuantity()));
		propertiesMap.put("Tanie bo polskie", this.isPolish());
		propertiesMap.put("Używany", this.isSecondhand());
		propertiesMap.put("Mobilny", this.isMobile());
		propertiesMap.put("Gwarancja", this.isWarranty());
		return propertiesMap;
	}
	@Override
	public String toString() {
		return getName();
	}
}
