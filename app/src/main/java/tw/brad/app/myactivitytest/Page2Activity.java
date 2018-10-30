package tw.brad.app.myactivitytest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void test2(View view) {
        AlertDialog alertDialog = null;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("訊息");
        builder.setMessage("是否真的要離開嗎?");
        builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("否", null);
        builder.setCancelable(false);

        alertDialog = builder.create();

        alertDialog.show();


    }

}
