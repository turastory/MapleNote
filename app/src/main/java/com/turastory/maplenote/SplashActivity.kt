package com.turastory.maplenote

import android.os.Bundle
import android.view.View.*
import android.view.WindowManager
import com.turastory.androidtoolbox.base.app.BaseBindingActivity
import com.turastory.maplenote.databinding.LayoutSplashBinding

class SplashActivity : BaseBindingActivity<LayoutSplashBinding>() {

    override fun provideBinding(savedInstanceState: Bundle?): LayoutSplashBinding =
        LayoutSplashBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
                .or(SYSTEM_UI_FLAG_HIDE_NAVIGATION)
                .or(SYSTEM_UI_FLAG_LAYOUT_STABLE)
                .or(SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)
                .or(SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
            statusBarColor = getColor(R.color.color_maple_blue)
        }
        super.onCreate(savedInstanceState)
        binding.versionString = BuildConfig.VERSION_NAME
    }
}