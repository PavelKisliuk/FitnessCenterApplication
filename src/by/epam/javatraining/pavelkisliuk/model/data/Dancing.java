package by.epam.javatraining.pavelkisliuk.model.data;

public class Dancing extends AerobicDrill {
	public enum Intensity {
		QUICK, AVERAGE, SLOW
	}

	private Intensity intensity;

	public Intensity getIntensity() {
		return intensity;
	}

	public void setIntensity(Intensity intensity) {
		this.intensity = intensity;
	}
}
