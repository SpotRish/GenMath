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


public class Pyramid extends Activity {
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_pyramid);
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
                double h = Double.parseDouble(a);
                String b=ed1.getText().toString();
                double l = Double.parseDouble(b);
                String c=ed2.getText().toString();
                double w = Double.parseDouble(c);

                double v=Math.pow((l/2),2);
                double v1=Math.pow(h,2);
                double v2=Math.pow((w/2),2);
                double sq1=Math.sqrt((v2+v1+w));
                double sq2=Math.sqrt((v+v1));

                double sa=((l*w)+(l*(sq1*sq2)));

                double vol=(Math.sqrt(5*(Math.pow(w,3)/6)));


                BigDecimal bd = new BigDecimal(sa);
                BigDecimal bd1 = new BigDecimal(vol);
                DecimalFormat numberFormat = new DecimalFormat("#.00");


                t.setText("Surface Area of rectangular pyramid : "+ numberFormat.format(bd));
                t2.setText("Volume of rectangular pyramid      : "+  numberFormat.format(bd1));

            }
        });

    }

}