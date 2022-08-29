package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //user can tap a button to change the text color of the label
        //1. add button to the layout

        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handle button tap
            // Change the color of the text
            Log.i("Mario", "Tapped on button")
            //1. Get reference to the text view
            //2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(R.color.purple_700)

        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "Looking forward to the class"
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.backgroundView).setBackgroundColor(R.color.white)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}

