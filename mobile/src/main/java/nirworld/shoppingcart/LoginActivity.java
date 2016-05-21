package nirworld.shoppingcart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private AppCompatEditText usernameEdittext, passwordEdittext;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEdittext = (AppCompatEditText) findViewById(R.id.usernameEdittext);
        passwordEdittext = (AppCompatEditText) findViewById(R.id.passwordEdittext);
    }

    public void login(View v){
        username = usernameEdittext.getText().toString();
        password = passwordEdittext.getText().toString();

        if(username.isEmpty()){
            Toast.makeText(this, "Please enter username.", Toast.LENGTH_SHORT).show();
        }else if(password.isEmpty()){
            Toast.makeText(this, "Please enter password.", Toast.LENGTH_SHORT).show();
        }else{
            Intent homeIntent = new Intent(this, HomeActivity.class);
            homeIntent.putExtra("username", username);
            homeIntent.putExtra("password", password);
            startActivity(homeIntent);
            finish();
        }
    }
}
