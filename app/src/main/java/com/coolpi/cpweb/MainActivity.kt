package com.coolpi.cpweb

import android.os.Bundle
import com.coolpi.cpweb.base.BaseBridgeActivity
import com.coolpi.minico.plugin.NativeApiPlugin

//import m NativeApiPlugin

class MainActivity : BaseBridgeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerPlugin(NativeApiPlugin::class.java)

    }
}

