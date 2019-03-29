package by.epam.javatraining.pavelkisliuk.model.data;

public abstract class AbstractDrill {
	protected String drillName;
	protected int setPerExercise;
	protected int restPeriod;

	protected AbstractDrill() {

	}

	public String getDrillName() {
		return drillName;
	}

	public void setDrillName(String drillName) {
		this.drillName = drillName;
	}

	public int getSetPerExercise() {
		return setPerExercise;
	}

	public void setSetPerExercise(int setPerExercise) {
		this.setPerExercise = setPerExercise;
	}

	public int getRestPeriod() {
		return restPeriod;
	}

	public void setRestPeriod(int restPeriod) {
		this.restPeriod = restPeriod;
	}
}
