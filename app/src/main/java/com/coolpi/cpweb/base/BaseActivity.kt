package com.coolpi.cpweb.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), BaseInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }
//    abstract fun getLayoutId(): Int
//    protected open fun initListener(){ }
//    protected open fun initData(){ }

}
interface BaseInterface {
    abstract fun getLayoutId(): Int
    open fun initListener(){ }
    open fun initData(){ }
}
