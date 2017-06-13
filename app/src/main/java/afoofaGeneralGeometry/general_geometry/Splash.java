package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.BaseAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.ImageView;
import android.view.LayoutInflater;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(afoofaGeneralGeometry.general_geometry.R.layout.activity_splash);
        GridView gridview = (GridView) findViewById(afoofaGeneralGeometry.general_geometry.R.id.gridview);
        imageadapter myadapter = new imageadapter(this);
        gridview.setAdapter(myadapter);
        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position== 0) {
                    Intent cn = new Intent(getApplicationContext(), cone.class);
                    startActivity(cn);
                }
                if(position==1){
                    Intent sp=new Intent(getApplicationContext(),sphere.class);
                    startActivity(sp);
                }

                if(position==2){
                    Intent sp=new Intent(getApplicationContext(),Pyramid.class);
                    startActivity(sp);
                }
                if(position==3){
                    Intent sp=new Intent(getApplicationContext(),Hemisphere.class);
                    startActivity(sp);
                }
                if(position==4){
                    Intent sp=new Intent(getApplicationContext(),Triangle.class);
                    startActivity(sp);
                }
                if(position==5){
                    Intent sp=new Intent(getApplicationContext(),Circle.class);
                    startActivity(sp);
                }
                if(position==6){
                    Intent sp=new Intent(getApplicationContext(),Cuboid.class);
                    startActivity(sp);
                }
                if(position==7){
                    Intent sp=new Intent(getApplicationContext(),Cylinder.class);
                    startActivity(sp);
                }
                if(position==8){
                    Intent sp=new Intent(getApplicationContext(),Reactangle.class);
                    startActivity(sp);
                }
                if(position==9){
                    Intent sp=new Intent(getApplicationContext(),Trapezium.class);
                    startActivity(sp);
                }
                if(position==10){
                    Intent sp=new Intent(getApplicationContext(),Rhombus.class);
                    startActivity(sp);
                }
                if(position==11){
                    Intent sp=new Intent(getApplicationContext(),Square.class);
                    startActivity(sp);
                }


            }


        });
}
}
    class imageadapter extends BaseAdapter {
        private Context mContext;
        public Integer[] mThumbIds = {
                afoofaGeneralGeometry.general_geometry.R.drawable.cone,
                afoofaGeneralGeometry.general_geometry.R.drawable.sphere,
                afoofaGeneralGeometry.general_geometry.R.drawable.pyramid,
                afoofaGeneralGeometry.general_geometry.R.drawable.hemisphere,
                afoofaGeneralGeometry.general_geometry.R.drawable.triangle,
                afoofaGeneralGeometry.general_geometry.R.drawable.circle,
                afoofaGeneralGeometry.general_geometry.R.drawable.cuboid,
                afoofaGeneralGeometry.general_geometry.R.drawable.cylinder,
                afoofaGeneralGeometry.general_geometry.R.drawable.rectangle,
                afoofaGeneralGeometry.general_geometry.R.drawable.trapezium,
                afoofaGeneralGeometry.general_geometry.R.drawable.rhombus,
                afoofaGeneralGeometry.general_geometry.R.drawable.square,
        };

        // Constructor
        imageadapter(Context c) {
            mContext = c;

        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return mThumbIds[position];
        }

        public long getItemId(int position) {
            return position;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {

            View row=null;
            if(convertView==null)
            {
                LayoutInflater inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row=inflater .inflate(afoofaGeneralGeometry.general_geometry.R.layout.activity_fragment,parent,false);
            }
            else
            {
                row=convertView;
            }

            ImageView titleimage=(ImageView) row.findViewById(afoofaGeneralGeometry.general_geometry.R.id.imageview);

            titleimage.setImageResource(mThumbIds[position]);
            return row;
        }

    }


