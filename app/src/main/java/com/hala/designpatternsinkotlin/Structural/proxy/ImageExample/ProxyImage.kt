package com.hala.designpatternsinkotlin.Structural.proxy.ImageExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-03-26
 */
class ProxyImage(private val fileName: String) : Image {

    private var realImage: RealImage? = null

    override fun display() {
        if (realImage == null) {
            realImage = RealImage(fileName)
        }
        realImage!!.display()
    }
}