package com.example.user.implicit_intent;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import butterknife.OnClick;

public class MainActivity extends AbstractBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.btnFragment)
    void fragmentSubmit() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DynamicFragment dynamicFragment = new DynamicFragment();
        fragmentTransaction.add(R.id.llImplici, dynamicFragment, "Dynamic");
        fragmentTransaction.commit();
    }


    @OnClick(R.id.btnShow)
    void show() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebookfrenzy.com"));
        startActivity(intent);
    }

    @OnClick(R.id.btnShowMap)
    void showMap() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.076,72.077"));
        Intent chooser = Intent.createChooser(intent, "Launch Map");
        startActivity(chooser);

    }



    @OnClick(R.id.btnSendEmail)
    void sendEmail() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String[] to = {"vartika.1403@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, to);
        intent.putExtra(Intent.EXTRA_SUBJECT, "this is the subject");
        intent.putExtra(Intent.EXTRA_TEXT, "this is the text");
        intent.setType("message/rfc822");
        Intent chooser = Intent.createChooser(intent, "Send Email");
        startActivity(chooser);
    }

    @OnClick(R.id.btnSendImage)
    void downloadImage() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        Uri image = Uri.parse("android.resource://res/drawable/" + R.drawable.desert);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_STREAM, image);
        intent.putExtra(Intent.EXTRA_TEXT, "hey whatshup");
        Intent chooser = Intent.createChooser(intent, "Send Image");
        startActivity(chooser);
    }


    @OnClick(R.id.btnRecyclerView)
    void openRecyclerView() {
        Intent intent = new Intent(this, RecyclerViews.class);
        startActivity(intent);
    }
}





