package com.hala.designpatternsinkotlin.Creational.Singleton

class Singleton {
    companion object {
        var instance: Singleton? = null

        fun getInstanc(): Singleton? {
            if (instance == null) {
                synchronized(Singleton) {
                    instance = Singleton()
                }
            }
            return instance
        }
    }

    fun printObjectId() {

        System.out.println("Unique Id of the object is" + System.identityHashCode(this))
    }


}