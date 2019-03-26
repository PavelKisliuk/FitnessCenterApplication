package by.epam.javatraining.pavelkisliuk.model.data;

public abstract class AbstractDrill {
	protected String drillName;
	protected int setPerExercise;
	protected int restPeriod;

	protected AbstractDrill() {

	}

	public abstract String getDrillName();
	public abstract void setDrillName(String drillName);

	public abstract int getSetPerExercise();
	public abstract void setSetPerExercise(int setPerExercise);

	public abstract int getRestPeriod();
	public abstract void setRestPeriod(int restPeriod);
}
