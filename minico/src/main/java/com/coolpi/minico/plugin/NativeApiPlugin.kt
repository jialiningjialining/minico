package com.coolpi.minico.plugin

import android.content.Intent
import com.coolpi.minico.ParamRouterMap
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "NativeApi")
class NativeApiPlugin:Plugin() {
    @PluginMethod
    fun echo(pluginCall: PluginCall){
        val value: String? = pluginCall.getString("value")
        val ret = JSObject();
        ret.put("value", value)
        pluginCall.resolve(ret)
    }

    @PluginMethod
    fun navigateTo(pluginCall: PluginCall) {
        println("navigateTo")
        val intent = Intent("android.intent.action.MINICO")

        val param = ParamRouterMap(
            urlRouter = pluginCall.getString("url", ""),
            title = pluginCall.getString("title","可人"),
            showNav = pluginCall.getBoolean("showNav") == true,
            height = pluginCall.getInt("height", 0)
        )
        intent.putExtra("param", param)
        if (this.activity != null){
            activity.startActivity(intent)
        }else{
            bridge.fragment.startActivity(intent)
        }

    }

    @PluginMethod
    fun navigateBack(pluginCall: PluginCall) {
        println("navigateBack")
    }
    @PluginMethod
    fun closeWebview(pluginCall: PluginCall) {
        println("closeWebview")
        if (this.activity != null){
            activity.finish()
        }else{
            bridge.fragment.activity?.finish()
        }

    }


}