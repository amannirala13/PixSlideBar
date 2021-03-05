package com.amannirala13.pixslidebar_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.amannirala13.pixslidebar.PixSlideBar
import com.amannirala13.pixslidebar.`interface`.Runner
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

    //Defining data types
    private lateinit var slideBar: PixSlideBar
    private lateinit var gotoStartBtn: Button
    private lateinit var gotoEndBtn: Button
    private lateinit var animationSwitch: SwitchMaterial

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        slideBar = findViewById(R.id.my_slide_bar)
        gotoStartBtn = findViewById(R.id.go_to_start_btn)
        gotoEndBtn = findViewById(R.id.go_to_end_btn)
        animationSwitch = findViewById(R.id.animation_switch)

        //Adding OnSlideCompleteRunner. This will run the code once the slider reaches the end.
        slideBar.addOnSlideCompleteRunner(object:Runner{
            override fun execute() {
               Toast.makeText(this@MainActivity, "Slide Complete", Toast.LENGTH_SHORT).show()
            }
        })

        //Takes the slider to the Start
        gotoStartBtn.setOnClickListener {
            slideBar.goToStart() }

        //Takes the slider to the end
        gotoEndBtn.setOnClickListener {
            slideBar.goToEnd()}

        //Enables and Disables the slider
        animationSwitch.setOnCheckedChangeListener{_,isEnabled ->
            if(isEnabled)
                slideBar.enableAnimation()
            else
                slideBar.disableAnimation()
        }

    }
}