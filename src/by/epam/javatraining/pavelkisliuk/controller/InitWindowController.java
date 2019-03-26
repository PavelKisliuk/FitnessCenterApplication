package by.epam.javatraining.pavelkisliuk.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class InitWindowController {

	@FXML
	private TextField nameTextField;

	@FXML
	private TextField setTextField;

	@FXML
	private TextField restTextField;

	@FXML
	private TextField repeatsTextField;

	@FXML
	private TextField weightTextField;

	@FXML
	private ChoiceBox<?> muscleChoiceBox;

	@FXML
	private ToggleGroup DrillGroup;

	@FXML
	void oKOnAction(ActionEvent event) {

	}

}
