package com.example.lars.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreatMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }


    // Call onSendMessage() when the button is clicked
    public void onSendMessage(View view){

        EditText messageView = (EditText) findViewById(R.id.message); // finds a View with the ID of message
        String messageText = messageView.getText().toString(); // Gets the text from editable text field with an ID of message
        // Intent intent = new Intent(this, ReceiveMessageActivity.class); // Create an intent and tells what activity it's intended for
        // intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText); // Add the text to the intent with the name of message
        Intent intent = new Intent(Intent.ACTION_SEND); // Create an intent that uses a send action (implicit action)
        intent.setType("text/plain"); // Set MIME type
        intent.putExtra(Intent.EXTRA_TEXT, messageText); // Add messageText with the intent
        startActivity(intent); // start the specified activity in the intent

    }
}
