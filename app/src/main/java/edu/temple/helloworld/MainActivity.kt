package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

       //find the EditText where the user enters their name
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        //error message to be displayed
        val errorMessage = "No name inputted"

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            //this checks if the EditText is empty
            if (nameEditText.text.toString().trim().isEmpty()) {

                //displays an error message if no name was inputted
                displayTextView.text = errorMessage
            } else {
                //displays the inputted name if it is not empty
                displayTextView.text = "Hello, ${nameEditText.text}"
            }
        }
    }
}