package com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample;

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
public class Milk extends AddonsDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "Milk";
    }

    public double cost() {
        return .25 + beverage.cost();
    }
}