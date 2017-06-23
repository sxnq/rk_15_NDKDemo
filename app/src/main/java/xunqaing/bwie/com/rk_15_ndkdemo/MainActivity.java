package xunqaing.bwie.com.rk_15_ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this,""+getKey(0),Toast.LENGTH_SHORT).show();


//        Log.e("xunxun","getKey(1)"+getKey(1));

    }

    static {

        System.loadLibrary("str");

    }


    public native String getKey(int key);

}