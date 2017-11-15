package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.Model.ResultValidation;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail, etUsername;
    private String email, userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.emailInput);
        etUsername = findViewById(R.id.userNameInput);
    }


    public void onSaveClick(View view) {
        email = etEmail.getText().toString();
        userName = etUsername.getText().toString();

        NameValidation nameValidation = new NameValidation();
        EmailValidation emailValidation = new EmailValidation();

        ResultValidation nameValidationResult = nameValidation.validate(userName);
        ResultValidation emailValidationResult = emailValidation.validate(email);

        System.out.println(nameValidationResult.getResult());
        System.out.println(emailValidationResult.getResult());

        if(!nameValidationResult.getResult()) {
            Toast.makeText(this, nameValidationResult.getMessage(), Toast.LENGTH_SHORT).show();
        } else if (!emailValidationResult.getResult()) {
            Toast.makeText(this, emailValidationResult.getMessage(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Save Successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        etUsername.setText("");
        etEmail.setText("");
    }
}
