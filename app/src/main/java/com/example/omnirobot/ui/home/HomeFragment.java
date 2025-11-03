package com.example.omnirobot.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.omnirobot.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //binding.foto.setVisibility(View.GONE);

        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.knop.setOnClickListener(v -> {
            if (binding.foto.getVisibility() == View.VISIBLE) {
                binding.foto.setVisibility(View.GONE);
                binding.tekstje.setVisibility(View.GONE);
            }
            else {
                binding.tekstje.setVisibility(View.VISIBLE);
                binding.foto.setVisibility(View.VISIBLE);
            }
        });


        final TextView textView = binding.tekst;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}