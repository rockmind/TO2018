package pl.edu.agh.dronka.shop.model.util;

import java.util.Map;

import pl.edu.agh.dronka.shop.model.Item;

public class PropertiesHelper {

	public static Map<String, Object> getPropertiesMap(Item item) {
		Map<String, Object> propertiesMap = item.getPropertiesMap();		
		return propertiesMap;
	}
}
