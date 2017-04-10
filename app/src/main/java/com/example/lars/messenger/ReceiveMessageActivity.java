package com.example.lars.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message"; // The name of the extra value passed by the intentf

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE); // Get the intent and get the message from it using getStingsExtra()
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText); // Add the text to the text view
    }
}
