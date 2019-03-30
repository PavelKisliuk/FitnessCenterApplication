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

package by.epam.javatraining.pavelkisliuk.util;

/**
 * The {@code DrillListComparator} class compare two {@code DrillsList}
 *
 * <p>This class provides several methods for comparing {@code DrillsList}
 *
 * @author Kisliuk Pavel Sergeevich
 * @since 1.0
 */

public class DrillListComparator {
	// Suppresses default constructor, ensuring non-instantiability.
	private DrillListComparator() {
	}

	/**
	 * Compare two specify lists
	 *
	 * @param list       for compare
	 * @param drillsList for compare
	 * @return {@param true} if list's equal's, otherwise {@param false}
	 */
	public static boolean compare(DrillsList list, DrillsList drillsList) {
		if ((list == null) || (drillsList == null) ||
				(list.size() != drillsList.size())) {
			return false;
		}
		if (list == drillsList) {
			return true;
		}

		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i).equals(drillsList.get(i)))) {
				return false;
			}
		}

		return true;
	}
}
