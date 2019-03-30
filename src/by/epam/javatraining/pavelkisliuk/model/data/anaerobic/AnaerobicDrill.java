package by.epam.javatraining.pavelkisliuk.model.data.anaerobic;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;

public class AnaerobicDrill extends AbstractDrill {
	public enum MusclesGroup {
		BREAST_GROUP("Breast"),
		BACK_GROUP("Back"),
		SHOULDERS_GROUP("Shoulders"),
		LEGS_GROUP("Legs"),
		HANDS_GROUP("Hands"),
		STOMACH_GROUP("Stomach");

		private String groupName;

		MusclesGroup(String groupName) {
			this.groupName = groupName;
		}

		public String get() {
			return groupName;
		}

		@Override
		public String toString() {
			return groupName;
		}
	}

	private int necessaryRepeatNumber;
	private int realizeRepeatNumber;
	private int realizeRepeatNumberHelp;
	private int workingWeight;
	private boolean staticDynamic;
	private boolean pumping;
	private MusclesGroup muscleGroup;


	public AnaerobicDrill() {
	}

	public AnaerobicDrill(String drillName, int setPerExercise, int restPeriod,
						  int necessaryRepeatNumber, int realizeRepeatNumber, int realizeRepeatNumberHelp,
						  int workingWeight, boolean staticDynamic, boolean pumping,
						  MusclesGroup muscleGroup) {
		super(drillName, setPerExercise, restPeriod);
		this.necessaryRepeatNumber = necessaryRepeatNumber;
		this.realizeRepeatNumber = realizeRepeatNumber;
		this.realizeRepeatNumberHelp = realizeRepeatNumberHelp;
		this.workingWeight = workingWeight;
		this.staticDynamic = staticDynamic;
		this.pumping = pumping;
		this.muscleGroup = muscleGroup;
	}

	public AnaerobicDrill(AnaerobicDrill anaerobicDrill) {
		super((new String(anaerobicDrill.getDrillName())), anaerobicDrill.getSetPerExercise(),
				anaerobicDrill.getRestPeriod());
		this.necessaryRepeatNumber = anaerobicDrill.necessaryRepeatNumber;
		this.realizeRepeatNumber = anaerobicDrill.realizeRepeatNumber;
		this.realizeRepeatNumberHelp = anaerobicDrill.realizeRepeatNumberHelp;
		this.workingWeight = anaerobicDrill.workingWeight;
		this.staticDynamic = anaerobicDrill.staticDynamic;
		this.pumping = anaerobicDrill.pumping;
		this.muscleGroup = anaerobicDrill.muscleGroup;
	}

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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		AnaerobicDrill that = (AnaerobicDrill) o;

		if (necessaryRepeatNumber != that.necessaryRepeatNumber) return false;
		if (realizeRepeatNumber != that.realizeRepeatNumber) return false;
		if (realizeRepeatNumberHelp != that.realizeRepeatNumberHelp) return false;
		if (workingWeight != that.workingWeight) return false;
		if (staticDynamic != that.staticDynamic) return false;
		if (pumping != that.pumping) return false;
		return muscleGroup == that.muscleGroup;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + necessaryRepeatNumber;
		result = 31 * result + realizeRepeatNumber;
		result = 31 * result + realizeRepeatNumberHelp;
		result = 31 * result + workingWeight;
		result = 31 * result + (staticDynamic ? 1 : 0);
		result = 31 * result + (pumping ? 1 : 0);
		result = 31 * result + muscleGroup.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "	AnaerobicDrill:" +
				"\n		Drill name =" + getDrillName() +
				"\n		SetPerExercise =" + getSetPerExercise() +
				"\n		Rest period =" + getRestPeriod() +
				"\n		Necessary repeat number =" + necessaryRepeatNumber +
				"\n		Realize repeat number =" + realizeRepeatNumber +
				"\n		Realize repeat number with help =" + realizeRepeatNumberHelp +
				"\n		Working weight =" + workingWeight +
				"\n		Static-dynamic =" + staticDynamic +
				"\n		Pumping =" + pumping +
				"\n		Muscle group =" + muscleGroup +
				"\n----------------------------------------------------------------------------\n";
	}
}
