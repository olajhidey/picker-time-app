package com.jonetech.pickerfortime;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pickTime(View view) {
        DialogFragment mPickerFragment = new TimePickerFragment();
        mPickerFragment.show(getFragmentManager(), getString(R.string.time_picker));
    }

    public void processTimePickerResult(int hour, int minute) {

        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);

        Toast.makeText(this, "Time: " + hour_string + ":" + minute_string, Toast.LENGTH_SHORT).show();
    }
}
