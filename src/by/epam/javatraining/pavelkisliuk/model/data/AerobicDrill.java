package by.epam.javatraining.pavelkisliuk.model.data;

public class AerobicDrill extends AbstractDrill {
	private int executionTime;
	private int executionSpeed;

	public AerobicDrill() {
	}

	public int getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}

	public int getExecutionSpeed() {
		return executionSpeed;
	}

	public void setExecutionSpeed(int executionSpeed) {
		this.executionSpeed = executionSpeed;
	}

	@Override
	public String getDrillName() {
		return drillName;
	}

	@Override
	public void setDrillName(String drillName) {
		this.drillName = drillName;
	}

	@Override
	public int getSetPerExercise() {
		return setPerExercise;
	}

	@Override
	public void setSetPerExercise(int setPerExercise) {
		this.setPerExercise = setPerExercise;
	}

	@Override
	public int getRestPeriod() {
		return restPeriod;
	}

	@Override
	public void setRestPeriod(int restPeriod) {
		this.restPeriod = restPeriod;
	}
}
