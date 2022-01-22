package com.example.maps_flag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class MainFragment extends Fragment implements OnClick {


    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    private ArrayList<Contact> list;
    final static String st = "id";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new ContactAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Contact("Africa", R.drawable.ic_africa));
        list.add(new Contact("Asia", R.drawable.ic_asia));
        list.add(new Contact("Australia", R.drawable.ic_avstr));
        list.add(new Contact("Europa", R.drawable.ic_europa));
        list.add(new Contact("North America", R.drawable.ic_north_america));
        list.add(new Contact("South America", R.drawable.ic_south_america));

    }


    public void onClick(Contact continents) {
        Toast.makeText(requireActivity(), " " + continents.getName(), Toast.LENGTH_SHORT).show();
        MainActivity activity = (MainActivity) requireActivity();
        MainActivity.isMainFragment = false;
        Bundle bundle = new Bundle();
        Fragment fragment = new CountryFlagsFragment();
        bundle.putString(st, continents.getName());


        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();


    }

}