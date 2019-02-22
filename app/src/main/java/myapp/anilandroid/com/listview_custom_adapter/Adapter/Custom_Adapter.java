package myapp.anilandroid.com.listview_custom_adapter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import myapp.anilandroid.com.listview_custom_adapter.Model.Playerdetail;
import myapp.anilandroid.com.listview_custom_adapter.R;

public class Custom_Adapter extends BaseAdapter {
    Context context;
    ArrayList<Playerdetail> playerdata;
    LayoutInflater layoutInflater = null;

    public Custom_Adapter(Context context, ArrayList<Playerdetail> arrayList) {
        this.context = context;
        this.playerdata = arrayList;
    }

    @Override
    public int getCount() {
        return playerdata.size();
    }

    @Override
    public Object getItem(int i) {
        return playerdata.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        view = layoutInflater.inflate( R.layout.custom_layout, null );
        Playerdetail playerdetail = (Playerdetail) getItem(i);


        ImageView imageView = view.findViewById( R.id.img_1 );
        TextView textView = view.findViewById( R.id.tv_1 );
        TextView textView1 = view.findViewById( R.id.tv_2 );


        imageView.setImageResource( playerdetail.getIMAGES() );
        textView.setText( playerdetail.getNames() );
        textView1.setText( playerdetail.getDescription() );

        return view;
    }


}
