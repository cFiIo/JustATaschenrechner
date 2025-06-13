package de.justataschenrechner;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Stack;

public class Controller {
    private String inputNumbers = "";

    @FXML
    private Label outputField;

    @FXML
    private Button zeroButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiButton;

    @FXML
    private Button divButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button kommaButton;

    @FXML
    private Button klammerLinksButton;

    @FXML
    private Button klammerRechtsButton;

    @FXML
    private Button deleteAllButton;

    @FXML
    private Label secretHorseLabel;


    private void showInputNumbers() {
        outputField.setText(inputNumbers);
    }

    @FXML
    public void initialize() {

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                showInputNumbers();
            }
        };
        timer.start();
    }

    @FXML
    private void typeOne() {
        inputNumbers += "1";
    }

    @FXML
    private void typeTwo() {
        inputNumbers += "2";
    }

    @FXML
    private void typeThree() {
        inputNumbers += "3";
    }

    @FXML
    private void typeFour() {
        inputNumbers += "4";
    }

    @FXML
    private void typeFive() {
        inputNumbers += "5";
    }

    @FXML
    private void typeSix() {
        inputNumbers += "6";
    }

    @FXML
    private void typeSeven() {
        inputNumbers += "7";
    }

    @FXML
    private void typeEight() {
        inputNumbers += "8";
    }

    @FXML
    private void typeNine() {
        inputNumbers += "9";
    }

    @FXML
    private void typeZero() {
        inputNumbers += "0";
    }

    @FXML
    private void deleteAll() {
        inputNumbers = "";
    }

    @FXML
    private void delete() {
        String tempNumbers = "";
        for(int i = 0; i < inputNumbers.length() - 1; i++) {
            tempNumbers += inputNumbers.charAt(i);
        }
        inputNumbers = tempNumbers;
    }

    @FXML
    private void plus() {
        inputNumbers += "+";
    }

    @FXML
    private void minus() {
        inputNumbers += "-";
    }

    @FXML
    private void multi() {
        inputNumbers += "x";
    }

    @FXML
    private void div() {
        inputNumbers += "/";
    }

    @FXML
    private void komma(){
        inputNumbers += ".";
    }

    @FXML
    private void klammerLinks(){
        inputNumbers = "(";
    }

    @FXML
    private void klammerRechts(){
        inputNumbers += ")";
    }

    @FXML
    private void equal(){
        //TODO
        String speicher = inputNumbers;
        inputNumbers = "Hello World";

    }
}