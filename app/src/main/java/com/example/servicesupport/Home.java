package com.example.servicesupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.servicesupport.ui.punchIn.PunchInViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_ComplaintResolve,R.id.nav_PunchIn,R.id.nav_ComplaintBooking,R.id.nav_EngInstallation,
                R.id.nav_installation,R.id.nav_Expense,R.id.nav_Pm_report,R.id.nav_Mat_Acceptance,R.id.nav_mat_mangement,
                R.id.nav_Trip_request,R.id.nav_arleave,R.id.nav_user,R.id.nav_help)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
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

        }else if(id==R.id.nav_arleave){

        }else if(id==R.id.nav_user){

        }else if(id==R.id.nav_notification){

        }else if(id==R.id.nav_help){

        }
        DrawerLayout drawer=(DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}