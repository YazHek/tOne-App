package com.lvivdroiddev.toneapp.reg.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.lvivdroiddev.toneapp.R;
import com.lvivdroiddev.toneapp.reg.models.WifiViewModel;

public class WifiFragment extends Fragment {

    private WifiViewModel wifiViewModel;
    private ConnectedFragment connectedFragment = new ConnectedFragment();
    private ImageView rectangleView, elipse_checked, elipse1,elipse2,elipse3;
    private TextView tone_text, connect_to_wifi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wifiViewModel =
                ViewModelProviders.of(this).get(WifiViewModel.class);
        View root = inflater.inflate(R.layout.activity_wifi, container, false);

        return root;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rectangleView = getActivity().findViewById(R.id.rectangleView);
        elipse_checked = getActivity().findViewById(R.id.elipse_checked);
        elipse1 = getActivity().findViewById(R.id.elipse1);
        elipse2 = getActivity().findViewById(R.id.elipse2);
        elipse3 = getActivity().findViewById(R.id.elipse3);
        tone_text = getActivity().findViewById(R.id.tone_text);
        connect_to_wifi = getActivity().findViewById(R.id.connect_to_wifi);
        final Button nextButton = getActivity().findViewById(R.id.btn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rectangleView.setVisibility(View.INVISIBLE);
                elipse_checked.setVisibility(View.INVISIBLE);
                elipse1.setVisibility(View.INVISIBLE);
                elipse2.setVisibility(View.INVISIBLE);
                elipse3.setVisibility(View.INVISIBLE);
                tone_text.setVisibility(View.INVISIBLE);
                connect_to_wifi.setVisibility(View.INVISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
                FragmentManager fmanager = getFragmentManager();
                final FragmentTransaction fragmentTransaction = fmanager.beginTransaction();
                fragmentTransaction.replace(R.id.main, connectedFragment);

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

    }

}
