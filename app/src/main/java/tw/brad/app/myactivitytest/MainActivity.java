package tw.brad.app.myactivitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long lasttime = 0;
    private Button test3, test4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test3 = findViewById(R.id.test3btn);
        test4 = findViewById(R.id.test4btn);

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("brad", "here");
            }
        });

    }

    public void test1(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("name", "Brad");
        intent.putExtra("sound", false);
        intent.putExtra("stage", 4);
        startActivity(intent);

    }

    @Override
    public void finish() {
        if (System.currentTimeMillis() - lasttime > 3 * 1000){
            lasttime = System.currentTimeMillis();
            Toast.makeText(this, "Press <Back> one more to exit!",
                    Toast.LENGTH_SHORT).show();
        }else{
            super.finish();
        }

    }

    public void test34(View view) {
        Log.v("brad", "click 34");

        if (view == test3){
            Log.v("brad", "test3");
        }else if (view == test4){
            Log.v("brad", "test4");
        }


    }
}
