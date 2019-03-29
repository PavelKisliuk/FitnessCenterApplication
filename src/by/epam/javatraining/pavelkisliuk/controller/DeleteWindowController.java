package by.epam.javatraining.pavelkisliuk.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DeleteWindowController {
	private boolean cancel = true;
	private int index;
	private int size;

	@FXML
	private TextField numberTextField;

	@FXML
	private Button okButton;

	@FXML
	void okButtonOnAction(ActionEvent event) {
		index = Integer.valueOf(numberTextField.getText());
		index--;
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
		numberTextField.textProperty().addListener((observable, oldValue, newValue) ->
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

	public int getIndex() {
		return index;
	}

	public void setSize(int size) {
		this.size = size;
	}
}