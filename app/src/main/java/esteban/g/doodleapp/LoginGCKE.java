package esteban.g.doodleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginGCKE extends AppCompatActivity {

    EditText editTextUserGCKE, editTextPasswordGCKE;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logingcke);

        editTextUserGCKE = findViewById(R.id.editTextUsernameGCKE);
        editTextPasswordGCKE = findViewById(R.id.editTextPasswordGCKE);

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);

        String savedUser = sharedPreferences.getString("lastUser", "");
        String savedPassword = sharedPreferences.getString("lastPassword", "");

        editTextUserGCKE.setText(savedUser);
        editTextPasswordGCKE.setText(savedPassword);

    }

    public void onClickButtonOkGCKE(View view) {
        DatosGCKE datosGCKE = new DatosGCKE(this);
        String userGCKE = editTextUserGCKE.getText().toString();
        String passwordGCKE = editTextPasswordGCKE.getText().toString();

        EntidadGCKE entidadGCKE = new EntidadGCKE(userGCKE, passwordGCKE);

        long count = datosGCKE.insert(entidadGCKE);

        if (count == 0) {
            Toast.makeText(this, "Registro no insertado", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Registro insertado", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickButtonIngresarGCKE(View view) {
        String userGCKE = editTextUserGCKE.getText().toString();
        String passwordGCKE= editTextPasswordGCKE.getText().toString();

        if ((userGCKE.equals("kevin") && passwordGCKE.equals("1234")) || ((userGCKE.equals("esteban")) && (passwordGCKE.equals("1234")))) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("lastUser", userGCKE);
            editor.putString("lastPassword", passwordGCKE);
            editor.apply();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("nombre",userGCKE);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Debe ingresar los datos", Toast.LENGTH_SHORT).show();
        }
    }
}