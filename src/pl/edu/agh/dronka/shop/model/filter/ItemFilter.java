package pl.edu.agh.dronka.shop.model.filter;

import pl.edu.agh.dronka.shop.model.Item;
import pl.edu.agh.dronka.shop.model.ItemBook;
import pl.edu.agh.dronka.shop.model.ItemDefault;
import pl.edu.agh.dronka.shop.model.ItemElectronics;
import pl.edu.agh.dronka.shop.model.ItemMusic;

public class ItemFilter {
	private Item itemSpec = (ItemDefault) new ItemDefault();

	public Item getItemSpec() {
		return itemSpec;
	}
	public void setItemSpec(Item itemSpec) {
		this.itemSpec = itemSpec;
	}
	public boolean appliesTo(Item item) {
		if (itemSpec.getName() != null
				&& !itemSpec.getName().equals(item.getName())) {
			return false;
		}
		if (itemSpec.getCategory() != null
				&& !itemSpec.getCategory().equals(item.getCategory())) {
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
//		switch (itemSpec.getCategory()) {
//		case BOOKS:
//			break;
//		case ELECTRONICS:
////			// applies filter only if the flag (warranty) is true)
////			if (item instanceof ItemElectronics && itemSpec instanceof ItemElectronics
////					&& ((ItemElectronics) itemSpec).isWarranty() && !((ItemElectronics) item).isWarranty()) {
////				return false;
////			}
////			// applies filter only if the flag (mobile) is true)
////			if (  item instanceof ItemElectronics && itemSpec instanceof ItemElectronics
////				  && ((ItemElectronics) itemSpec).isMobile() && !((ItemElectronics) item).isMobile()) {
////				return false;
////			}
//			break;
//		case FOOD:
//			break;
//		case MUSIC:
//			break;
//		case SPORT:
//			break;
//		}

		
//		// applies filter for books
//		if ( !(itemSpec instanceof ItemBook)) {
//			return false;
//		}
//		// applies filter only if the flag (hardcover) is true)
//		if (  itemSpec instanceof ItemBook
//			  && ((ItemBook) itemSpec).isHardcover()
//			  && !((ItemBook) item).isHardcover()) {
//			return false;
//		}
//		// applies filter for musics
//		if ( !(itemSpec instanceof ItemMusic)) {
//			return false;
//		}
//		//		// applies filter only if the flag (hardcover) is true)
//		if (  itemSpec instanceof ItemMusic
//			  && ((ItemMusic) itemSpec).isVideo()
//			  && !((ItemMusic) item).isVideo()) {
//			return false;
//		}

		return true;
	}

}