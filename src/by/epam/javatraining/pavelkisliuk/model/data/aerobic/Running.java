package by.epam.javatraining.pavelkisliuk.model.data.aerobic;

public class Running extends AerobicDrill {
	public enum RunType {
		JOGTROT, AVERAGE, QUICK, CHANGEABLE, SHUTTLE, SIDEWAYS
	}

	public Running() {

	}

	public Running(String drillName, int setPerExercise, int restPeriod,
				   int executionTime, int executionSpeed,
				   RunType runType, int distance) {
		super(drillName, setPerExercise, restPeriod, executionTime, executionSpeed);
		this.runType = runType;
		this.distance = distance;
	}

	public Running(Running running) {
		super((new String(running.getDrillName())), running.getSetPerExercise(), running.getRestPeriod(),
				running.getExecutionTime(), running.getExecutionSpeed());
		this.runType = running.runType;
		this.distance = running.distance;
	}

	private RunType runType;
	private int distance;

	public RunType getRunType() {
		return runType;
	}

	public void setRunType(RunType runType) {
		this.runType = runType;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Running running = (Running) o;

		if (distance != running.distance) return false;
		return runType == running.runType;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + runType.hashCode();
		result = 31 * result + distance;
		return result;
	}
}
