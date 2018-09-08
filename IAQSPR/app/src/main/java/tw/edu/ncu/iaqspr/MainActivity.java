package tw.edu.ncu.iaqspr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(listener);
    }

    private Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
// TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ScrollingActivity.class);
            startActivity(intent);
            finish();
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
