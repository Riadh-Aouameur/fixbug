package com.example.fixbug;

import android.widget.Button;

public class ButtonTest {
    Button button ;
    String st;
    ButtonTest(Button button, String st){
       this.button= button ;
        this.st = st;

    }
    ButtonTest(ButtonTest buttontest){
          this.button = buttontest.getButton();
          this.st= buttontest.getSt();
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public Button getButton() {
        return button;
    }

    public String getSt() {
        return st;
    }


}
