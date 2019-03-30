package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;
import by.epam.javatraining.pavelkisliuk.model.data.aerobic.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.anaerobic.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;

public class Trainer{
	// Suppresses default constructor, ensuring non-instantiability.
	private Trainer() {
	}

	public static void initDrill(AerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
						  int executionTime, int executionSpeed) {
		if((drill == null) || (drillName == null)) {
			throw new NullPointerException();
		}
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setExecutionTime(executionTime);
		drill.setExecutionSpeed(executionSpeed);
	}

	public static void initDrill(AnaerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
						  int necessaryRepeatNumber, int workingWeight, boolean staticDynamic,
						  boolean pumping, AnaerobicDrill.MusclesGroup muscleGroup) {
		if((drill == null) || (drillName == null) || (muscleGroup == null)) {
			throw new NullPointerException();
		}
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setNecessaryRepeatNumber(necessaryRepeatNumber);
		drill.setWorkingWeight(workingWeight);
		drill.setStaticDynamic(staticDynamic);
		drill.setPumping(pumping);
		drill.setMuscleGroup(muscleGroup);
	}

	public static void exchange(DrillsList list, int lastPos, int newPos) {
		if(list == null) {
			throw new NullPointerException();
		} else if((lastPos < 0) || (lastPos > list.size()) &&
				(newPos < 0) || (newPos > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			AbstractDrill temp = list.get(lastPos);
			list.set(list.get(newPos), lastPos);
			list.set(temp, newPos);
		}
	}

	public static void onPosition(DrillsList list, AbstractDrill drill, int pos) {
		if((list == null) || (drill == null)) {
			throw new NullPointerException();
		} else if((pos < 0) || (pos > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			list.insert(drill, pos);
		}
	}

	public static void add(DrillsList list, AbstractDrill drill) {
		if((list == null) || (drill == null)) {
			throw new NullPointerException();
		} else {
			list.add(drill);
		}
	}

	public static void remove(DrillsList list, int index) {
		if(list == null) {
			throw new NullPointerException();
		}else if((index < 0) || (index > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			list.remove(index);
		}
	}

	public static String show(DrillsList list)
	{
		if(list == null) {
			throw new NullPointerException();
		}
		StringBuilder str = new StringBuilder();
		str.append("-------------------------------------------------------------\n").
				append("-------------------------------------------------------------List:\n");
		for(int i = 0; i < list.size(); i++) {
			str.append("Drill #").append(i + 1).append("\n");
			str.append(list.get(i).toString()).append("\n");
		}
		str.append("-------------------------------------------------------------\n").
				append("-------------------------------------------------------------end of list\n");
		return str.toString();
	}
}
