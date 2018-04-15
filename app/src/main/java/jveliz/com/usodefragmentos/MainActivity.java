package jveliz.com.usodefragmentos;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import jveliz.com.usodefragmentos.fragmento.InicioFragmento;
import jveliz.com.usodefragmentos.fragmento.blank_fragment;
import jveliz.com.usodefragmentos.fragmento.notificacionFragmento;
public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private FrameLayout mContenedor;
    private FragmentManager manager=getSupportFragmentManager();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   manager.beginTransaction()
                           .replace(R.id.frameLayout,
                                   new InicioFragmento())
                           .commit();
                    return true;
                case R.id.navigation_dashboard:
                    manager.beginTransaction()
                            .replace(R.id.frameLayout,
                                   new blank_fragment())
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                    manager.beginTransaction()
                            .replace(R.id.frameLayout,
                                    new notificacionFragmento())
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContenedor = findViewById(R.id.frameLayout);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
