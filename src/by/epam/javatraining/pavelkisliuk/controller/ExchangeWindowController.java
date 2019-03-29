package by.epam.javatraining.pavelkisliuk.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ExchangeWindowController {
	private boolean cancel = true;
	private int indexA;
	private int indexB;
	private int size;

	@FXML
	private TextField elementATextField;

	@FXML
	private TextField elementBTextField;

	@FXML
	private Button okButton;

	@FXML
	void okButtonOnAction(ActionEvent event) {
		indexA = Integer.valueOf(elementATextField.getText());
		indexA--;

		indexB = Integer.valueOf(elementBTextField.getText());
		indexB--;

		cancel = false;
		Node b = (Node) event.getTarget();
		Stage stage = (Stage) b.getScene().getWindow();
		stage.close();
	}

	@FXML
	void cancelButtonOnAction(ActionEvent event) {
		cancel = true;
		Node b = (Node) event.getTarget();
		Stage stage = (Stage) b.getScene().getWindow();
		stage.close();
	}

	@FXML
	void initialize() {
		elementATextField.textProperty().addListener((observable, oldValue, newValue) ->
				okButton.setDisable(!(isCorrectInput(newValue))));
		elementBTextField.textProperty().addListener((observable, oldValue, newValue) ->
				okButton.setDisable(!(isCorrectInput(newValue))));
	}

	private boolean isCorrectInput(String str) {
		if ((str.length() == 0) ||
				(str.charAt(0) == '0')) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!(Character.isDigit(str.charAt(i)))) {
				return false;
			}
		}
		return (Integer.valueOf(str) <= size);
	}

	public boolean isCancel() {
		return cancel;
	}

	public int getIndexA() {
		return indexA;
	}

	public int getIndexB() {
		return indexB;
	}

	public void setSize(int size) {
		this.size = size;
	}
}