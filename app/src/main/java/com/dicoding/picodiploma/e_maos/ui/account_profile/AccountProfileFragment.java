package com.dicoding.picodiploma.e_maos.ui.account_profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dicoding.picodiploma.e_maos.R;

public class AccountProfileFragment extends Fragment {
    private AccountProfileViewModel accountProfileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        accountProfileViewModel =
                ViewModelProviders.of(this).get(AccountProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_account_profile, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        accountProfileViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
