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


public class Reactangle extends Activity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_reactangle);
        final EditText ed = (EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final EditText ed1 = (EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText2);
        final TextView d1 = (TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView d2 = (TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);
        b=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String b= ed.getText().toString();
                double l = Double.parseDouble(b);
                String a= ed1.getText().toString();
                double w = Double.parseDouble(a);

                double	area=(l*w);
                Double var = Double.parseDouble("2");
                double add=l+w;
                double pr=(var*add);

                DecimalFormat numberFormat = new DecimalFormat("#.00");

                BigDecimal bd = new BigDecimal(area);
                BigDecimal bd1 = new BigDecimal(pr);
                d1.setText("Area of rectangle      : "+numberFormat.format(bd));
                d2.setText("perimeter of rectangle : "+ numberFormat.format(bd1));
            }
        });




    }



}
