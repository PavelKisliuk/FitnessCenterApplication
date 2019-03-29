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
}
