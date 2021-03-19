package com.example.servicesupport;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.nav_home){

        }else if(id==R.id.nav_PunchIn){

        }else if(id==R.id.nav_Attendance){

        }else if(id==R.id.nav_ComplaintResolve){

        }else if(id==R.id.nav_ComplaintBooking){

        }else if(id==R.id.nav_EngInstallation){

        }else if(id==R.id.nav_installation){

        }else if(id==R.id.nav_Expense){

        }else if(id==R.id.nav_Pm_report){

        }else if(id==R.id.nav_Mat_Acceptance){

        }else if(id==R.id.nav_mat_mangement){

        }else if(id==R.id.nav_Trip_request){

        }else if(id==R.id.nav_){

        }
        DrawerLayout drawer=(DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}