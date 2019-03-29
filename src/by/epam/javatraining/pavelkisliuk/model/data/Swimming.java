package by.epam.javatraining.pavelkisliuk.model.data;

public class Swimming {
	public enum SwimType {
		BACKSTROKE, BREASTSTROKE, BUTTERFLY, CRAWL, SIDESTROKE
	}

	private SwimType swimType;

	public SwimType getSwimType() {
		return swimType;
	}

	public void setSwimType(SwimType swimType) {
		this.swimType = swimType;
	}
}
