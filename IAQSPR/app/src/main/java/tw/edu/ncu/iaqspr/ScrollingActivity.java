package tw.edu.ncu.iaqspr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ScrollingActivity extends Activity {
    private Button button;
    private Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
// TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(ScrollingActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
    }
}
