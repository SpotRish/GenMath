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


public class Trapezium extends Activity {
 Button ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_trapezium);
        ap = (Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final EditText ed1=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText2);
        final EditText ed2=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText3);
        final TextView disp1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        ap=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        ap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stubSSSSSS
                String a= ed.getText().toString();
                double h = Double.parseDouble(a);

                String b= ed1.getText().toString();
                double b1= Double.parseDouble(b);


                String c= ed2.getText().toString();
                double b2= Double.parseDouble(c);
                Double var = Double.parseDouble("1/2");
                double ar= var*(b1+b2)*h;

                DecimalFormat numberFormat = new DecimalFormat("#.00");

                BigDecimal bd = new BigDecimal(ar);

                disp1.setText("Area of Trapezium : " +numberFormat.format(bd) );
            }
        });
    }
}
