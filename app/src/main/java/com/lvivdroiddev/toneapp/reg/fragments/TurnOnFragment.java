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
import com.lvivdroiddev.toneapp.reg.models.TurnOnViewModel;

public class TurnOnFragment extends Fragment {

    private TurnOnViewModel turnOnViewModel;
    private WifiFragment wifiFragment = new WifiFragment();
    private ImageView rectangleView, elipse_checked, elipse1,elipse2,elipse3;
    private TextView turn_on;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        turnOnViewModel = ViewModelProviders.of(this).get(TurnOnViewModel.class);
        View v = inflater.inflate(R.layout.fragment_slider, container, false);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rectangleView = getActivity().findViewById(R.id.rectangleView);
        elipse_checked = getActivity().findViewById(R.id.elipse_checked);
        elipse1 = getActivity().findViewById(R.id.elipse1);
        elipse2 = getActivity().findViewById(R.id.elipse2);
        elipse3 = getActivity().findViewById(R.id.elipse3);
        turn_on = getActivity().findViewById(R.id.turn_on_device);
        final Button nextButton = getActivity().findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rectangleView.setVisibility(View.INVISIBLE);
                elipse_checked.setVisibility(View.INVISIBLE);
                elipse1.setVisibility(View.INVISIBLE);
                elipse2.setVisibility(View.INVISIBLE);
                elipse3.setVisibility(View.INVISIBLE);
                turn_on.setVisibility(View.INVISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
                FragmentManager fmanager = getFragmentManager();
                final FragmentTransaction fragmentTransaction = fmanager.beginTransaction();
                fragmentTransaction.replace(R.id.main, wifiFragment);

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

    }
}
