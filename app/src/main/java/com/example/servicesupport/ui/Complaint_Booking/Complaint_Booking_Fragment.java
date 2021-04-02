package com.example.servicesupport.ui.Complaint_Booking;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.servicesupport.R;

public class Complaint_Booking_Fragment extends Fragment {

    private ComplaintBookingViewModel mViewModel;

    public static Complaint_Booking_Fragment newInstance() {
        return new Complaint_Booking_Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.complaint__booking__fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ComplaintBookingViewModel.class);
        // TODO: Use the ViewModel
    }

}