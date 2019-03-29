package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;
import by.epam.javatraining.pavelkisliuk.model.data.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.MusclesGroup;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;

public class Trainer{
	public static void initDrill(AerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
						  int executionTime, int executionSpeed) {
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setExecutionTime(executionTime);
		drill.setExecutionSpeed(executionSpeed);
	}

	public static void initDrill(AnaerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
						  int necessaryRepeatNumber, int workingWeight, boolean staticDynamic,
						  boolean pumping, MusclesGroup muscleGroup) {
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setNecessaryRepeatNumber(necessaryRepeatNumber);
		drill.setWorkingWeight(workingWeight);
		drill.setStaticDynamic(staticDynamic);
		drill.setPumping(pumping);
		drill.setMuscleGroup(muscleGroup);
	}

	public static void onPosition(DrillsList list, int positionIndex, int elementIndex) {
		if(list == null) {
			throw new NullPointerException();
		} else if((positionIndex < 0) || (positionIndex > list.size()) &&
				(elementIndex < 0) || (elementIndex > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			AbstractDrill temp = list.get(elementIndex);
			list.insert(temp, positionIndex);
			list.remove(elementIndex);
		}
	}

	public static AbstractDrill exchange(DrillsList list, AbstractDrill drill, int index) {
		if((list == null) || (drill == null)) {
			throw new NullPointerException();
		} else if((index < 0) || (index > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			AbstractDrill old = list.get(index);
			list.set(drill, index);
			return old;
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
		list.remove(index);
	}

	public static String show(DrillsList list)
	{
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
