package com.bn.testndk3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends android.app.NativeActivity
{
    Log.d("main","For test");
    static
    {
        System.loadLibrary("bn-vulkan-lib");
    }
}
