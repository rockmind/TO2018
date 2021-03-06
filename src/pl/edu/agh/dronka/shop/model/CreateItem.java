package pl.edu.agh.dronka.shop.model;

public class CreateItem {
	public static Item createItem(Category category) {
		Item item;
		switch (category) {
		case ELECTRONICS:
			item = (ItemElectronics) new ItemElectronics(category);
			break;
		case BOOKS:
			item = (ItemBook) new ItemBook(category);
			break;
		case FOOD:
			item = (ItemFood) new ItemFood(category);
			break;
		case MUSIC:
			item = (ItemMusic) new ItemMusic(category);
			break;
		case SPORT:
			item = (ItemSport) new ItemSport(category);
			break;
		default:
			item = new ItemDefault();
			break;
		}
		return item;
	}

	public static Item createItem(Category category, String name, int price, int quantity) {
		Item item;
		switch (category) {
		case ELECTRONICS:
			item = (ItemElectronics) new ItemElectronics(name, category, price, quantity);
			break;
		case BOOKS:
			item = (ItemBook) new ItemBook(name, category, price, quantity);
			break;
		case FOOD:
			item = (ItemFood) new ItemFood(name, category, price, quantity);
			break;
		case MUSIC:
			item = (ItemMusic) new ItemMusic(name, category, price, quantity);
			break;
		case SPORT:
			item = (ItemSport) new ItemSport(name, category, price, quantity);
			break;
		default:
			item = new ItemDefault(name, category, price, quantity);
			break;
		}
		return item;
	}
}
