package com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample;

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}