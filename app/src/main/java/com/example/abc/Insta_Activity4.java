package com.example.abc;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.abc.ui.SearchFragment;
import com.example.abc.ui.dashboard.DashboardFragment;
import com.example.abc.ui.home.HomeFragment;
import com.example.abc.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Insta_Activity4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NotificationsFragment notificationsFragment=new NotificationsFragment();
        DashboardFragment dashboardFragment=new DashboardFragment();
        HomeFragment homeFragment=new HomeFragment();
        SearchFragment searchFragment=new SearchFragment();
        setContentView(R.layout.activity_insta4);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_insta4);
       // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
       // NavigationUI.setupWithNavController(binding.navView, navController);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView cameraToolbar = toolbar.findViewById(R.id.camera);

        cameraToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Insta_Activity4.this, "Camera is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

         getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

         navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 switch (item.getItemId()){
                     case R.id.navigation_home:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                         return true;

                     case R.id.search:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment).commit();
                         return true;

                     case R.id.navigation_notifications:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,notificationsFragment).commit();
                         return true;

                     case R.id.heart:
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,dashboardFragment).commit();
                         return true;

                 }
                 return false;
             }
         });




    }

}