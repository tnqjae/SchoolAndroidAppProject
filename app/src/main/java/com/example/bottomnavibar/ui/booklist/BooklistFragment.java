package com.example.bottomnavibar.ui.booklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavibar.databinding.FragmentBooklistBinding;

public class BooklistFragment extends Fragment {

    private FragmentBooklistBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BooklistViewModel dashboardViewModel =
                new ViewModelProvider(this).get(BooklistViewModel.class);

        binding = FragmentBooklistBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.booklist;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}