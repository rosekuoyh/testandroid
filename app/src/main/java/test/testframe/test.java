package test.testframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class test extends AppCompatActivity {
    /*
    private ArrayList<Contact> list = new ArrayList<>();
    */
    FirebaseDatabase mdatabase;
    DatabaseReference mRef;
    private double arr[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mdatabase = FirebaseDatabase.getInstance();
        mRef = mdatabase.getReference("sensor");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                arr = new double[(int) dataSnapshot.child("test").child("0").getChildrenCount()][(int) dataSnapshot.child("test").getChildrenCount()];
                for(int i=0;i<dataSnapshot.child("test").getChildrenCount();i++){
                    for(int k=0;k<4;k++){
                        double date = Double.parseDouble(dataSnapshot.child("test").child(String.valueOf(i)).child("date").getValue()+"");
                        double humidity = Double.parseDouble(dataSnapshot.child("test").child(String.valueOf(i)).child("humidity").getValue()+"");
                        double pressure = Double.parseDouble(dataSnapshot.child("test").child(String.valueOf(i)).child("pressure").getValue()+"");
                        double temp = Double.parseDouble(dataSnapshot.child("test").child(String.valueOf(i)).child("temp").getValue()+"");
                        if(k==0){
                            arr[k][i-1] = date;
                        }else if(k==1){
                            arr[k][i-1] = humidity;
                        }else if(k==2){
                            arr[k][i-1] = pressure;
                        }else{
                            arr[k][i-1] = temp;
                        }
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        sendData();
        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);
/*
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
    private void sendData(){
        Bundle bundle = new Bundle();
        bundle.putSerializable("arr",arr);
        SensorFragment sensorFragment = new SensorFragment();
        sensorFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,sensorFragment).commit();
    }
}


