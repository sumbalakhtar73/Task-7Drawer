package com.example.task08drawer.app.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.task08drawer.R;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Drawer navdrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.drawertoolbar);
        setDrawer();

    }

    public void setDrawer()
    {
        navdrawer=new DrawerBuilder().withActivity(this).withToolbar(toolbar)
                .addDrawerItems(new PrimaryDrawerItem().withName("SignUp"),new DividerDrawerItem()
                ,new SecondaryDrawerItem().withName("Login"),new DividerDrawerItem()
                ,new SecondaryDrawerItem().withName("Search Facility"),new DividerDrawerItem()
                ,new SecondaryDrawerItem().withName("Contact Us"),new DividerDrawerItem()
                ,new SecondaryDrawerItem().withName("Settings")).
                        withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                            @Override
                            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                                switch (position)
                                {
                                    case 0:
                                        Intent sign=new Intent(MainActivity.this, SignUp.class);
                                        startActivity(sign);
                                        Toast.makeText(MainActivity.this, "SignUp", Toast.LENGTH_SHORT).show();
                                    break;
                                    case 1:
                                        break;
                                    case 2:
                                        Intent login=new Intent(MainActivity.this, Login.class);
                                        startActivity(login);
                                        Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        Toast.makeText(MainActivity.this, "Search Facility", Toast.LENGTH_SHORT).show();
                                        Intent s=new Intent(MainActivity.this, SearchFacility.class);
                                        startActivity(s);
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                                        Intent bb=new Intent(MainActivity.this, ContactUs.class);
                                        startActivity(bb);
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                                        Intent cc=new Intent(MainActivity.this, Setting.class);
                                        startActivity(cc);
                                        break;
                                }

                                return false;
                            }
                        }).build();
    }
}
