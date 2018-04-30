package com.hala.designpatternsinkotlin.Structural.composite.boxesExample

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-30
 */

class Box(id: Int) : Item {

    val boxId = id
    var items: ArrayList<Item> = ArrayList()

    override fun print(level: Int) {

        for (i in 0..level) {
            print("  ")
            println("Box" + boxId)
            for (item in items) {
                item.print(level)
            }
        }
    }

    fun addItem(item: Item) {
        items.add(item)

    }

    fun remove(item: Item) {
        items.remove(item)
    }
}