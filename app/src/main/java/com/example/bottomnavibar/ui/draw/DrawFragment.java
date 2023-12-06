package com.example.bottomnavibar.ui.draw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavibar.databinding.FragmentDrawBinding;

public class DrawFragment extends Fragment {

    private FragmentDrawBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DrawViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DrawViewModel.class);

        binding = FragmentDrawBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.drawFrag;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}