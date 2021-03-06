package com.frozenmeatball.myflashlight;

import android.view.View;

public class MainActivity extends Flashlight {

    public void onClick_ToFlashlight(View view){
        hideAllUI();
        mUIFlashlight.setVisibility(View.VISIBLE);
        mLastUIType = UIType.UI_TYPE_FLASHLIGHT;
        mCurrentUIType = UIType.UI_TYPE_FLASHLIGHT;
    }

    public void onClick_Controller(View view) {
        hideAllUI();
        if(mCurrentUIType != UIType.UI_TYPE_MAIN){
            mUIMain.setVisibility(View.VISIBLE);
            mCurrentUIType = UIType.UI_TYPE_MAIN;
        }

        else{
            switch (mLastUIType){
                case UI_TYPE_FLASHLIGHT:
                    mUIFlashlight.setVisibility(View.VISIBLE);
                    mCurrentUIType = UIType.UI_TYPE_FLASHLIGHT;
                    break;

                default:

                    break;
            }
        }
    }

}
