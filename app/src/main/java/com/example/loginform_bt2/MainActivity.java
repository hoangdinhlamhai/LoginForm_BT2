package com.example.loginform_bt2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input); // Sửa ID theo layout của bạn
        loginBtn = findViewById(R.id.login_btn); // Sửa ID theo layout của bạn// Sửa ID theo layout của bạn

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Giả sử bạn đã định nghĩa các TextView này
                TextView textViewUsername = findViewById(R.id.textViewUsername);
                TextView textViewPassword = findViewById(R.id.textViewPassword);

                // Thiết lập giá trị cho các TextView
                textViewUsername.setText("Username: " + username);
                textViewPassword.setText("Password: " + password);
            }
        });

        TextView textViewLogin = findViewById(R.id.register);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}