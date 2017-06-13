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


public class Cuboid extends Activity {
Button ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_cuboid);
        ap = (Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final EditText ed1=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText2);
        final EditText ed2=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText3);
        final TextView disp1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView disp2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);

        ap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String a= ed.getText().toString();
                double l = Double.parseDouble(a);

                String b= ed1.getText().toString();
                double w= Double.parseDouble(b);


                String c= ed2.getText().toString();
                double h= Double.parseDouble(c);
                Double var = Double.parseDouble("2");
                double ar=(var*l*w+var*w*h+var*h*l);
                double vol=(l*w*h);



                BigDecimal bd = new BigDecimal(ar);
                BigDecimal bd1 = new BigDecimal(vol);
                DecimalFormat numberFormat = new DecimalFormat("#.00");

                disp1.setText("surface area is " + numberFormat.format(bd));
                disp2.setText("volume of cuboid " +numberFormat.format(bd1));
            }
        });

    }
}
