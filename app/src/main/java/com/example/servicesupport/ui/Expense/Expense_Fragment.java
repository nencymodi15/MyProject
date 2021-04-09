package com.example.servicesupport.ui.Expense;

import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.servicesupport.R;

public class Expense_Fragment extends Fragment {
    Dialog myDialog;

    private ExpenseViewModel mViewModel;

    public static Expense_Fragment newInstance() {
        return new Expense_Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Context myContext=container.getContext();
        myDialog=new Dialog(myContext);
        return inflater.inflate(R.layout.expense__fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ExpenseViewModel.class);


    }
    public void ShowPopUp(View v){
        TextView txtclose;
        RecyclerView recyclerView;
        Button btn1;
        myDialog.setContentView(R.layout.expense_popup);
        txtclose=(TextView)myDialog.findViewById(R.id.txtclose);
        btn1=(Button) myDialog.findViewById(R.id.btn1);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

}