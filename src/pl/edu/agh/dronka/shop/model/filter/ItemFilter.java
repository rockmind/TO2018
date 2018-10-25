package pl.edu.agh.dronka.shop.model.filter;

import pl.edu.agh.dronka.shop.model.Category;
import pl.edu.agh.dronka.shop.model.CreateItem;
import pl.edu.agh.dronka.shop.model.Item;
import pl.edu.agh.dronka.shop.model.ItemBook;
import pl.edu.agh.dronka.shop.model.ItemElectronics;
import pl.edu.agh.dronka.shop.model.ItemFood;
import pl.edu.agh.dronka.shop.model.ItemMusic;
import pl.edu.agh.dronka.shop.model.ItemSport;

public class ItemFilter {
	private Item itemSpec;// = (ItemDefault) new ItemDefault();

	public Item getItemSpec() {
		return itemSpec;
	}

	public void setItemSpec(Category category) {
		this.itemSpec = CreateItem.createItem(category);
	}

	public boolean appliesTo(Item item) {
		if (itemSpec.getName() != null && !itemSpec.getName().equals(item.getName())) {
			return false;
		}
		if (itemSpec.getCategory() != null && !itemSpec.getCategory().equals(item.getCategory())) {
			return false;
		}

		// applies filter only if the flag (secondHand) is true)
		if (itemSpec.isSecondhand() && !item.isSecondhand()) {
			return false;
		}

		// applies filter only if the flag (polish) is true)
		if (itemSpec.isPolish() && !item.isPolish()) {
			return false;
		}
		switch (itemSpec.getCategory()) {
		case BOOKS:
			if (!(item instanceof ItemBook)) {
				return false;
			}
			else {
				// applies filter only if the flag (warranty) is true)
				if (((ItemBook) itemSpec).isHardcover() && !((ItemBook) item).isHardcover()) {
					return false;
				}
			}
			break;
		case ELECTRONICS:
			if (!(item instanceof ItemElectronics)) {
				return false;
			}
			else {
				// applies filter only if the flag (warranty) is true)
				if (((ItemElectronics) itemSpec).isWarranty() && !((ItemElectronics) item).isWarranty()) {
					return false;
				}
				// applies filter only if the flag (mobile) is true)
				if (((ItemElectronics) itemSpec).isMobile() && !((ItemElectronics) item).isMobile()) {
					return false;
				}
			}
			break;
		case FOOD:
			if (!(item instanceof ItemFood)) {
				return false;
			}
			break;
		case MUSIC:
			if (!(item instanceof ItemMusic)) {
				return false;
			}
			else {
				// applies filter only if the flag (video) is true)
				if (((ItemMusic) itemSpec).isVideo() && !((ItemMusic) item).isVideo()) {
					return false;
				}
			}
			break;
//		case SPORT:
//			if (!(item instanceof ItemSport)) {
//				return false;
//			}
//			break;
		}
		return true;
	}

}