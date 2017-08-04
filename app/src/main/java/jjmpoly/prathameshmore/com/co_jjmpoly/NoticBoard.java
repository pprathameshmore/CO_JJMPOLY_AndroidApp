package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.squareup.picasso.Picasso;

public class NoticBoard extends AppCompatActivity {

    ImageView notice1, notice2,notice3, notice4,notice5, notice6,notice7;
    Firebase notice1ImageView,notice2ImageView,notice3ImageView,notice4ImageView,notice5ImageView,notice6ImageView,notice7ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notic_board);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        notice1 = (ImageView) findViewById(R.id.notice1);
        notice2 = (ImageView) findViewById(R.id.notice2);
        notice3 = (ImageView) findViewById(R.id.notice3);
        notice4 = (ImageView) findViewById(R.id.notice4);
        notice5 = (ImageView) findViewById(R.id.notice5);
        notice6 = (ImageView) findViewById(R.id.notice6);
        notice7 = (ImageView) findViewById(R.id.notice7);

        notice1ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice1");

        notice1ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice1String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice1String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice2ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice2");

        notice2ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice2String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice2String)
                        .error(R.drawable.nointernet)
                        .placeholder(R.drawable.loading)
                        .into(notice2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice3ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice3");

        notice3ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice3String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice3String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice4ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice4");

        notice4ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice4String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice4String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice5ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice5");

        notice5ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice5String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice5String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice5);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice6ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice6");

        notice6ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice6String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice6String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice6);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notice7ImageView = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/notice7");

        notice7ImageView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String notice7String = dataSnapshot.getValue(String.class);
                Picasso.with(NoticBoard.this)
                        .load(notice7String)
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.nointernet)
                        .into(notice7);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }

}
