package appewtc.masterung.kmutnbrobotarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private TextView textView;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        //SeekBar Controller
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText(Integer.toString(i * 10));
                uploadValueToDweet(i*10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }   // Main Method

    private void uploadValueToDweet(int i) {

        String urlDweet = "https://dweet.io/dweet/for/masterUNG?servo1=" + Integer.toString(i);

        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = new FormEncodingBuilder()
                .add("Test", "test")
                .build();


    }   // upload

}   // Main Class
