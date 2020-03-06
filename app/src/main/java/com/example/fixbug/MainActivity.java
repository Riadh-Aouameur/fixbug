package com.example.fixbug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int index = 0;
String st[][] ={{"Q1","R1","false","R2","true","R3","false","R4","false"},
        {"Q2","R1","false","R2","true","R3","false","R4","false"},
        {"Q3","R1","false","R2","false","R3","true","R4","false"},
        {"Q4","R1","false","R2","false","R3","false","R4","true"},
        {"Q5","R1","true","R2","false","R3","false","R4","false"},
        {"Q6","R1","false","R2","false","R3","false","R4","false"},
};
    ButtonTest bt1;
    ButtonTest bt2;
    ButtonTest bt3;
    ButtonTest bt4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bt1 = new ButtonTest((Button) findViewById(R.id.bt1), st[index][2]);
       bt1.getButton().setText(st[index][1]);
        bt2 = new ButtonTest((Button) findViewById(R.id.bt2), st[index][4]);
       bt2.getButton().setText(st[index][3]);
        bt3 = new ButtonTest((Button) findViewById(R.id.bt3), st[index][6]);
       bt3.getButton().setText(st[index][5]);
         bt4 = new ButtonTest((Button) findViewById(R.id.bt4), st[index][8]);
       bt4 .getButton().setText(st[index][7]);

  textView = findViewById(R.id.textView);
        textView.setText(st[index][0]);







    }


    public void OnClickBt1(View view) {
        if(bt1.st.equals("true")){

            index++;


            bt1.getButton().setText(st[index][1]);
            bt1.setSt( st[index][2]);

            bt2.getButton().setText(st[index][3]);
            bt2.setSt(st[index][4]);

            bt3.getButton().setText(st[index][5]);
            bt3.setSt(st[index][6]);
            bt4 .getButton().setText(st[index][7]);
            bt4.setSt(st[index][8]);




            textView.setText(st[index][0]);


        }else{
            Toast.makeText(getApplicationContext(),bt1.st, Toast.LENGTH_SHORT).show();

        }
    }

    public void OnClickBt4(View view) {
        if(bt4.st.equals("true")){

            index++;

            bt1.getButton().setText(st[index][1]);
            bt1.setSt( st[index][2]);

            bt2.getButton().setText(st[index][3]);
            bt2.setSt(st[index][4]);

            bt3.getButton().setText(st[index][5]);
            bt3.setSt(st[index][6]);
            bt4 .getButton().setText(st[index][7]);
            bt4.setSt(st[index][8]);


            textView.setText(st[index][0]);

        }else{
            Toast.makeText(getApplicationContext(),bt4.st, Toast.LENGTH_SHORT).show();
        }

    }

    public void OnClickBt3(View view) {
        if(bt3.st.equals("true")){

            index++;


            bt1.getButton().setText(st[index][1]);
            bt1.setSt( st[index][2]);

            bt2.getButton().setText(st[index][3]);
            bt2.setSt(st[index][4]);

            bt3.getButton().setText(st[index][5]);
            bt3.setSt(st[index][6]);
            bt4 .getButton().setText(st[index][7]);
            bt4.setSt(st[index][8]);




            textView.setText(st[index][0]);

    }else{
            Toast.makeText(getApplicationContext(),bt3.st, Toast.LENGTH_SHORT).show();
    }
    }

    public void OnClickBt2(View view) {

        if(bt2.st.equals("true")){


            index++;


            bt1.getButton().setText(st[index][1]);
            bt1.setSt(st[index][2]);
            bt2.getButton().setText(st[index][3]);
            bt2.setSt(st[index][4]);
            bt3.getButton().setText(st[index][5]);
            bt3.setSt(st[index][6]);

            bt4 .getButton().setText(st[index][7]);
            bt4.setSt(st[index][8]);



            textView.setText(st[index][0]);

        }else{
           Toast.makeText(getApplicationContext(),bt2.st, Toast.LENGTH_SHORT).show();
        }
    }
}
