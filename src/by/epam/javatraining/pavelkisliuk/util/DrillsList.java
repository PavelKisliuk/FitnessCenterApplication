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

	public int size() {
		return first.size;
	}
}
