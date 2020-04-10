/*
 * Copyright (C) 2020 Nicolas Siandro
 *
 * This source code is licensed under the GNU GPL v3 license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.nicolassiandro.springbootreststarter.model;

public class Greeting {

    private final long id;
    private final String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
