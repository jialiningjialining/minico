package com.coolpi.cpweb

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import com.coolpi.cpweb.base.BaseActivity
import com.coolpi.minico.ParamRouterMap

class TestActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun initData() {
        super.initData()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
        val intent = Intent("android.intent.action.MAIN")
        val param = ParamRouterMap(
//            urlRouter = pluginCall.getString("router").toString(),
//            title = pluginCall.getString("title").toString(),
//            showNav = pluginCall.getBoolean("showNav") == true
            urlRouter = "/demo",
            title = "hahah",
            showNav = true,
            height = 500
        )
        intent.putExtra("param", param)
        this.startActivity(intent)
    }

}

