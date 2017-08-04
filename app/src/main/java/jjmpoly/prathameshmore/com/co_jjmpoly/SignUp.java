package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {


    Button signUp, backToLogIn;
    EditText emailSignUp, passwordSignUp;
    FirebaseAuth auth;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth = FirebaseAuth.getInstance();

        signUp = (Button) findViewById(R.id.btnSignUp);
        backToLogIn = (Button) findViewById(R.id.btnBackToSignIn);

        emailSignUp = (EditText) findViewById(R.id.enterEmail);
        passwordSignUp = (EditText) findViewById(R.id.enterPassword);
        progressDialog = new ProgressDialog(this);

        backToLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, LogIn.class));
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailString = emailSignUp.getText().toString();
                String passwordString = passwordSignUp.getText().toString();

                if (TextUtils.isEmpty(emailString)) {
                    Toast.makeText(SignUp.this, "Enter email address !", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(passwordString)) {
                    Toast.makeText(SignUp.this, "Enter password !", Toast.LENGTH_LONG).show();
                    return;
                }
                    if (passwordString.length() < 6) {
                        Toast.makeText(SignUp.this, "Password must 6 character long !", Toast.LENGTH_LONG).show();
                        return;
                    }

                progressDialog.setMessage("Registering... ");
                progressDialog.show();
                progressDialog.setCancelable(false);

                    auth.createUserWithEmailAndPassword(emailString, passwordString)
                            .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    Toast.makeText(SignUp.this, "Sign Up Successful, Log In Now", Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(SignUp.this,MainActivity.class));
                                    if (!task.isSuccessful()) {
                                        Toast.makeText(SignUp.this, "Authentication Failed", Toast.LENGTH_LONG).show();
                                    } else {
                                        startActivity(new Intent(SignUp.this, LogIn.class));
                                        finish();
                                    }
                                    progressDialog.dismiss();
                                }

                            });
                }
            });

        }
}