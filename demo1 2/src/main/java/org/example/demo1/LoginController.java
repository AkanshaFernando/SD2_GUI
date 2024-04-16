package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginController {
    @FXML
    private Label login;

    @FXML
    private Label username;

    @FXML
    private TextField usernameInputArea;

    @FXML
    private Label password;

    @FXML
    private TextField passwordInputArea;

    @FXML
    private Label submitConfirmation;

    @FXML
    protected void onClearButtonClick() {
        usernameInputArea.clear();
        passwordInputArea.clear();
    }

    @FXML
    protected void onSubmitButtonClick() {
        if (usernameInputArea.getText().equals("admin") && passwordInputArea.getText().equals("1234")) {
            usernameInputArea.clear();
            passwordInputArea.clear();
            submitConfirmation.setText("Login successful!");
            submitConfirmation.setTextFill(Color.GREEN);
            submitConfirmation.setFont(new Font(14));
            usernameInputArea.setBorder(Border.stroke(Color.GREEN));
            passwordInputArea.setBorder(Border.stroke(Color.GREEN));
        }
        else if(usernameInputArea.getText().isEmpty() || passwordInputArea.getText().isEmpty()){

            if(usernameInputArea.getText().isEmpty() && passwordInputArea.getText().isEmpty()){
                usernameInputArea.setBorder(Border.stroke(Color.RED));
                passwordInputArea.setBorder(Border.stroke(Color.RED));
                submitConfirmation.setText("Please enter the login credentials...");
                submitConfirmation.setTextFill(Color.RED);
            }
            else if (usernameInputArea.getText().isEmpty()){
                usernameInputArea.setBorder(Border.stroke(Color.RED));
                submitConfirmation.setText("Please fill the Username!");
                passwordInputArea.setBorder(null);
                submitConfirmation.setTextFill(Color.RED);
            }
            else if(passwordInputArea.getText().isEmpty()){
                passwordInputArea.setBorder(Border.stroke(Color.RED));
                submitConfirmation.setText("Please fill the Password!");
                usernameInputArea.setBorder(null);
                submitConfirmation.setTextFill(Color.RED);
            }
            else{
                usernameInputArea.setBorder(Border.stroke(Color.RED));
                passwordInputArea.setBorder(Border.stroke(Color.RED));
                submitConfirmation.setText("Please fill the Username and Password!");
                submitConfirmation.setTextFill(Color.RED);
            }
        }
        else{
            usernameInputArea.setBorder(Border.stroke(Color.RED));
            passwordInputArea.setBorder(Border.stroke(Color.RED));
            usernameInputArea.clear();
            passwordInputArea.clear();

            submitConfirmation.setText("Invalid credentials!");
            submitConfirmation.setTextFill(Color.RED);
        }
    }
}