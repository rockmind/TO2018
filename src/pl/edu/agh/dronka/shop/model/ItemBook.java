package pl.edu.agh.dronka.shop.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemBook implements Item {

	private String name;

	private Category category;

	private int price;

	private int quantity;
	
	private boolean secondhand;

	private boolean polish;

	private int pageNumber;
	
	private boolean hardcover;

	public ItemBook(String name, Category category, int price, int quantity, int pageNumber, boolean hardcover) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.pageNumber = pageNumber;
		this.hardcover = hardcover;
	}

	public ItemBook(String name, Category category, int price, int quantity) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public ItemBook(Category category) {
		this.category = category;
	}

	public ItemBook() {
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public boolean isHardcover() {
		return hardcover;
	}

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
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
		propertiesMap.put("Liczba stron", this.getPageNumber());
		propertiesMap.put("Twarda oprawa", this.isHardcover());
		return propertiesMap;
	}
	@Override
	public String toString() {
		return getName();
	}
}
