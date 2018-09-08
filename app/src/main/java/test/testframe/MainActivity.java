package test.testframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    private TextView textWelcome;
    private Button btnEnter;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textWelcome = findViewById(R.id.textWelcome);
        btnEnter = findViewById(R.id.btnEnter);
        button2 = findViewById(R.id.button2);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textWelcome.setText("HI");
//                textWelcome.setTextSize(50);
                Intent intent = new Intent( MainActivity.this, Tab.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textWelcome.setText("HI");
//                textWelcome.setTextSize(50);
                Intent intent = new Intent( MainActivity.this, test.class);
                startActivity(intent);

            }
        });
    }
}
