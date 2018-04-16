package com.hala.designpatternsinkotlin.Structural.decorator.startbucksExample;

/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2018-04-09
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() { return description;
    }
    public abstract double cost(); }