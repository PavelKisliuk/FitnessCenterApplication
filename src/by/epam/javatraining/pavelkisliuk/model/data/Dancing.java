package by.epam.javatraining.pavelkisliuk.model.data;

public class Dancing extends AerobicDrill {
	public enum Intensity {
		QUICK, AVERAGE, SLOW
	}

	public Dancing() {

	}

	public Dancing(String drillName, int setPerExercise, int restPeriod,
				   int executionTime, int executionSpeed,
				   Intensity intensity) {
		super(drillName, setPerExercise, restPeriod, executionTime, executionSpeed);
		this.intensity = intensity;
	}

	public Dancing(Dancing dancing) {
		super((new String(dancing.getDrillName())), dancing.getSetPerExercise(), dancing.getRestPeriod(),
				dancing.getExecutionTime(), dancing.getExecutionSpeed());
		this.intensity = dancing.intensity;
	}

	private Intensity intensity;

	public Intensity getIntensity() {
		return intensity;
	}

	public void setIntensity(Intensity intensity) {
		this.intensity = intensity;
	}
}
