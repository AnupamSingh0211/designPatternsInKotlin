package com.hala.designpatternsinkotlin.Behavioral.Command

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hala.designpatternsinkotlin.Behavioral.Command.RestaurantExample.*
import com.hala.designpatternsinkotlin.R

class CommandClientActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command)
        runRestaurantDemo();
    }

    fun runRestaurantDemo(){

        val waiter = Waiter();
        val item1 = MainDish("Pizza")
        val command1 = OrderMainDish(item1)
        waiter.execute(command1)

        val item2 = MainDish("Burger")
        val command2 = OrderMainDish(item2)
        waiter.execute(command2)

        var command3 = CancelMainDish(item2)
        waiter.execute(command3)

        val item3 = Dessert("IceCream")
        val command4 = OrderDessert(item3)
        waiter.execute(command4)
    }
}