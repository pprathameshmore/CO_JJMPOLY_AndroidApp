package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.squareup.picasso.Picasso;

public class TimeTable extends AppCompatActivity {

    ImageView fyTimeTableImageView;
    ImageView syTimeTableImageView;
    ImageView tyTimeTableImageView;

    Firebase fyTimeTableImageViewFirebase;
    Firebase syTimeTableImageViewFirebase;
    Firebase tyTimeTableImageViewFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TimeTable.this,MainActivity.class));
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fyTimeTableImageView = (ImageView) findViewById(R.id.fyTimeTableImageView);
        syTimeTableImageView = (ImageView) findViewById(R.id.syTimeTableImageView);
        tyTimeTableImageView = (ImageView) findViewById(R.id.tyTimeTableImageView);


        fyTimeTableImageViewFirebase = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/syTimeTableImageView");

        fyTimeTableImageViewFirebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String fyTimeTableImageViewString = dataSnapshot.getValue(String.class) ;

                Picasso.with(TimeTable.this)
                        .load(fyTimeTableImageViewString)
                        .error(R.drawable.nointernet)
                        .placeholder(R.drawable.loading)
                        .into(fyTimeTableImageView);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        syTimeTableImageViewFirebase = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/syTimeTableImageView");

        syTimeTableImageViewFirebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String syTimeTableImageViewString = dataSnapshot.getValue(String.class);

                Picasso.with(TimeTable.this)
                        .load(syTimeTableImageViewString)
                        .error(R.drawable.nointernet)
                        .placeholder(R.drawable.loading)
                        .into(syTimeTableImageView);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        tyTimeTableImageViewFirebase = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/tyTimeTableImageView");

        tyTimeTableImageViewFirebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tyTimeTableImageViewString = dataSnapshot.getValue(String.class);

                Picasso.with(TimeTable.this)
                        .load(tyTimeTableImageViewString)
                        .error(R.drawable.nointernet)
                        .placeholder(R.drawable.loading)
                        .into(tyTimeTableImageView);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }


}
