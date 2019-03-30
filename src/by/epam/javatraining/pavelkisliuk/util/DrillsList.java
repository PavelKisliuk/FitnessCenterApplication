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

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;

/**
 * The {@code DrillsList} class-container fot {@code AbstractDrill}
 *
 * <p>This class store elements of {@code AbstractDrill} type, and it's subclasses
 *
 * @author Kisliuk Pavel Sergeevich
 * @since 1.0
 */

public class DrillsList {
	/**
	 * Size of List
	 */
	private int size;

	/**
	 * Pointer to first element of List
	 */
	private DrillsList first;

	/**
	 * Pointer to next element of List
	 */
	private DrillsList next;

	/**
	 * Data in List
	 */
	private AbstractDrill drill;

	/**
	 * Default constructor
	 */
	public DrillsList() {
		first = this;
	}

	/**
	 * Parameterized constructor
	 *
	 * @param drill is data for storing
	 */
	public DrillsList(AbstractDrill drill) {
		this.drill = drill;
	}

	/**
	 * Add data to List
	 *
	 * @param drill is data for storing
	 */
	public void add(AbstractDrill drill) {
		if (this.drill != null) {
			DrillsList tempList = this;
			while (tempList.next != null) {
				tempList = tempList.next;
			}

			tempList.next = new DrillsList(drill);
			tempList.first = first;
			first.size++;
		} else {
			first = this;
			this.drill = drill;
			size++;
		}
	}

	/**
	 * Get data from List
	 *
	 * @param index of specify element
	 * @return specify data from list
	 */
	public AbstractDrill get(int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			DrillsList tempList = this;
			for (int i = 0; i < index; i++) {
				tempList = tempList.next;
			}
			return tempList.drill;
		}
	}

	/**
	 * Set specify data on specify position
	 * Previous data on this position are lost
	 *
	 * @param drill is data for storing
	 * @param index is specify position
	 */
	public void set(AbstractDrill drill, int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			DrillsList tempList = this;
			for (int i = 0; i < index; i++) {
				tempList = tempList.next;
			}
			tempList.drill = drill;
		}
	}

	/**
	 * Delete data from list
	 *
	 * @param index of deleting element
	 * @return deleting element
	 */
	public AbstractDrill remove(int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			AbstractDrill deletingDrill;
			if (first.size == 1) {
				deletingDrill = drill;
				next = null;
				drill = null;
			} else if (index == 0) {
				deletingDrill = drill;
				drill = next.drill;
				next = next.next;
			} else {
				DrillsList prevList = this;
				DrillsList currentList = this;
				for (int i = 0; i < index; i++) {
					prevList = currentList;
					currentList = currentList.next;
				}
				deletingDrill = currentList.drill;

				prevList.next = currentList.next;
			}
			first.size--;
			return deletingDrill;
		}
	}

	/**
	 * Set specify data on specify position
	 * Previous data on this position are NOT lost
	 * Previous data move one next position
	 *
	 * @param drill is data for storing
	 * @param index is specify position
	 */
	public void insert(AbstractDrill drill, int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			first.size++;
			if (index == 0) {
				DrillsList nextList = next;
				next = new DrillsList(this.drill);
				next.next = nextList;
				this.drill = drill;
			} else {
				DrillsList prevList = this;
				DrillsList currentList = this;
				for (int i = 0; i < index; i++) {
					prevList = currentList;
					currentList = currentList.next;
				}
				prevList.next = new DrillsList(drill);
				prevList.next.next = currentList;
			}
		}
	}

	/**
	 * @return size of list
	 */
	public int size() {
		return first.size;
	}
}