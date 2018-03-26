package com.hala.designpatternsinkotlin.Structural.proxy.ImageExample

import com.hala.designpatternsinkotlin.Structural.proxy.ImageExample.Image

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class RealImage(private val fileName: String) : Image {

    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying " + fileName)
    }

    private fun loadFromDisk(fileName: String) {
        println("Loading " + fileName)
    }
}