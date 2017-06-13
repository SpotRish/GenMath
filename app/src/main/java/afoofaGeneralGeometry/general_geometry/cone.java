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


public class cone extends Activity {
   Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_cone);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_cone);
        final double pi=3.14;
        final EditText ed =(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.et1);
        final EditText ed1 =(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.et2);
        final EditText ed2 =(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.et3);
        final TextView t=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv1);
        final TextView t1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv2);
        final TextView t2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.tv3);

        b=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.b1);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String a=ed.getText().toString();
                double i = Double.parseDouble(a);
                String b=ed1.getText().toString();
                double j = Double.parseDouble(b);
                String c=ed2.getText().toString();
                double k = Double.parseDouble(c);
                Double var = Double.parseDouble("0.33");
                double csa=(pi*i*k);
                double tsa=(pi*i*k)+(pi*i*i);
                double vol=(var)*((pi*(i*i)*j));


                BigDecimal bd = new BigDecimal(csa);
                BigDecimal bd1 = new BigDecimal(tsa);
                BigDecimal bd2 = new BigDecimal(vol);
                DecimalFormat numberFormat = new DecimalFormat("#.00");

                t.setText("Curved Surface Area " + numberFormat.format(bd));
                t1.setText("Total Surface Area " +  numberFormat.format(bd1));
                t2.setText("Volume of Cone " + numberFormat.format(bd2));
            }
        });
    }

}
