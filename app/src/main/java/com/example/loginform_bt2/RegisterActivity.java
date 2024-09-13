package com.example.loginform_bt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameInput = findViewById(R.id.inputUsername);
        passwordInput = findViewById(R.id.inputPassword); // Sửa ID theo layout của bạn
        registerBtn = findViewById(R.id.btnRegister); // Sửa ID theo layout của bạn// Sửa ID theo layout của bạn

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Giả sử bạn đã định nghĩa các TextView này
                TextView textViewUsername = findViewById(R.id.textView3);
                TextView textViewPassword = findViewById(R.id.textView4);

                // Thiết lập giá trị cho các TextView
                textViewUsername.setText("Username: " + username);
                textViewPassword.setText("Password: " + password);
            }
        });

        TextView textViewLogin = findViewById(R.id.alreadyHaveAccount);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}