package pt.ipp.estg.dwdm.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.label_hello);

        textView.setText(getText(R.string.happy_birthday));

        Log.i(LOG_TAG,"OnCreate");
        Log.i(LOG_TAG,"OnStart");
        Log.i(LOG_TAG,"OnResume");
        Log.i(LOG_TAG,"OnPause");
        Log.i(LOG_TAG,"OnStop");
        Log.i(LOG_TAG,"OnDestroy");
    }
}