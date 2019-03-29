package by.epam.javatraining.pavelkisliuk.model.data;

import java.util.Arrays;
import java.util.List;

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

	public static List<MusclesGroup> toList() {
		return Arrays.asList(BREAST_GROUP, BACK_GROUP, SHOULDERS_GROUP,
				LEGS_GROUP, HANDS_GROUP, STOMACH_GROUP);
	}

	@Override
	public String toString() {
		return groupName;
	}
}
