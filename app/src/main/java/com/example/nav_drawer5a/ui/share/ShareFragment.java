package com.example.nav_drawer5a.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nav_drawer5a.R;

public class ShareFragment extends Fragment {
    TextView txtNombre1;
    TextView txtApellido1;
    TextView txtNombreCompleto1;
    Button btnUnir1;

    private ShareViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_share, container, false);

        txtNombre1=root.findViewById(R.id.txtNombre);
        txtApellido1=root.findViewById(R.id.txtApellido);
        txtNombreCompleto1=root.findViewById(R.id.txtNombreCompleto);
        btnUnir1=root.findViewById(R.id.btnUnir);

        btnUnir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombreCompleto1.setText(txtNombre1.getText() + " " + txtApellido1.getText());

            }
        });



        return root;
    }
}