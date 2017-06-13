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


public class Square extends Activity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_square);
        final EditText ed = (EditText) findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final TextView display1 = (TextView) findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView display2 = (TextView) findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);
        b=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String r= ed.getText().toString();
                double s=Double.parseDouble(r);
                Double var = Double.parseDouble("4");
                double area=s*s;
                double p=var*s;
                DecimalFormat numberFormat = new DecimalFormat("#.00");

                BigDecimal bd = new BigDecimal(area);
                BigDecimal bd1 = new BigDecimal(p);
                display1.setText("Area of square      : " + numberFormat.format(bd));
                display2.setText("Perimeter of square : " +numberFormat.format(bd1));

            }
        });



    }
}
