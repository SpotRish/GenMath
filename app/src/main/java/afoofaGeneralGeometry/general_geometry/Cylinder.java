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


public class Cylinder extends Activity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_cylinder);
        final double pi=3.14;

        final EditText ed =(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final EditText ed1 =(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText2);
        final TextView d=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView d1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);
        final TextView d2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView3);
         b=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String a= ed.getText().toString();
                double r = Double.parseDouble(a);
                String b= ed1.getText().toString();
                double h = Double.parseDouble(b);
                Double var = Double.parseDouble("2");
                Double var1 = Double.parseDouble("3");
                double csa =(var*pi*Math.pow(r, var)*h);
                double tsa =(var1 *pi*Math.pow(r,var)*h);
                double vol =( pi*Math.pow(r,var)*h);


                BigDecimal bd = new BigDecimal(csa);
                BigDecimal bd1 = new BigDecimal(tsa);
                BigDecimal bd2 = new BigDecimal(vol);

                DecimalFormat numberFormat = new DecimalFormat("#.00");

                d.setText("CSA of Cylinder : "+ numberFormat.format(bd));
                d1.setText("TSA of Cylinder : "+numberFormat.format(bd1));
                d2.setText("Vol of Cylinder : "+numberFormat.format(bd2));

            }
        });

    }

}

