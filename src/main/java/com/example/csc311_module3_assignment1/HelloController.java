package com.example.csc311_module3_assignment1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    // Loan input fields
    @FXML
    private TextField annualInterestRateField;

    @FXML
    private TextField numberOfYearsField;

    @FXML
    private TextField loanAmountField;

    // Payment output fields
    @FXML
    private TextField monthlyPaymentField;

    @FXML
    private TextField totalPaymentField;

    // Calculates the loan payment
    @FXML
    protected void calculatePayment() {

        // Get user input
        double annualInterestRate =
                Double.parseDouble(annualInterestRateField.getText());

        int numberOfYears =
                Integer.parseInt(numberOfYearsField.getText());

        double loanAmount =
                Double.parseDouble(loanAmountField.getText());

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate monthly payment
        double monthlyPayment =
                loanAmount * monthlyInterestRate /
                        (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        // Calculate total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results
        monthlyPaymentField.setText(String.format("$%.2f", monthlyPayment));
        totalPaymentField.setText(String.format("$%.2f", totalPayment));
    }
}