package id.cathode.android.androidactiviteslogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    
    public static final String TAG = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: is running");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: is running");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: is running");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: is running");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: is running");
    }
}
