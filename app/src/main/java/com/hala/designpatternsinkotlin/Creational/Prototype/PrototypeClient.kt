package com.hala.designpatternsinkotlin.Creational.Prototype

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.R

class PrototypeClient : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prototype)
        runPrototypeDemo()
    }

    fun runPrototypeDemo(){

        val linuxVm : MachineImage = MachineImage("Linux","Symantex")
        val windowsVm : MachineImage = MachineImage("Windows","MacAfee")

        //clone Linux Vm, and install web server
        val webserver: MachineImage = linuxVm.clone()
        webserver.install("+ webserver SW")

        //clone Webserver, and install app server
        val appServer: MachineImage = webserver.clone()
        appServer.install("+ app server SW")

        //windows test clone
        val testMachine : MachineImage = windowsVm.clone()

        System.out.println("Web server config"+ webserver.printSoftware())
        System.out.println("App server config"+ appServer.printSoftware())
        System.out.println("Test Machine config"+ testMachine.printSoftware())
    }
}