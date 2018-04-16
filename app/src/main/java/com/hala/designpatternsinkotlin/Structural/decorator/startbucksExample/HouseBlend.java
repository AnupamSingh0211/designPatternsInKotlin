package com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample;

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
