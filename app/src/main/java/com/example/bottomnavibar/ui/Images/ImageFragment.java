package com.example.bottomnavibar.ui.Images;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavibar.databinding.FragmentImageBinding;

public class ImageFragment extends Fragment {

    private FragmentImageBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ImageViewModel notificationsViewModel =
                new ViewModelProvider(this).get(ImageViewModel.class);

        binding = FragmentImageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textImage;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}