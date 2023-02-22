package sv.edu.utec.costoiva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText etprecio;
    Button btncalculo;
    TextView twresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etprecio=findViewById(R.id.edtprecio);
        twresultado=findViewById(R.id.txvrespuesta);

    }

    public void Iva (View view){
        double precio, resultado;
        precio=Double.parseDouble(etprecio.getText().toString());
        if (precio>=0){
            resultado = precio*1.134;
            twresultado.setText("El Precio + IVA es: $"+String.valueOf(resultado));
        }
        else{
            resultado = precio*1.134;
            twresultado.setText("ingrese un numero mayor a 0 $");
        }


    }

}