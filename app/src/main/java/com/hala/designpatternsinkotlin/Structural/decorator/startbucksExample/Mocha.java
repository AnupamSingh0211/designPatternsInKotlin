package com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample;

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
public class Mocha extends AddonsDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}