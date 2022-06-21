package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Comment;

public class MainActivity extends AppCompatActivity {

    private ImageView button;
    ImageView share,rateMe;

    TextView gain,loose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView gain=findViewById(R.id.gain);
        TextView loose=findViewById(R.id.loose);
        ImageView share=findViewById(R.id.share);
        ImageView rateMe=findViewById(R.id.rateMe);

        rateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAm = getApplicationContext().getPackageName();
                String strAppLink ="";
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + appPackageNAm)));
                } catch (android.content.ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageNAm)));
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_SEND);
                final  String appPackageNAme = getApplicationContext().getPackageName();
                String strAppLink ="";

                try
                {
                    strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
                }
                a.setType("text/link");
                String sharebody = "This app is basically on different collections of plans of meals according to your need and requirements as per your body to maintain your health and fitness accordingly\n" +
                        "This application contains:-"+"\n"+
                        "- Diet Charts\n" +
                        "- Tips to Gain and Loose weight\n" +
                        "- Exercises\n" +
                        "- Foods\n" +
                        "- Healthy Habits\n" +
                        "  & Much more....\n" +
                        "Please Comment and Rate Us.\n\n"+strAppLink;
                String sharesub = "APP NAME ";
                a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                a.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(a,"Share Using"));
            }

        });


        button = (ImageView)findViewById(R.id.buttonShowCustomDialog);

        // add button listener
        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom);

                // set the custom dialog components - text, image and button
                TextView title_law = (TextView) dialog.findViewById(R.id.title_law);
                title_law.setText("'Gain & Loose' Weight");
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("This app is basically on different collections of plans of meals according to your need and requirements as per your body to maintain your health and fitness accordingly" +
                        "This application contains:-" +
                        "Diet Charts" +
                        "Tips to Gain and Loose weight" +
                        "Exercises" +
                        "Foods" +
                        "Healthy Habits" +
                        "& Much more....");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.mipmap.app_logo);

                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            }
        });


        gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), gain.class);
                startActivity(intent);
            }
        });

        loose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), loose.class);
                startActivity(intent);

            }
        });

    }


}
