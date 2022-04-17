package com.example.scalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,
    btndivide,btnmul,btnequal,btndot,btnper,btndel,btnreset;
    TextView ques,res;
    ImageView micimage;
    SpeechRecognizer speechRecognizer;
    private static final int SPEECH_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button13);
        btn2=findViewById(R.id.button14);
        btn3=findViewById(R.id.button15);
        btn4=findViewById(R.id.button9);
        btn5=findViewById(R.id.button10);
        btn6=findViewById(R.id.button11);
        btn7=findViewById(R.id.button5);
        btn8=findViewById(R.id.button6);
        btn9=findViewById(R.id.button7);
        btn0=findViewById(R.id.button17);
        btnplus=findViewById(R.id.button16);
        btnminus=findViewById(R.id.button12);
        btndivide=findViewById(R.id.button4);
        btnmul=findViewById(R.id.button8);
        btnequal=findViewById(R.id.button20);
        btndot=findViewById(R.id.button19);
        btnper=findViewById(R.id.button3);
        btndel=findViewById(R.id.button2);
        btnreset=findViewById(R.id.button);
        micimage=findViewById(R.id.micbtn);
        ques=findViewById(R.id.textView2);
        res=findViewById(R.id.textView);

      //  speechRecognizer=SpeechRecognizer.createSpeechRecognizer(MainActivity.this);




        if(ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECORD_AUDIO},1);
        }





        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"1");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"0");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"2");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"3");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"4");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"5");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"6");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"7");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"8");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"9");
                String ans=calculate(ques.getText().toString());
                res.setText(ans);
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();

                if(data.length()==0)
                {

                }
                else {
                    ques.setText(data + "+");
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                ques.setText(data+"-");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                if(data.length()==0)
                {

                }
                else {
                    ques.setText(data + "x");
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                if(data.length()==0)
                {

                }
                else {
                    ques.setText(data + "÷");
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                if(data.length()==0)
                {

                }
                else {
                    ques.setText(data + ".");
                }
            }
        });
        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=ques.getText().toString();
                if(data.length()==0)
                {

                }
                else {
                    ques.setText(data + "%");
                }
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data=ques.getText().toString();
                if(data.length()!=0) {
                    String newdata = data.substring(0, data.length() - 1);
                    ques.setText(newdata);
                    res.setText("");
                }
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ques.setText("");
                res.setText("");

            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans=calculate(ques.getText().toString());
                res.setText("");
                ques.setText(ans);


            }
        });
        micimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    getdata();



            }


        });






    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==1)
        {
            if(grantResults[0]!=PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this, "Permission will be Required", Toast.LENGTH_SHORT).show();
            }
        }
    }
   void getdata()
   {


// Create an intent that can start the Speech Recognizer activity

       Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
       intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
               RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
// This starts the activity and populates the intent with the speech text.
       startActivityForResult(intent, SPEECH_REQUEST_CODE);
   }

// This callback is invoked when the Speech Recognizer returns.
// This is where you process the intent and extract the speech text from the intent.
       @Override
       protected void onActivityResult(int requestCode, int resultCode,
       Intent data) {
       if (requestCode == SPEECH_REQUEST_CODE && resultCode == RESULT_OK) {
           List<String> results = data.getStringArrayListExtra(
                   RecognizerIntent.EXTRA_RESULTS);
           String spokenText="";
           String Nos="";

           for(String i:results)
           {
               Nos=Nos+getnumbers(i);
           }
           ques.setText(Nos);
           String ans=calculate(Nos);
           res.setText(ans);
           // Do something with spokenText.
       }
       super.onActivityResult(requestCode, resultCode, data);
   }

    private String getnumbers(String i) {
        switch(i)
        {
            case "zero":
                return "0";

            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            case "plus":
            case "add":
                return "+";
            case "minus":
            case "subtract":
                return "-";
            case "times":
            case "into":
            case "multiply":
                return "*";
            case "divided by":
            case "divide":
            case "by":
                return "/";
            case "power":
            case "raised to":
            case "to the power":
                return "^";

        }
        return "";
    }


    private String calculate(String toString) {
        toString=toString.replaceAll("x","*");
        toString=toString.replaceAll("%","/100");
        toString=toString.replaceAll("÷","/");

        Context rhino=Context.enter();
        rhino.setOptimizationLevel(-1);

        String FinalRes="";

        Scriptable scriptable=rhino.initSafeStandardObjects();
        FinalRes=rhino.evaluateString(scriptable,toString,"Javascript",1,null).toString();
        return FinalRes;

    }
}