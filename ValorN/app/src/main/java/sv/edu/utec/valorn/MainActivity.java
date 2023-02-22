package sv.edu.utec.valorn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
TextView txvalorn, txresp1, txresp2,txresp3;
Button btmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvalorn=findViewById(R.id.txvvalorn);
        txresp1=findViewById(R.id.txvResultado1);
        txresp2=findViewById(R.id.txvResultado2);
        txresp3=findViewById(R.id.txvResultado3);

        int valorn=85;
        int resp1, resp2, resp3;

        resp1 = valorn+77;
        resp2 = resp1-3;
        resp3 = resp2*2;
        txvalorn.setText("El valor N es: "+String.valueOf(valorn));
        txresp1.setText(String.valueOf(valorn)+"+ 77 = "+String.valueOf(resp1));
        txresp2.setText(String.valueOf(resp1)+"- 3 =  "+String.valueOf(resp2));
        txresp3.setText(String.valueOf(resp2)+"* 2 = "+String.valueOf(resp3));
    }
    
}