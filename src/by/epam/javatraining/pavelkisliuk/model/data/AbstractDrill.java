package by.epam.javatraining.pavelkisliuk.model.data;

public abstract class AbstractDrill {
	private String drillName;
	private int setPerExercise;
	private int restPeriod;

	protected AbstractDrill() {
	}

	protected AbstractDrill(String drillName, int setPerExercise, int restPeriod) {
		this.drillName = drillName;
		this.setPerExercise = setPerExercise;
		this.restPeriod = restPeriod;
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
