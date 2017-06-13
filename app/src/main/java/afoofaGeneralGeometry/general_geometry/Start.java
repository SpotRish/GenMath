package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_start);
        Button calculate= (Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.b1);
        Button read=(Button)findViewById(afoofaGeneralGeometry.general_geometry.R.id.b2);
 }
    public void display(View v){

        Intent i = new Intent(this,Splash.class);

        startActivity(i);

    }
    public void read(View v){

        Intent in=new Intent(this,Index.class);
        startActivity(in);
                  }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(afoofaGeneralGeometry.general_geometry.R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == afoofaGeneralGeometry.general_geometry.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
