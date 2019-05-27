package com.amqtech.opensource.appintroexample.ui.permsTabs;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.amqtech.opensource.appintroexample.ui.permsTabs.intro.PermissionsIntro2;
import com.github.paolorotolo.appintroexample.R;

public class PermissionsLayout2Intro extends Fragment {

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button demo = getView().findViewById(R.id.intro2);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity().getBaseContext(), PermissionsIntro2.class));
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_permissions_2, container, false);
    }
}
