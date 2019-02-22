package myapp.anilandroid.com.listview_custom_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import myapp.anilandroid.com.listview_custom_adapter.Adapter.Custom_Adapter;
import myapp.anilandroid.com.listview_custom_adapter.Model.Playerdetail;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Playerdetail> playerdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        listView = (ListView) findViewById( R.id.list_item );

        playerdetails = new ArrayList<>();
        Playerdetail p1 = new Playerdetail();
        p1.setIMAGES( R.drawable.ganguly );
        p1.setNames( "ganguly" );
        p1.setDescription( "batsman" );
        playerdetails.add( p1 );

        Playerdetail p2 = new Playerdetail();
        p2.setIMAGES( R.drawable.tend );
        p2.setNames( "tendulkar" );
        p2.setDescription( "batsman" );
        playerdetails.add( p2 );


        Playerdetail p3 = new Playerdetail();
        p3.setIMAGES( R.drawable.shew );
        p3.setNames( "shew" );
        p3.setDescription( "batsman" );
        playerdetails.add( p3 );

        Playerdetail p4 = new Playerdetail();
        p4.setIMAGES( R.drawable.rahul);
        p4.setNames( "Rahul dravid" );
        p4.setDescription( "batsman" );
        playerdetails.add( p4 );

        Playerdetail p5=new Playerdetail(  );
        p5.setIMAGES( R.drawable.ms_dhoni );
        p5.setNames(  "Ms Dhoni");
        p5.setDescription( "batsman" );
        playerdetails.add( p5 );

        Playerdetail p6=new Playerdetail(  );
        p6.setIMAGES( R.drawable.yuvraj_singh);
        p6.setNames( "Yuvaraj Singh" );
        p6.setDescription( "batsman" );
        playerdetails.add( p6 );


        Custom_Adapter custom_adapter = new Custom_Adapter( getApplicationContext(), playerdetails );
        listView.setAdapter( custom_adapter );

    }
}
