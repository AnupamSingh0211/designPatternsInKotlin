package com.hala.designpatternsinkotlin.Structural.bridge.DrivingCarsExample

/**
 * Created by arpitgupta on 16/04/18.
 *
 */
/* Implementor interface*/
internal interface Roof {
    val mode: String
}

/* Concrete Implementor - 1 */
internal class FixedRoof : Roof {
    override val mode: String
        get() {
            return "fixed roof"
        }
}

/* Concrete Implementor - 2 */
internal class ConvertibleRoof : Roof {
    override val mode: String
        get() {
            return "convertible roof"
        }
}

/* Implementor interface - 2*/
internal interface Color {
    val value: String
}

/* Concrete Implementor - 1 */
internal class RedColor : Color {
    override val value: String
        get() {
            return "red"
        }
}

/* Concrete Implementor - 2 */
internal class BlueColor : Color {
    override val value: String
        get() {
            return "blue"
        }
}

/* Abstraction (abstract class) */
internal abstract class Car(var roof: Roof, var color: Color) {
    internal abstract fun drive()
}

/* RefinedAbstraction - 1*/
internal class Maruti800(roof: Roof, color: Color)
    : Car(roof, color) {
    public override fun drive() {
        println("Driving ${color.value} Maruti800 with ${roof.mode}")
    }
}

/* RefinedAbstraction - 2 */
internal class Lamborghini(roof: Roof, color: Color)
    : Car(roof, color) {
    public override fun drive() {
        println("Driving ${color.value} Lamborghini with ${roof.mode}")
    }
}

/* Client program */
fun runDrivingCarsExample() {
    var roof: Roof
    var color: Color
    var vehicle: Car

    roof = FixedRoof()
    color = RedColor()
    vehicle = Maruti800(roof, color)
    vehicle.drive()

    roof = ConvertibleRoof()
    color = BlueColor()
    vehicle = Lamborghini(roof, color)
    vehicle.drive()
}
