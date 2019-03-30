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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AbstractDrill that = (AbstractDrill) o;

		if (setPerExercise != that.setPerExercise) return false;
		if (restPeriod != that.restPeriod) return false;
		return drillName.equals(that.drillName);

	}

	@Override
	public int hashCode() {
		int result = drillName.hashCode();
		result = 31 * result + setPerExercise;
		result = 31 * result + restPeriod;
		return result;
	}
}
