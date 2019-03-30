package by.epam.javatraining.pavelkisliuk.util;

public class DrillListComparator {

	public static boolean compare(DrillsList list, DrillsList drillsList)
	{
		if((list == null) || (drillsList == null)) {
			return false;
		}
		if(list.size() != drillsList.size()) {
			return false;
		}
		if(list == drillsList) {
			return true;
		}


		for(int i = 0; i < list.size(); i++) {
			if(!(list.get(i).equals(drillsList.get(i)))) {
				return false;
			}
		}

		return true;
	}
}
