package com.hala.designpatternsinkotlin.Behavioral.Iterator.RepositoryExample

import com.hala.designpatternsinkotlin.Behavioral.Iterator.RepositoryExample.Container
import com.hala.designpatternsinkotlin.Behavioral.Iterator.RepositoryExample.Iterator

class NameRepository : Container {
    var names = arrayOf("Robert", "John", "Julie", "Lora")

    override val iterator: Iterator
        get() = NameIterator()

    private inner class NameIterator : Iterator {

        internal var index: Int = 0

        override fun hasNext(): Boolean {

            return if (index < names.size) {
                true
            } else false
        }

        override fun next(): Any {

            return if (this.hasNext()) {
                names[index++]
            } else {

            }
        }
    }
}