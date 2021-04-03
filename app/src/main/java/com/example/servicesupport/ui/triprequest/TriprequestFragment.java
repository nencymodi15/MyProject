package com.example.servicesupport.ui.triprequest;

import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.servicesupport.R;

public class TriprequestFragment extends Fragment {

    private TriprequestViewModel mViewModel;
    Spinner purpose;
    Spinner Tavelmode;
    Spinner reigon;
    Spinner approveautho;
    ImageView add;


    public static TriprequestFragment newInstance() {
        return new TriprequestFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Context thiscontext = container.getContext();
        View v = inflater.inflate(R.layout.triprequest_fragment, container, false);
        add = v.findViewById(R.id.addbutton);
        purpose = v.findViewById(R.id.sppurpose);
        Tavelmode = v.findViewById(R.id.sptravelmode);
        reigon = v.findViewById(R.id.spregion);
        approveautho = v.findViewById(R.id.spapprovea);
        ArrayAdapter<CharSequence> adapterpurpose = ArrayAdapter.createFromResource(thiscontext,
                R.array.Purpose, android.R.layout.simple_spinner_item);
        adapterpurpose.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        purpose.setAdapter(adapterpurpose);
        ArrayAdapter<CharSequence> adaptertravelmode = ArrayAdapter.createFromResource(thiscontext,
                R.array.TravelMode,android.R.layout.simple_spinner_item);
        adapterpurpose.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Tavelmode.setAdapter(adapterpurpose);
        ArrayAdapter<CharSequence> adapterregion = ArrayAdapter.createFromResource(thiscontext,
                R.array.Reigon, android.R.layout.simple_spinner_item);
        adapterregion.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reigon.setAdapter(adapterregion);
        ArrayAdapter<CharSequence> adapterappr = ArrayAdapter.createFromResource(thiscontext,
                R.array.ApproveAuthority, android.R.layout.simple_spinner_item);
        adapterappr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        approveautho.setAdapter(adapterappr);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(thiscontext,Addtriprequest.class);
                startActivity(i);
            }
        });
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TriprequestViewModel.class);
        // TODO: Use the ViewModel

    }

}