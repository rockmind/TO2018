package pl.edu.agh.dronka.shop.model;

import java.util.Map;

public interface Item {

	public void setName(String name);
	public String getName();
	public void setCategory(Category category);
	public Category getCategory();
	public int getPrice();
	public int getQuantity();
	public void setSecondhand(boolean secondhand);
	public boolean isSecondhand();
	public void setPolish(boolean polish);
	public boolean isPolish();
	public String toString();
	public Map<String, Object> getPropertiesMap() ;
}
