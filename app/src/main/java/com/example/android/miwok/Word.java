package com.example.android.miwok;

import android.widget.ListView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId;
    private boolean hasImage;
    private boolean hasAudio;

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
        hasAudio = true;
        hasImage = true;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
        hasImage = false;
        hasAudio = true;
    }

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        hasImage = false;
        hasAudio = false;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public int getAudioResourceId() {return mAudioResourceId;}

    public boolean hasImage() {return hasImage;}

    public boolean hasAudio() {return hasAudio;}
}
