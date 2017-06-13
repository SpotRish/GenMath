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


public class Hemisphere extends Activity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_hemisphere);

        final double pi=3.14;
        final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final TextView display1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv1);
        final TextView display2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv2);
        final TextView display3=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv3);

        b =(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String r= ed.getText().toString();
                double i = Double.parseDouble(r);
                Double var = Double.parseDouble("2");
                Double var1 = Double.parseDouble("0.67");
                double csa=(var*pi*i*i);
                double tsa=(var*pi*i*i+pi*i*i);
                double vol=(var1*pi*i*i*i);


                BigDecimal bd = new BigDecimal(csa);
                BigDecimal bd1 = new BigDecimal(tsa);
                BigDecimal bd2 = new BigDecimal(vol);
                DecimalFormat numberFormat = new DecimalFormat("#.00");

                display1.setText("Curved Surface Area : " + numberFormat.format(bd));
                display2.setText("Total Surface Area  : " + numberFormat.format(bd1));
                display3.setText("Volume              : " + numberFormat.format(bd2));


            }
        });


    }

}

