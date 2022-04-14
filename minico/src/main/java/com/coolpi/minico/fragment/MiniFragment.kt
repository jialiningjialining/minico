package com.coolpi.minico.fragment

import android.os.Bundle
import com.coolpi.minico.plugin.NativeApiPlugin
import com.getcapacitor.BridgeFragment
import com.getcapacitor.CapConfig
import com.getcapacitor.Plugin


class MiniFragment: BridgeFragment() {

    override fun load(savedInstanceState: Bundle?) {
        super.load(savedInstanceState)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPlugin(NativeApiPlugin::class.java)
        val builder = CapConfig.Builder(context)
//        builder.setStartPath("/demo")
        val config = builder.create()
        setConfig(config)
    }

    override fun addPlugin(plugin: Class<out Plugin>?) {
        super.addPlugin(plugin)

    }


}