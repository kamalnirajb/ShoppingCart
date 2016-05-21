package nirworld.shoppingcart;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends BaseActivity {

    private android.support.v7.widget.ListViewCompat listViewCompat;
    private Intent homeIntent;
    private ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeIntent = getIntent();
        listViewCompat = (android.support.v7.widget.ListViewCompat) findViewById(R.id.listview);

        for(int i=0;i<100;i++){
            HashMap<String , String> map = new HashMap<String, String>();
            map.put("name", i + " item");
            map.put("quantity", i+"");
            list.add(map);
        }

        listViewCompat.setAdapter(new CustomListAdapter(this, list));
    }
}
