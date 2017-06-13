package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;


public class Circle extends Activity {
 Button ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_circle);
        ap = (Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);
        final double pi=3.14;
        final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final TextView display1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView display2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);

        ap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String a= ed.getText().toString();
                double i = Double.parseDouble(a);
                Double var = Double.parseDouble("2");
                double r=pi*(i*i);
                double p=var*pi*i;

                BigDecimal bd = new BigDecimal(r);
                BigDecimal bd1 = new BigDecimal(p);

                DecimalFormat numberFormat = new DecimalFormat("#.00");

                display1.setText("Area of Circel          : " + numberFormat.format(bd));

                display2.setText("Circumference of Circle : "+numberFormat.format(bd1));


            }
        });
    }


  }
