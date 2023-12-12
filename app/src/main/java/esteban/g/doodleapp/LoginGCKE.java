package esteban.g.doodleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginGCKE extends AppCompatActivity {

    EditText editTextUserGCKE, editTextPasswordGCKE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logingcke);

        editTextUserGCKE = findViewById(R.id.editTextUsernameGCKE);
        editTextPasswordGCKE = findViewById(R.id.editTextPasswordGCKE);

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
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("nombre",userGCKE);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Debe ingresar los datos", Toast.LENGTH_SHORT).show();
        }
    }
}