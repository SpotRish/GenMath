package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Bsquare extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_bsquare);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(afoofaGeneralGeometry.general_geometry.R.menu.menu_bsquare, menu);
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
