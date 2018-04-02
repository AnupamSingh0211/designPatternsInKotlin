package com.hala.designpatternsinkotlin.Structural.proxy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R
import com.hala.designpatternsinkotlin.Structural.proxy.ImageExample.ProxyPatternDemo
import com.hala.designpatternsinkotlin.Structural.proxy.sudoUserExample.SudoAdminProxyPatternTest

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class ProxyPatternMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
       // showImagesDemo()
        showSudoAdminDemo()
    }

    private fun showSudoAdminDemo() {
        val sudoAdminProxy = SudoAdminProxyPatternTest()
        sudoAdminProxy.main()
    }

    private fun showImagesDemo() {
        val proxyPatternDemo = ProxyPatternDemo()
        proxyPatternDemo.main()

    }

}