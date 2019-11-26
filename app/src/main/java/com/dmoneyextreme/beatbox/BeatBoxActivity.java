package com.dmoneyextreme.beatbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class BeatBoxActivity extends SingleFragmentActivity {

    private TextView mSeekProgress;
    private SeekBar mSpeedbar;
    public static int gSpeed;

    @Override
    protected Fragment createFragment(){
        return BeatBoxFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gSpeed = 0;
        mSeekProgress = findViewById(R.id.speeedbar_progress);
        mSeekProgress.setText(getString(R.string.speedbar_label) + " 0%");

        mSpeedbar = findViewById(R.id.speedbar_seekbar);
        mSpeedbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mSeekProgress.setText(getString(R.string.speedbar_label) + " " + progress);
                gSpeed = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
