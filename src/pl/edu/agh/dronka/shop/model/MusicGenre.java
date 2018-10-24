package pl.edu.agh.dronka.shop.model;

public enum MusicGenre {
	IM("Industrial Metal"),
	SNM("Skandynawski Nu-Metal"),
	VPGC("Wegetariański Progresywny Grindcore"),
	BM("Black Metal"),
	SBM("Super Black Metal"),
	L("Lounge"),
	OTHER("Other");
	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	private MusicGenre(String displayName) {
		this.displayName = displayName;
	}
}
