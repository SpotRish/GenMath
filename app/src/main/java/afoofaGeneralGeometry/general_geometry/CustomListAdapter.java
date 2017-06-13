package afoofaGeneralGeometry.general_geometry;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter<String> {
    private  final Activity context ;
    private final String[] itemname;
    private final Integer[] imgid;
    private Activity cont = null;

public  CustomListAdapter(){
    super(null, afoofaGeneralGeometry.general_geometry.R.layout.activity_custom_list_adapter);
    this.context=null;
    this.itemname=null;
    this.imgid=null;
}
    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
                super(context, afoofaGeneralGeometry.general_geometry.R.layout.activity_custom_list_adapter, itemname);
                // TODO Auto-generated constructor stub

                this.context=context;
                this.itemname=itemname;
                this.imgid=imgid;

    }

            public View getView(int position,View view,ViewGroup parent) {
                LayoutInflater inflater=context.getLayoutInflater();
                View rowView=inflater.inflate(afoofaGeneralGeometry.general_geometry.R.layout.activity_custom_list_adapter, null,true);

                TextView txtTitle = (TextView) rowView.findViewById(afoofaGeneralGeometry.general_geometry.R.id.item);
                ImageView imageView = (ImageView) rowView.findViewById(afoofaGeneralGeometry.general_geometry.R.id.icon);
                txtTitle.setText(itemname[position]);
                imageView.setImageResource(imgid[position]);

                return rowView;

            };

        }

