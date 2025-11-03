//package com.example.omnirobot;
//
//import android.net.wifi.p2p.WifiP2pManager;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//
//import com.example.omnirobot.databinding.ActivityMainBinding;
//
//public class MainActivity extends AppCompatActivity {
//
//    private ActivityMainBinding binding;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        //knoppen invoegen en handlers geven?
//        Button mClickButton1 = findViewById(R.id.button);
//
//
//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);
//    }
//
//}

package com.example.omnirobot;

// Imports voor de benodigde classes
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView; // Importeer ImageView

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.omnirobot.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Gebruik ViewBinding om de layout in te stellen. Dit is de moderne manier.
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // BELANGRIJK: Dit moet als eerste!

        // --- HIER ZORGEN WE VOOR DE INTERACTIE VAN DE KNOP ---

        // 1. Vind de knop en de afbeelding in de layout
        // Let op: Ik gebruik hier 'binding.button' in plaats van findViewById.
        // Dit is de aanbevolen manier als je ViewBinding gebruikt.

        // Vervang 'idVanJeAfbeelding' met de daadwerkelijke ID uit je XML-bestand.
        final ConstraintLayout imageViewToToggle = binding.foto;

        // 2. Stel een OnClickListener in om de knop interactief te maken


        // --- EINDE KNOP-INTERACTIE ---


        // De rest van je bestaande code voor navigatie
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
}
