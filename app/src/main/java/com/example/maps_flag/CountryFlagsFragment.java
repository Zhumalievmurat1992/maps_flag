package com.example.maps_flag;

import static com.example.maps_flag.MainFragment.st;
import static com.example.maps_flag.R.drawable.ic_africa;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CountryFlagsFragment extends Fragment implements OnClick {

    private RecyclerView recyclerView;
    private ContactAdapter adapter2;
    private ArrayList<Contact> list2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_flags, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        recyclerView = view.findViewById(R.id.flags);
        adapter2 = new ContactAdapter(list2, this);
        recyclerView.setAdapter(adapter2);
    }

    private void loadData() {

        Bundle bundle = getArguments();
        list2 = new ArrayList<>();
        String name = bundle.getString(st);

        switch (name) {
            case "Africa":
                // Africa
                list2 = new ArrayList<>();
                list2.add(new Contact("Morokko", R.drawable.ic_morokko));
                list2.add(new Contact("Mali", R.drawable.ic_mali));
                list2.add(new Contact("Algir", R.drawable.ic_algir));
                list2.add(new Contact("Tunis", R.drawable.ic_tunis));
                list2.add(new Contact("Somali", R.drawable.ic_so));
                break;
            case "Asia":
                // Asia
                list2.add(new Contact("Kazahstan", R.drawable.ic_kazahstan));
                list2.add(new Contact("Uzbekistan", R.drawable.ic_uz));
                list2.add(new Contact("Tgstan", R.drawable.ic_tjstan));
                list2.add(new Contact("South Korea", R.drawable.ic_korea));
                list2.add(new Contact("Kyrgyzstan", R.drawable.ic_kg));
                break;
            case "Australia":
                // Australia
                list2.add(new Contact("Samoa", R.drawable.ic_samoa));
                list2.add(new Contact("Australia", R.drawable.ic_australia));
                list2.add(new Contact("New Zeland", R.drawable.ic_new_zeland));
                break;
            case "Europa":
                // Europe
                list2.add(new Contact("Germani", R.drawable.ic_germania));
                list2.add(new Contact("Spain", R.drawable.ic_spain));
                list2.add(new Contact("Italy", R.drawable.ic_italy));
                list2.add(new Contact("Great Britian", R.drawable.ic_gb));
                list2.add(new Contact("France", R.drawable.ic_france));
                break;
            case "North America":
                // North America
                list2.add(new Contact("USA", R.drawable.ic_usa));
                list2.add(new Contact("Cuba", R.drawable.ic_cuba));
                list2.add(new Contact("Canada", R.drawable.ic_canada));
                list2.add(new Contact("Brazil", R.drawable.ic_brasil));
                list2.add(new Contact("Argentina", R.drawable.ic_argentina));
                break;

        }


    }

    @Override
    public void onClick(Contact continents) {

    }
}