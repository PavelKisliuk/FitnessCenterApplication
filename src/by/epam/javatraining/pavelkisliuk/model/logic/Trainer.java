/*
 * By Pavel Kisliuk, 30.03.2019
 * This is class for education and nothing rights don't reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;
import by.epam.javatraining.pavelkisliuk.model.data.aerobic.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.anaerobic.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;

/**
 * The {@code Trainer} class work with different {@code Drills} as {@code DrillsList}
 *
 * <p>This class provides several methods for initialization and working with {@code DrillsList}
 *
 * @author Kisliuk Pavel Sergeevich
 * @since 1.0
 */

public class Trainer {
	// Suppresses default constructor, ensuring non-instantiability.
	private Trainer() {
	}

	/**
	 * Initialization {@param AerobicDrill} by specify elements
	 *
	 * @param drill          initialized object
	 * @param drillName      is name of drill
	 * @param setPerExercise is set
	 * @param restPeriod     is time of rest
	 * @param executionTime  is time for execution of drill
	 * @param executionSpeed is speed of execution of drill
	 */
	public static void initDrill(AerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
								 int executionTime, int executionSpeed) {
		if ((drill == null) || (drillName == null)) {
			throw new NullPointerException();
		}
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setExecutionTime(executionTime);
		drill.setExecutionSpeed(executionSpeed);
	}

	/**
	 * Initialization {@param AnaerobicDrill} by specify elements
	 *
	 * @param drill                 initialized object
	 * @param drillName             is name of drill
	 * @param setPerExercise        is set
	 * @param restPeriod            is time of rest
	 * @param necessaryRepeatNumber is numbers of repeats
	 * @param workingWeight         is weight of shell
	 * @param staticDynamic         is type of execution of drill
	 * @param pumping               is type of execution of drill
	 * @param muscleGroup           is kind of muscles group
	 */
	public static void initDrill(AnaerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
								 int necessaryRepeatNumber, int workingWeight, boolean staticDynamic,
								 boolean pumping, AnaerobicDrill.MusclesGroup muscleGroup) {
		if ((drill == null) || (drillName == null) || (muscleGroup == null)) {
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

	/**
	 * Change position of specified elements
	 *
	 * @param list    of elements
	 * @param lastPos position from we take one element and where insert another
	 * @param newPos  position where wu insert one element and from we take another
	 */
	public static void exchange(DrillsList list, int lastPos, int newPos) {
		if (list == null) {
			throw new NullPointerException();
		} else if ((lastPos < 0) || (lastPos > list.size()) &&
				(newPos < 0) || (newPos > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			AbstractDrill temp = list.get(lastPos);
			list.set(list.get(newPos), lastPos);
			list.set(temp, newPos);
		}
	}

	/**
	 * Insert specify element on specify position
	 *
	 * @param list  of elements
	 * @param drill inserted element
	 * @param pos   position where insert element
	 */
	public static void onPosition(DrillsList list, AbstractDrill drill, int pos) {
		if ((list == null) || (drill == null)) {
			throw new NullPointerException();
		} else if ((pos < 0) || (pos > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			list.insert(drill, pos);
		}
	}

	/**
	 * Add specify element to list
	 *
	 * @param list  of element
	 * @param drill is specify element
	 */
	public static void add(DrillsList list, AbstractDrill drill) {
		if ((list == null) || (drill == null)) {
			throw new NullPointerException();
		} else {
			list.add(drill);
		}
	}

	/**
	 * Delete specify element from list
	 *
	 * @param list  of elements
	 * @param index is position of deleting element in list
	 */
	public static void remove(DrillsList list, int index) {
		if (list == null) {
			throw new NullPointerException();
		} else if ((index < 0) || (index > list.size())) {
			throw new IndexOutOfBoundsException();
		} else {
			list.remove(index);
		}
	}

	/**
	 * Show list of element
	 *
	 * @param list of element
	 * @return list of element as {@param String}
	 */
	public static String show(DrillsList list) {
		if (list == null) {
			throw new NullPointerException();
		}
		StringBuilder str = new StringBuilder();
		str.append("-------------------------------------------------------------\n").
				append("-------------------------------------------------------------List:\n");
		for (int i = 0; i < list.size(); i++) {
			str.append("Drill #").append(i + 1).append("\n");
			str.append(list.get(i).toString()).append("\n");
		}
		str.append("-------------------------------------------------------------\n").
				append("-------------------------------------------------------------end of list\n");
		return str.toString();
	}
}