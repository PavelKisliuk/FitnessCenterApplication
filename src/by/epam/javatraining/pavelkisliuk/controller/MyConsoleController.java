package by.epam.javatraining.pavelkisliuk.controller;

import by.epam.javatraining.pavelkisliuk.model.data.anaerobic.AnaerobicDrill;
import by.epam.javatraining.pavelkisliuk.model.logic.Trainer;
import by.epam.javatraining.pavelkisliuk.util.DrillsList;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MyConsoleController {
	private int step;
	DrillsList list;
	AddWindowController addWindowController;
	DeleteWindowController deleteWindowController;
	OnTopWindowController onTopWindowController;
	ExchangeWindowController exchangeWindowController;

	@FXML
	private TextArea mainTextArea;

	@FXML
	private Button addButton;

	@FXML
	private Button onTopButton;

	@FXML
	private Button exchangeButton;

	@FXML
	private Button deleteButton;

	@FXML
	private Button showButton;

	@FXML
	private Button clearButton;

	@FXML
	void initialize() {
		mainTextArea.textProperty().addListener((ChangeListener<Object>) (observable, oldValue, newValue) ->
				mainTextArea.setScrollTop(Double.MAX_VALUE));
		addButton.setOnAction(actionEvent -> addAction());
		onTopButton.setOnAction(actionEvent -> onTopAction());
		exchangeButton.setOnAction(actionEvent -> exchangeAction());
		deleteButton.setOnAction(actionEvent -> deleteAction());
		showButton.setOnAction(actionEvent -> mainTextArea.appendText(Trainer.show(list)));
		clearButton.setOnAction(actionEvent -> clear());

		list = new DrillsList();

	}

	private void openWindow(String path, String title) {
		try {
			//primaryStage adjustment
			//-----------------------------------------------
			Stage dialogueStage = new Stage();
			dialogueStage.setResizable(false);
			dialogueStage.sizeToScene();
			dialogueStage.setTitle(title);
			dialogueStage.centerOnScreen();

			//FXML adjustment
			//-----------------------------------------------
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource(path));
			Parent fxmlDialogueWindow = fxmlLoader.load();

			switch (title) {
				case "Add":
					addWindowController = fxmlLoader.getController();
					break;
				case "Delete":
					deleteWindowController = fxmlLoader.getController();
					deleteWindowController.setSize(list.size());
					break;
				case "On Top":
					onTopWindowController = fxmlLoader.getController();
					onTopWindowController.setSize(list.size());
					break;
				case "Exchange":
					exchangeWindowController = fxmlLoader.getController();
					exchangeWindowController.setSize(list.size());
					break;
			}

			//modality adjustment
			//-----------------------------------------------
			dialogueStage.initModality(Modality.WINDOW_MODAL);
			dialogueStage.initOwner(mainTextArea.getScene().getWindow());

			//start-up window
			//-----------------------------------------------
			Scene choice = new Scene(fxmlDialogueWindow);
			dialogueStage.setScene(choice);
			dialogueStage.showAndWait();


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addAction() {
		String title = "Add";
		String path = "/by/epam/javatraining/pavelkisliuk/view/AddWindow.fxml";
		openWindow(path, title);

		if (!(addWindowController.isCancel())) {
			AnaerobicDrill drill = new AnaerobicDrill();
			Trainer.initDrill(drill,
					addWindowController.getName(),
					addWindowController.getSet(),
					addWindowController.getRest(),
					addWindowController.getRepeats(),
					addWindowController.getWeight(),
					addWindowController.isStat(),
					addWindowController.isPump(),
					addWindowController.getMuscle());
			Trainer.add(list, drill);

			setButtons();
		}
	}

	private void deleteAction() {
		String title = "Delete";
		String path = "/by/epam/javatraining/pavelkisliuk/view/DeleteWindow.fxml";
		openWindow(path, title);

		if (!(deleteWindowController.isCancel())) {
			Trainer.remove(list, deleteWindowController.getIndex());
		}

		setButtons();
	}

	private void onTopAction() {
		String title = "On Top";
		String path = "/by/epam/javatraining/pavelkisliuk/view/OnTopWindow.fxml";
		openWindow(path, title);

		if (!(onTopWindowController.isCancel())) {
			Trainer.onPosition(list, list.get(onTopWindowController.getIndex()),
					0);
			Trainer.remove(list, (onTopWindowController.getIndex() + 1));
		}

		setButtons();
	}

	private void exchangeAction() {
		String title = "Exchange";
		String path = "/by/epam/javatraining/pavelkisliuk/view/ExchangeWindow.fxml";
		openWindow(path, title);

		if (!(exchangeWindowController.isCancel())) {
			Trainer.exchange(list, exchangeWindowController.getIndexA(),
					exchangeWindowController.getIndexB());
		}

		setButtons();
	}


	private void setButtons() {
		if (list.size() > 0) {
			showButton.setDisable(false);
			deleteButton.setDisable(false);
		} else {
			showButton.setDisable(true);
			deleteButton.setDisable(true);
		}
		if (list.size() > 1) {
			onTopButton.setDisable(false);
			exchangeButton.setDisable(false);
		} else {
			onTopButton.setDisable(true);
			exchangeButton.setDisable(true);
		}
	}

	private void clear() {
		mainTextArea.clear();
	}
}
