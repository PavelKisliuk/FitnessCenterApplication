package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.MusclesGroup;

public class Trainer{

	public void initDrill(AerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
						  int executionTime, int executionSpeed) {
		drill.setDrillName(drillName);
		drill.setSetPerExercise(setPerExercise);
		drill.setRestPeriod(restPeriod);
		drill.setExecutionTime(executionTime);
		drill.setExecutionSpeed(executionSpeed);
	}

	public void initDrill(AnaerobicDrill drill, String drillName, int setPerExercise, int restPeriod,
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
}
