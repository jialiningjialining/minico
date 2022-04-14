package com.coolpi.cpweb.base

import com.coolpi.cpweb.R
import com.getcapacitor.BridgeActivity

open class BaseBridgeActivity: BridgeActivity(), BaseInterface {
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }




}