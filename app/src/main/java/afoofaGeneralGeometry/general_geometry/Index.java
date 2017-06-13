package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


//MainActivity------->>>>>>>>


public class Index extends Activity {

    Intent in=getIntent();
    ListView list;
    String[] itemname ={
            "Cone",
            "Sphere",
            "Pyramid",
            "Hemisphere",
            "Triangle",
            "Circle",
            "Cuboid",
            "Cylinder",
            "Rectangle",
            "Rhombus",
            "Square",
            "Trapezium"
    };

    Integer[] imgid={
            afoofaGeneralGeometry.general_geometry.R.drawable.cone,
            afoofaGeneralGeometry.general_geometry.R.drawable.sphere,
            afoofaGeneralGeometry.general_geometry.R.drawable.pyramid,
            afoofaGeneralGeometry.general_geometry.R.drawable.hemisphere,
            afoofaGeneralGeometry.general_geometry.R.drawable.triangle,
            afoofaGeneralGeometry.general_geometry.R.drawable.circle,
            afoofaGeneralGeometry.general_geometry.R.drawable.cuboid,
            afoofaGeneralGeometry.general_geometry.R.drawable.cylinder,
            afoofaGeneralGeometry.general_geometry.R.drawable.rectangle,
            afoofaGeneralGeometry.general_geometry.R.drawable.rhombus,
            afoofaGeneralGeometry.general_geometry.R.drawable.square,
            afoofaGeneralGeometry.general_geometry.R.drawable.trapezium,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_index);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(afoofaGeneralGeometry.general_geometry.R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                if (position== 0) {
                    Intent cn = new Intent(getApplicationContext(), Bcone.class);
                    startActivity(cn);
                }
                if(position==1){
                    Intent sp=new Intent(getApplicationContext(),Bsphere.class);
                    startActivity(sp);
                }

                if(position==2){
                    Intent sp=new Intent(getApplicationContext(),Bpyramid.class);
                    startActivity(sp);
                }
                if(position==3){
                    Intent sp=new Intent(getApplicationContext(),Bhemisphere.class);
                    startActivity(sp);
                }
                if(position==4){
                    Intent sp=new Intent(getApplicationContext(),Btriangle.class);
                    startActivity(sp);
                }
                if(position==5){
                    Intent sp=new Intent(getApplicationContext(),Bcircle.class);
                    startActivity(sp);
                }
                if(position==6){
                    Intent sp=new Intent(getApplicationContext(),Bcuboid.class);
                    startActivity(sp);
                }
                if(position==7){
                    Intent sp=new Intent(getApplicationContext(),Bcylinder.class);
                    startActivity(sp);
                }
                if(position==8){
                    Intent sp=new Intent(getApplicationContext(),Brectangle.class);
                    startActivity(sp);
                }
                if(position==9){
                    Intent sp=new Intent(getApplicationContext(),Brhombus.class);
                    startActivity(sp);
                }
                if(position==10){
                    Intent sp=new Intent(getApplicationContext(),Bsquare.class);
                    startActivity(sp);
                }
                if(position==11){
                    Intent sp=new Intent(getApplicationContext(),Btrapezium.class);
                    startActivity(sp);
                }

            }
        });
    }
}



