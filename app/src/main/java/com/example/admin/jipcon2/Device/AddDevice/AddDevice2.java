package com.example.admin.jipcon2.Device.AddDevice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.admin.jipcon2.R;

/**
 * Created by admin on 2017-04-15.
 */

public class AddDevice2 extends Fragment {
    LinearLayout linearLayout;
    MakeDeviceListner makeDeviceListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        makeDeviceListener=(MakeDeviceListner) context;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        linearLayout = (LinearLayout) inflater.inflate(R.layout.add_device2,container,false);

        return linearLayout;
    }
}