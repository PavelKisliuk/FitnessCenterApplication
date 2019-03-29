package by.epam.javatraining.pavelkisliuk.controller;

import by.epam.javatraining.pavelkisliuk.model.data.MusclesGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class AddWindowController {
	private boolean cancel;

	private String name;
	private int set;
	private int rest;
	private int repeats;
	private int weight;
	private MusclesGroup muscle;
	private boolean statDynam;
	private boolean pump;

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
	private ComboBox<String> muscleComboBox;

	@FXML
	private ToggleGroup DrillGroup;

	@FXML
	private RadioButton normalRadioButton;

	@FXML
	private RadioButton statRadioButton;

	@FXML
	private RadioButton pumpRadioButton;

	@FXML
	private Button okButton;

	@FXML
	void okOnAction(ActionEvent event) {
		name = nameTextField.getText();
		set = Integer.valueOf(setTextField.getText());
		rest = Integer.valueOf(restTextField.getText());
		repeats = Integer.valueOf(repeatsTextField.getText());
		weight = Integer.valueOf(weightTextField.getText());
//		muscle = muscleComboBox.getValue();
		muscle = null;
		statDynam = (Boolean)statRadioButton.getUserData();
		pump = (Boolean)pumpRadioButton.getUserData();

		cancel = false;
		Node b = (Node)event.getTarget();
		Stage stage = (Stage)b.getScene().getWindow();
		stage.close();
	}

	@FXML
	void cancelButtonOnAction(ActionEvent event) {
		cancel = true;
		Node b = (Node)event.getTarget();
		Stage stage = (Stage)b.getScene().getWindow();
		stage.close();
	}


	@FXML
	void initialize() {
		//--------------------------------------------------------------
		normalRadioButton.setUserData(true);
		normalRadioButton.setOnAction(actionEvent -> {
			normalRadioButton.setUserData(true);
			statRadioButton.setUserData(false);
			pumpRadioButton.setUserData(false);
		});
		//--------------------------------------------------------------
		statRadioButton.setUserData(false);
		statRadioButton.setOnAction(actionEvent -> {
			statRadioButton.setUserData(true);
			normalRadioButton.setUserData(false);
			pumpRadioButton.setUserData(false);
		});
		//--------------------------------------------------------------
		pumpRadioButton.setUserData(false);
		pumpRadioButton.setOnAction(actionEvent -> {
			pumpRadioButton.setUserData(true);
			normalRadioButton.setUserData(false);
			statRadioButton.setUserData(false);
		});
		//--------------------------------------------------------------
		setTextField.textProperty().addListener((observable, oldValue, newValue) ->
				checkAllTextField());
		restTextField.textProperty().addListener((observable, oldValue, newValue) ->
				checkAllTextField());
		repeatsTextField.textProperty().addListener((observable, oldValue, newValue) ->
				checkAllTextField());
		weightTextField.textProperty().addListener((observable, oldValue, newValue) ->
				checkAllTextField());
	}

	public boolean isCancel() {
		return cancel;
	}

	private void checkAllTextField() {
		if((isCorrectInput(setTextField.getText())) &&
				(isCorrectInput(restTextField.getText())) &&
				(isCorrectInput(repeatsTextField.getText())) &&
				(isCorrectInput(weightTextField.getText()))) {
			okButton.setDisable(false);
		} else {
			okButton.setDisable(true);
		}
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
		return true;
	}


	public String getName() {
		return name;
	}

	public int getSet() {
		return set;
	}

	public int getRest() {
		return rest;
	}

	public int getRepeats() {
		return repeats;
	}

	public int getWeight() {
		return weight;
	}

	public MusclesGroup getMuscle() {
		return muscle;
	}

	public boolean isStat() {
		return statDynam;
	}

	public boolean isPump() {
		return pump;
	}


}
