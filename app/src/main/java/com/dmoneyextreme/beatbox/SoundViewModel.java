package com.dmoneyextreme.beatbox;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatbox;

    public SoundViewModel(BeatBox beatBox){
        mBeatbox = beatBox;
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public BeatBox getBeatBox(){
        return mBeatbox;
    }

    public void onButtonClicked() {
        mBeatbox.play(mSound);
    }
}
