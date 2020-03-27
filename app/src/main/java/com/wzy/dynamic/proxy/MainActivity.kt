package com.wzy.dynamic.proxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wzy.dynamic.proxy.dproxy.BusinessHandler
import com.wzy.dynamic.proxy.dproxy.Ibusiness
import com.wzy.dynamic.proxy.dproxy.OneBusiness
import java.lang.reflect.Proxy
import java.util.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
