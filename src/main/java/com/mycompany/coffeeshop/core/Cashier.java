/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.core.orderprocessing.LatteOrder;
import com.mycompany.coffeeshop.core.orderprocessing.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * The cashier i.e. the person taking payment from the customer (You)
 *
 * @author colin
 */
public class Cashier {

    private List<Order> orders = new ArrayList<>();

    private Barista barista;

    /**
     * Constructor
     *
     * @param barista the barista who makes the beverages
     */
    public Cashier(Barista barista) {
        this.barista = barista;
    }


    /**
     * Takes orders from the Customers
     *
     * @param beverageChoice the choice of beverages
     */
    void takeOrders(String beverageChoice) {
        if (beverageChoice.equals("Latte"))
            orders.add(new LatteOrder(barista));
    }


    /**
     * Sends the customer orders to the Barista
     */
    public void sendOrdersToBarista() {
        for(Order order : orders) {
            order.makeBeverage();
        }
    }


}
