package test.testframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class test extends AppCompatActivity {
    /*
    private ArrayList<Contact> list = new ArrayList<>();
    */
    FirebaseDatabase mdatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        /*
        mdatabase = FirebaseDatabase.getInstance();
        mRef = mdatabase.getReference("sensehat");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                arr =new double[(int)dataSnapshot.getChildrenCount()][(int)dataSnapshot.child("test")]
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        */
        /*我是用這段才成功的，但是欄位那裏都要改成你ㄉ~~
        ListView listView = (ListView) findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1);
        listView.setAdapter(adapter);
        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("contacts");
        reference_contacts.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                adapter.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren() ){
                    adapter.add(ds.child("name").getValue().toString());
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        */
    }
}


