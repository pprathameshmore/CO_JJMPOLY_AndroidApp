package jjmpoly.prathameshmore.com.co_jjmpoly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button department, timeTable, message, noticeBoard, about, contacts, complaints;
    Firebase mainTextViewFirebase;
    Firebase mainImageViewViewFirebase;
    TextView mainTextView;
    ImageView mainImageView;
    // FirebaseAuth firebaseAuth;
    //FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = (TextView) findViewById(R.id.mainTextView);
        mainImageView = (ImageView) findViewById(R.id.mainImageView);

        department = (Button) findViewById(R.id.departmentButton);
        timeTable = (Button) findViewById(R.id.timeTableButton);
        noticeBoard = (Button) findViewById(R.id.noticeBoardButton);
        message = (Button) findViewById(R.id.messageButton);
        about = (Button) findViewById(R.id.aboutButton);
        contacts = (Button) findViewById(R.id.contactsButton);
        complaints = (Button) findViewById(R.id.complaintButton);
        //Adds
        MobileAds.initialize(getApplicationContext(), "pub-9370043571819984");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //Actionbar Icon
        {
            ActionBar actionBarIcon = getSupportActionBar();
            actionBarIcon.setIcon(R.mipmap.ic_launcher);
            actionBarIcon.setDisplayShowHomeEnabled(true);
            actionBarIcon.setDisplayUseLogoEnabled(true);
            actionBarIcon.setTitle("Computer Department");
        }

        mainTextViewFirebase = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/mainTextView");

        mainTextViewFirebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mainText = dataSnapshot.getValue(String.class);
                mainTextView.setText(mainText);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mainImageViewViewFirebase = new Firebase("https://cojjmpoly-9ab13.firebaseio.com/mainImageView");
        mainImageViewViewFirebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mainImageURL = dataSnapshot.getValue(String.class);

                Picasso.with(MainActivity.this).load(mainImageURL)
                        .error(R.drawable.mianplaceholder)
                        //.placeholder(R.drawable.mianplaceholder)
                        .placeholder(R.drawable.loading)
                        .into(mainImageView);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }


    //Navigating Activities form Main Activity
    public void btnDepartmentClick(View view) {
        startActivity(new Intent(this, Department.class));
        Toast.makeText(getApplicationContext(), "Internet connection required", Toast.LENGTH_SHORT).show();
    }

    public void btnTimeTableClick(View view) {
        startActivity(new Intent(this, TimeTable.class));
        Toast.makeText(getApplicationContext(), "Hold on...", Toast.LENGTH_SHORT).show();
    }

    public void btnNoticeBoardClick(View view) {
        startActivity(new Intent(this, NoticBoard.class));
        Toast.makeText(getApplicationContext(), "Internet connection required", Toast.LENGTH_SHORT).show();
    }

    public void btnMessageClick(View view) {
        startActivity(new Intent(MainActivity.this, Messages.class));
    }

    public void btnContactsClick(View view) {
        startActivity(new Intent(this, Contacts.class));
        Toast.makeText(getApplicationContext(), "Important Contacts of Staff", Toast.LENGTH_SHORT).show();
    }

    public void btnAboutClick(View view) {
        startActivity(new Intent(this, About.class));
        Toast.makeText(getApplicationContext(), "Thank you for downloading", Toast.LENGTH_SHORT).show();
    }

    public void btnInfoClick(View view) {
        startActivity(new Intent(MainActivity.this, UsedTools.class));
    }

    public void btnTechNewsClick(View view) {
        startActivity(new Intent(MainActivity.this, TechNews.class));
    }

    public void btnComplaintClick(View view) {
        startActivity(new Intent(this, ComplaintsActivity.class));
    }


        }
