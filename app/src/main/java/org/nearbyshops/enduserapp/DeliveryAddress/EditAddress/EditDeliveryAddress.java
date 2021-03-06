package org.nearbyshops.enduserapp.DeliveryAddress.EditAddress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.nearbyshops.enduserapp.R;

public class EditDeliveryAddress extends AppCompatActivity {

    public static final String TAG_FRAGMENT_EDIT = "fragment_edit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_delivery_address);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT_EDIT)==null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container,new EditAddressFragment(),TAG_FRAGMENT_EDIT)
                    .commit();
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
