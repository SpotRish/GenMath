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


public class sphere extends Activity {
Button ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_sphere);

    ap = (Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.button1);
    final double pi=3.14;
    final EditText ed=(EditText)findViewById(afoofaGeneralGeometry.general_geometry.R.id.editText1);
    final TextView d1=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView1);
    final TextView d2=(TextView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.textView2);
    ap.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            String a= ed.getText().toString();
            double i = Double.parseDouble(a);
            Double var = Double.parseDouble("4");
            Double var1 = Double.parseDouble("1.33");
            double csa=(var*pi*Math.pow(i,2));
            double vol=(var1*pi*Math.pow(i,3));

            DecimalFormat numberFormat = new DecimalFormat("#.00");

            BigDecimal bd = new BigDecimal(csa);
            BigDecimal bd1 = new BigDecimal(vol);

            d1.setText("Curved surface area : " +numberFormat.format(bd));

            d2.setText("Volume of sphere    : "+ numberFormat.format(bd1));

        }
    });

}
}
