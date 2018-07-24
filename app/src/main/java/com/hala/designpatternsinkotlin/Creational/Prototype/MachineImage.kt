package com.hala.designpatternsinkotlin.Creational.Prototype

class MachineImage(os: String, antivirusSw: String) : Cloneable {
    lateinit var image: StringBuilder

    init {
        image = StringBuilder()
        image.append(os).append("+" + antivirusSw)
    }

    constructor(sw: String) : this("", "") {
        image = StringBuilder(sw)
    }

    fun install(software: String) {
        image.append(software)
    }

    fun printSoftware() {
        System.out.println(image)
    }

   public override fun clone(): MachineImage {
        return MachineImage(this.image.toString())
    }
}