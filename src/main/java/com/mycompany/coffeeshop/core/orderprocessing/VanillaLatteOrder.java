/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.orderprocessing;

import com.mycompany.coffeeshop.core.Barista;
import com.mycompany.coffeeshop.model.MenuItem;

/**
 * @author colin
 */
public class VanillaLatteOrder implements Order {

    private Barista barista;

    /**
     * Constructor
     *
     * @param barista
     */
    public VanillaLatteOrder(Barista barista) {
        this.barista = barista;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void makeBeverage() {
        barista.makeBeverage(MenuItem.VANILLA_LATTE);
    }


}