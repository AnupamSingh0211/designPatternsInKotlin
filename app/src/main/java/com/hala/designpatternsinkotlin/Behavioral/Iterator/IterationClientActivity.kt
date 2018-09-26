package com.hala.designpatternsinkotlin.Behavioral.Iterator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Iterator.RepositoryExample.NameRepository
import com.hala.designpatternsinkotlin.R

class IterationClientActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iterator)
        runRepositoryDemo()
    }

    fun runRepositoryDemo()
    {

        val namesRepository = NameRepository()
        val iter = namesRepository.iterator
        while (iter.hasNext()) {
            val name = iter.next() as String
            println("Name : $name")
        }
    }
}