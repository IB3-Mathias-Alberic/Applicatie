package com.example.omnirobot.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.omnirobot.databinding.FragmentDashboardBinding;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private ArrayList<String> waardes = new ArrayList<>();
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        // knoppen
        Button button1 = binding.dashboardButton1;
        Button button2 = binding.dashboardButton2;
        Button button3 = binding.dashboardButton3;
        TextView outputTextView = binding.dashboardOutputText;

        button1.setOnClickListener(v -> {
            waardes.add("item 1");
            outputTextView.setText("geselecteerd: " + waardes.toString());
        });

        button2.setOnClickListener(v -> {
            waardes.add("item 2");
            outputTextView.setText("geselecteerd: " + waardes.toString());
        });

        button3.setOnClickListener(v -> {
            waardes.add("item 3");
            outputTextView.setText("geselecteerd: " + waardes.toString());
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}