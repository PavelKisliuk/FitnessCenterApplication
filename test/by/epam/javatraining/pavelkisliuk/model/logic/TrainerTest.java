package by.epam.javatraining.pavelkisliuk.model.logic;

import by.epam.javatraining.pavelkisliuk.model.data.AerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.data.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainerTest {


	@Test
	public void initDrillAerobic() {
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAerobicStringException() {
		Trainer.initDrill(new AerobicDrill(), null, 0, 0,0,0);
	}

	@Test(expected = NullPointerException.class)
	public void initDrillAerobicAbstractDrillException() {
		Trainer.initDrill(null, "", 0, 0,0,0);
	}

	@Test
	public void initDrillAnaerobic() {
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
	}

	@Test(expected = NullPointerException.class)
	public void showListException() {
		Trainer.show(null);
	}
}