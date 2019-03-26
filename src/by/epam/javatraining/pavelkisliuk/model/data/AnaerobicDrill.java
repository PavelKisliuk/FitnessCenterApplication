package by.epam.javatraining.pavelkisliuk.model.data;

public class AnaerobicDrill extends AbstractDrill {
	private int necessaryRepeatNumber;
	private int realizeRepeatNumber;
	private int realizeRepeatNumberHelp;
	private int workingWeight;
	private boolean staticDynamic;
	private boolean pumping;
	private MusclesGroup muscleGroup;

	public int getNecessaryRepeatNumber() {
		return necessaryRepeatNumber;
	}

	public void setNecessaryRepeatNumber(int necessaryRepeatNumber) {
		this.necessaryRepeatNumber = necessaryRepeatNumber;
	}

	public int getRealizeRepeatNumber() {
		return realizeRepeatNumber;
	}

	public void setRealizeRepeatNumber(int realizeRepeatNumber) {
		this.realizeRepeatNumber = realizeRepeatNumber;
	}

	public int getRealizeRepeatNumberHelp() {
		return realizeRepeatNumberHelp;
	}

	public void setRealizeRepeatNumberHelp(int realizeRepeatNumberHelp) {
		this.realizeRepeatNumberHelp = realizeRepeatNumberHelp;
	}

	public int getWorkingWeight() {
		return workingWeight;
	}

	public void setWorkingWeight(int workingWeight) {
		this.workingWeight = workingWeight;
	}

	public boolean isStaticDynamic() {
		return staticDynamic;
	}

	public void setStaticDynamic(boolean staticDynamic) {
		this.staticDynamic = staticDynamic;
	}

	public boolean isPumping() {
		return pumping;
	}

	public void setPumping(boolean pumping) {
		this.pumping = pumping;
	}

	public MusclesGroup getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(MusclesGroup muscleGroup) {
		this.muscleGroup = muscleGroup;
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
