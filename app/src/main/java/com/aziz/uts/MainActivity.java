package com.aziz.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ContactAdapter adapter;
    List<ContactModel> contactModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        adapter = new ContactAdapter(this, contactModels);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
        isiData();

    }

    private void isiData() {
        ContactModel model = new ContactModel("Aziz", "Aziz@gmail.com","085742123");
        contactModels.add(model);

        model = new ContactModel("Aziz 7", "Aziz7@gmail.com","085742123");
        contactModels.add(model);

        model = new ContactModel("Aziz27", "Aziz27@gmail.com","085742123");
        contactModels.add(model);

        adapter.notifyDataSetChanged();

    }
}
