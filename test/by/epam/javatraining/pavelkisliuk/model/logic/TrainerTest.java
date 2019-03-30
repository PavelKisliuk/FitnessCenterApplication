package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.aerobic.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.anaerobic.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.util.DrillListComparator;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerTest {


	@Test
	public void initDrillAerobic() {
		AerobicDrill expected = new AerobicDrill("", 0, 0, 0, 0);
		AerobicDrill drill = new AerobicDrill();
		Trainer.initDrill(drill, "", 0, 0, 0, 0);
		assertEquals(expected, drill);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAerobicStringException() {
		Trainer.initDrill(new AerobicDrill(), null, 0, 0,0,0);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAerobicAbstractDrillException() {
		Trainer.initDrill(null, "", 0,
				0,0,0);
	}

	@Test
	public void initDrillAnaerobic() {
		AnaerobicDrill expected = new AnaerobicDrill("", 0, 0, 0,
				0, 0, 0, false,
				false, AnaerobicDrill.MusclesGroup.BREAST_GROUP);
		AnaerobicDrill drill = new AnaerobicDrill();
		Trainer.initDrill(drill, "", 0, 0,0, 0,
				false, false, AnaerobicDrill.MusclesGroup.BREAST_GROUP);
		assertEquals(expected, drill);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAnaerobicStringException() {
		Trainer.initDrill(new AnaerobicDrill(), null, 0, 0,0,0,
				false, false, AnaerobicDrill.MusclesGroup.BREAST_GROUP);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAnaerobicAbstractDrillException() {
		Trainer.initDrill(null, "", 0, 0,0,0,
		false, false, AnaerobicDrill.MusclesGroup.BREAST_GROUP);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAnaerobicMusclesGroupException() {
		Trainer.initDrill(new AnaerobicDrill(), "", 0, 0,0,0,
				false, false, null);
	}

	@Test
	public void exchange() {
		DrillsList expexted = new DrillsList();
		expexted.add(new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
				false, false, null));
		expexted.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));

		DrillsList list = new DrillsList();
		list.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));
		list.add(new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
				false, false, null));
		Trainer.exchange(list, 0, 1);
		assertTrue(DrillListComparator.compare(expexted, list));
	}

	@Test(expected = NullPointerException.class)
	public void exchangeDrillException() {
		Trainer.exchange(null, 0, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void exchangeLastHighException() {
		Trainer.exchange(new DrillsList(), 5, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void exchangeLastLowException() {
		Trainer.exchange(new DrillsList(), -1, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void exchangeNewHighException() {
		Trainer.exchange(new DrillsList(), 0, 5);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void exchangeNewLowException() {
		Trainer.exchange(new DrillsList(), 0, -1);
	}

	@Test
	public void onPosition() {
		DrillsList expexted = new DrillsList();
		expexted.add(new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
				false, false, null));
		expexted.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));

		DrillsList list = new DrillsList();
		list.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));
		Trainer.onPosition(list,
				new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
						false, false, null), 0);
		assertTrue(DrillListComparator.compare(expexted, list));
	}

	@Test(expected = NullPointerException.class)
	public void onPositionDrillsListException() {
		Trainer.onPosition(null, new AnaerobicDrill(), 0);
	}

	@Test(expected = NullPointerException.class)
	public void onPositionAbstractDrillException() {
		Trainer.onPosition(new DrillsList(), null, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void onPositionHighException() {
		Trainer.onPosition(new DrillsList(), new AnaerobicDrill(), 5);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void onPositionLowException() {
		Trainer.onPosition(new DrillsList(), new AnaerobicDrill(), -1);
	}

	@Test
	public void add() {
		DrillsList expexted = new DrillsList();
		expexted.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));
		expexted.add(new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
				false, false, null));

		DrillsList list = new DrillsList();
		list.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));
		Trainer.add(list,
				new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
						false, false, null));
		assertTrue(DrillListComparator.compare(expexted, list));
	}

	@Test(expected = NullPointerException.class)
	public void addDrillsListException() {
		Trainer.add(null, new AnaerobicDrill());
	}

	@Test(expected = NullPointerException.class)
	public void addAbstractDrillException() {
		Trainer.add(new DrillsList(), null);
	}

	@Test
	public void remove() {
		DrillsList expexted = new DrillsList();
		expexted.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));

		DrillsList list = new DrillsList();
		list.add(new AnaerobicDrill("1", 0, 0, 0, 0,0,0,
				false, false, null));
		list.add(new AnaerobicDrill("2", 0, 0, 0, 0,0,0,
				false, false, null));
		Trainer.remove(list,1);
		assertTrue(DrillListComparator.compare(expexted, list));
	}

	@Test(expected = NullPointerException.class)
	public void removeListException() {
		Trainer.remove(null, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void removeHighException() {
		Trainer.remove(new DrillsList(), 5);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void removeLowException() {
		Trainer.remove(new DrillsList(), -1);
	}

	@Test
	public void show() {
		String expected = "-------------------------------------------------------------\n" +
				"-------------------------------------------------------------List:\n" +
				"Drill #1\n" +
				"\tAnaerobicDrill:\n" +
				"\t\tDrill name =1\n" +
				"\t\tSetPerExercise =1\n" +
				"\t\tRest period =1\n" +
				"\t\tNecessary repeat number =1\n" +
				"\t\tRealize repeat number =0\n" +
				"\t\tRealize repeat number with help =0\n" +
				"\t\tWorking weight =1\n" +
				"\t\tStatic-dynamic =false\n" +
				"\t\tPumping =false\n" +
				"\t\tMuscle group =Breast\n" +
				"----------------------------------------------------------------------------\n" +
				"\n" +
				"-------------------------------------------------------------\n" +
				"-------------------------------------------------------------end of list\n";

		DrillsList list = new DrillsList();
		list.add(new AnaerobicDrill("1", 1, 1, 1, 0,0,1,
				false, false, AnaerobicDrill.MusclesGroup.BREAST_GROUP));
		assertEquals(expected, Trainer.show(list));
	}

	@Test(expected = NullPointerException.class)
	public void showListException() {
		Trainer.show(null);
	}
}