/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * A Ristretto
 *
 * @author colin
 */
public class Ristretto extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.35;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Ristretto";
    }
}
