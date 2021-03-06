/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The menu
 *
 * Singleton design pattern
 *
 * @author colin
 */
public final class Menu {

    private static volatile Menu instance;

    private final Map<Integer, MenuItem> menuOptions = new HashMap<>();


    private Menu(){
        init();
    }


    /**
     * Populates the menu with items
     */
    private void init() {
        int j;
        for (int i = 0; i < MenuItem.values().length ; i++) {
            j = i + 1;
            menuOptions.put(j, MenuItem.values()[i]);
        }
    }

    /**
     * Returns the one and only ONE instance of this class
     *
     * @return instance
     */
    public static Menu getInstance() {
        if (instance == null) {
            synchronized (Menu.class) {
                if (instance == null) {
                    instance = new Menu();
                }
            }
        }
        return instance;
    }


    public Map<Integer, MenuItem> getMenu() {
        return menuOptions;
    }

}
