package by.epam.javatraining.pavelkisliuk.model.data.aerobic;

public class Swimming extends AerobicDrill {
	public enum SwimType {
		BACKSTROKE, BREASTSTROKE, BUTTERFLY, CRAWL, SIDESTROKE
	}

	public Swimming() {

	}

	public Swimming(String drillName, int setPerExercise, int restPeriod,
					int executionTime, int executionSpeed,
					SwimType swimType) {
		super(drillName, setPerExercise, restPeriod, executionTime, executionSpeed);
		this.swimType = swimType;
	}

	public Swimming(Swimming swimming) {
		super((new String(swimming.getDrillName())), swimming.getSetPerExercise(), swimming.getRestPeriod(),
				swimming.getExecutionTime(), swimming.getExecutionSpeed());
		this.swimType = swimming.swimType;
	}

	private SwimType swimType;

	public SwimType getSwimType() {
		return swimType;
	}

	public void setSwimType(SwimType swimType) {
		this.swimType = swimType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Swimming swimming = (Swimming) o;

		return swimType == swimming.swimType;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + swimType.hashCode();
		return result;
	}
}
