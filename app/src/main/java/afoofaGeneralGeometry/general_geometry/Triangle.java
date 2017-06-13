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


public class Triangle extends Activity {
 Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_triangle);
        a=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
        final EditText ed1=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText2);
        final TextView tv=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
        final TextView tv1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);
        a=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);

        a.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String b=ed.getText().toString();
                String h=ed1.getText().toString();
                Double bs=Double.parseDouble(b);
                Double hg=Double.parseDouble(h);
                Double var = Double.parseDouble("1/2");
                double ar=var*bs*hg;
                double pr=bs+bs+bs;

                BigDecimal bd = new BigDecimal(ar);
                BigDecimal bd1 = new BigDecimal(pr);
                DecimalFormat numberFormat = new DecimalFormat("#.00");

                tv.setText("AREA of an Equilateral Triangle    : "+ numberFormat.format(bd));

                tv1.setText("Perimeter(if triangle eqilateral) : "+numberFormat.format(bd1));

            }
          })

        );

    }
}
