package mx.ipn.cecyt9.examen_primerparcial_fideladriansanchez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Usuario = "Alexis";
    String Password = "1234";
    String UsuarioObtenido = "";
    String PasswordObtenido = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Validacion(View view) {

        EditText tv = findViewById(R.id.Usuario);
        UsuarioObtenido = tv.getText().toString();

        EditText tv2 = findViewById(R.id.Contra);
        PasswordObtenido = tv2.getText().toString();

        if(PasswordObtenido.equals(Password) && UsuarioObtenido.equals(Usuario)){
            Intent intento = new Intent(MainActivity.this, Imagen.class);
            startActivity(intento);
        }
        else{
            Toast.makeText(MainActivity.this,"Usuario y/o Contraseña incorrectos",Toast.LENGTH_SHORT).show();
        }

    }
}
