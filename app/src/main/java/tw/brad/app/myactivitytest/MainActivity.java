package tw.brad.app.myactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long lasttime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void test1(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
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
}
