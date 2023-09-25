package com.easy.circleimageviewlib

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.easy.lib_circle_ui.CircleImageView


class MainActivity : AppCompatActivity() {

    private var mCircleImageView: CircleImageView? = null

    private var mBtnStart: Button? = null
    private var mBtnPause: Button? = null
    private var mBtnGoOn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        setupClickListener()
    }

    private fun initView() {
        mCircleImageView = findViewById<CircleImageView?>(R.id.circle)?.also {
            it.setImageResource(R.drawable.cat)
        }

        mBtnStart = findViewById(R.id.btn_start)

        mBtnPause = findViewById(R.id.btn_pause)

        mBtnGoOn = findViewById(R.id.btn_go_on)
    }

    private fun setupClickListener() {
        mBtnStart?.setOnClickListener {
            mCircleImageView?.startRotationAnimation(0f)
        }
        mBtnPause?.setOnClickListener {
            mCircleImageView?.pauseRotationAnimation()
        }
        mBtnGoOn?.setOnClickListener {
            mCircleImageView?.resumeRotationAnimation()
        }
    }

}