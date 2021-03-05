package com.amannirala13.pixslidebar

import android.content.Context
import android.util.AttributeSet
import android.view.ContextMenu
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import com.amannirala13.pixslidebar.`interface`.Runner


class PixSlideBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var sliderMotion: MotionLayout
    private var sliderText: TextView
    private var slider: CardView
    private var sliderProgress: CardView
    private var sliderImg: ImageView

    private var task: Runner?= null

    init{
        inflate(context, R.layout.pixslidebar,this)
        sliderMotion = findViewById(R.id.slider_body)
        sliderText = findViewById(R.id.slider_text)
        slider = findViewById(R.id.slider_slider)
        sliderProgress = findViewById(R.id.progress_background)
        sliderImg = findViewById(R.id.slider_slider_image)

            context.theme.obtainStyledAttributes(attrs, R.styleable.PixSlideBar,
                0, 0).apply {
                try {
                    sliderText.text = getString(R.styleable.PixSlideBar_message)
                    sliderText.setTextColor(getColor(R.styleable.PixSlideBar_message_color,
                        ContextCompat.getColor(context, R.color.text_dark)) )
                    sliderMotion.setBackgroundColor(getColor(R.styleable.PixSlideBar_body_color,
                        ContextCompat.getColor(context, R.color.washedYellow)))
                    sliderProgress.setCardBackgroundColor(getColor(R.styleable.PixSlideBar_progress_color,
                        ContextCompat.getColor(context, R.color.washedYellow)))
                    slider.setCardBackgroundColor(getColor(R.styleable.PixSlideBar_slider_color,
                        ContextCompat.getColor(context, R.color.white)))
                } finally {
                    recycle()
                }
            }

        addTransitionAdapter()
    }

    fun addOnSlideCompleteRunner(r: Runner)
    {task = r}

    fun goToStart(){ sliderMotion.transitionToStart() }
    fun goToEnd(){ sliderMotion.transitionToEnd() }

    fun disableAnimation(){
        sliderMotion.getTransition(R.id.pixSlider_trans).setEnable(false) }

    fun enableAnimation(){
        sliderMotion.enableTransition(R.id.pixSlider_trans, true) }

    private fun addTransitionAdapter() {
        sliderMotion.setTransitionListener(object: MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                //TODO("Not yet implemented")
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                //TODO("Not yet implemented")
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                if(p1 == sliderMotion.endState && task != null)
                        task!!.execute()
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                //TODO("Not yet implemented")
            }
        })
    }


}