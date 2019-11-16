package com.lvivdroiddev.toneapp.reg.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.lvivdroiddev.toneapp.R;
import com.lvivdroiddev.toneapp.reg.models.ConnectedViewModel;
import com.lvivdroiddev.toneapp.reg.models.WifiViewModel;

public class ConnectedFragment extends Fragment {

    private ConnectedViewModel connectedViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        connectedViewModel =
                ViewModelProviders.of(this).get(ConnectedViewModel.class);
        View root = inflater.inflate(R.layout.activity_connected, container, false);

        return root;
    }
}
