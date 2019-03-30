package by.epam.javatraining.pavelkisliuk.model.data.aerobic;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;

public class AerobicDrill extends AbstractDrill {
	private int executionTime;
	private int executionSpeed;

	public AerobicDrill() {
	}

	public AerobicDrill(String drillName, int setPerExercise, int restPeriod,
						int executionTime, int executionSpeed) {
		super(drillName, setPerExercise, restPeriod);
		this.executionTime = executionTime;
		this.executionSpeed = executionSpeed;
	}

	public AerobicDrill(AerobicDrill aerobicDrill) {
		super((new String(aerobicDrill.getDrillName())), aerobicDrill.getSetPerExercise(),
				aerobicDrill.getRestPeriod());
		this.executionTime = aerobicDrill.executionTime;
		this.executionSpeed = aerobicDrill.executionSpeed;
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		AerobicDrill that = (AerobicDrill) o;

		if (executionTime != that.executionTime) return false;
		return executionSpeed == that.executionSpeed;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + executionTime;
		result = 31 * result + executionSpeed;
		return result;
	}
}
