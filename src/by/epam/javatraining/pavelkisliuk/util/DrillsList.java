package by.epam.javatraining.pavelkisliuk.util;

import by.epam.javatraining.pavelkisliuk.model.data.AbstractDrill;

public class DrillsList {
	private int size;

	private DrillsList first;
	private DrillsList next;
	private AbstractDrill drill;

	public DrillsList() {
		first = this;
	}

	public DrillsList(AbstractDrill drill) {
		this.drill = drill;
	}

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

	//can't delete first element
	public AbstractDrill remove(int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			DrillsList tempList = this;
			for (int i = 0; i < (index - 1); i++) {
				tempList = tempList.next;
			}
			DrillsList nextList = tempList.next;
			tempList.next = nextList.next;
			first.size--;
			return nextList.drill;
		}
	}

	public void insert(AbstractDrill drill, int index) {
		if ((index > first.size) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			DrillsList tempList = this;
			for (int i = 0; i < index; i++) {
				tempList = tempList.next;
			}

			DrillsList oldNext = tempList.next;

			tempList.next = new DrillsList(drill);
			tempList.first = first;
			first.size++;

			tempList = tempList.next;
			tempList.next = oldNext;
		}
	}

	public int size() {
		return first.size;
	}
}
