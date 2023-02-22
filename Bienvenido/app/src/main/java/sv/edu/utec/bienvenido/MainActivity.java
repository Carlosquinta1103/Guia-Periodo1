package sv.edu.utec.bienvenido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
EditText etnombre;
TextView txpalabra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=findViewById(R.id.edtnombre);
        txpalabra=findViewById(R.id.txvpalabra);
    }

    public void Bienvenido (View view){
        String nombre="";
        nombre=etnombre.getText().toString();
        txpalabra.setText("Bienvenido "+nombre+" :)");
    }
}