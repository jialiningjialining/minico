package com.coolpi.minico

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.coolpi.minico.fragment.MiniFragment
import java.io.Serializable


class MiniActivity : AppCompatActivity() {
    val paramRouter:ParamRouterMap? = null
//    override fun getLayoutId(): Int {
//        return R.layout.activity_minico
//    }
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_minico)
        handleParam(intent.getSerializableExtra("param") as ParamRouterMap)

        val testFragment = MiniFragment()
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        if (!testFragment.isAdded) {
            transaction.add(R.id.activity_mini, testFragment)
            transaction.commit()
        }

    }
    private fun handleParam(param:ParamRouterMap){
        val v = findViewById<FrameLayout>(R.id.activity_mini)
        val height = param.height
        if (height != null && height > 0) {
            v.layoutParams.height = height*2
        }
    }

}
data class ParamRouterMap(
    val urlRouter: String?,
    val title: String?,
    val showNav: Boolean?,
    val height: Int?
) : Serializable