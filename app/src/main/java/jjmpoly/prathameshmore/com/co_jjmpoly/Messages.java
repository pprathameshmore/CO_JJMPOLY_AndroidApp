package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Messages extends AppCompatActivity {

    TextView message1,message2,message3,message4,message5;
    Firebase Message1,Message2,Message3,Message4,Message5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        message1 = (TextView) findViewById(R.id.message1);
        message2 = (TextView) findViewById(R.id.message2);
        message3 = (TextView) findViewById(R.id.message3);
        message4 = (TextView) findViewById(R.id.message4);
        message5 = (TextView) findViewById(R.id.message5);

        Message1 = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/message1");

        Message1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message1String = dataSnapshot.getValue(String.class);
                message1.setText(message1String);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Message2 = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/message2");

        Message2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message2String = dataSnapshot.getValue(String.class);
                message2.setText(message2String);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Message3 = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/message3");

        Message3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message3String = dataSnapshot.getValue(String.class);
                message1.setText(message3String);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Message4 = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/message4");

        Message4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message4String = dataSnapshot.getValue(String.class);
                message4.setText(message4String);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Message5 = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/message5");

        Message5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message5String = dataSnapshot.getValue(String.class);
                message5.setText(message5String);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }

}
