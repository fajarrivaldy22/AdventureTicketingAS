package com.example.aldi.adventureticketing;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View homeFragment = inflater.inflate(R.layout.fragment_home,container,false);
        getActivity().setTitle("Home");

        LinearLayout linear_btn_adventure = (LinearLayout) homeFragment.findViewById(R.id.linear_motoadventure);
        LinearLayout linear_btn_bike = (LinearLayout) homeFragment.findViewById(R.id.linear_bike);

        linear_btn_adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adventureMenu = new Intent(getActivity(),AdventureMenuActivity.class);
                startActivity(adventureMenu);
            }
        });

        linear_btn_bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Bike Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return homeFragment;
    }
}
