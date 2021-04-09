package com.example.servicesupport.ui.Attendance;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.servicesupport.R;

public class Attendance_Fragement extends Fragment {

    private AttendanceFragementViewModel mViewModel;

    public static Attendance_Fragement newInstance() {
        return new Attendance_Fragement();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.attendance__fragement_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AttendanceFragementViewModel.class);
        // TODO: Use the ViewModel
    }

}