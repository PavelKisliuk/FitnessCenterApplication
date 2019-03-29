package by.epam.javatraining.pavelkisliuk.model.data;

public class Running {
	public enum RunType {
		JOGTROT, AVERAGE, QUICK, CHANGEABLE, SHUTTLE, SIDEWAYS
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
}
