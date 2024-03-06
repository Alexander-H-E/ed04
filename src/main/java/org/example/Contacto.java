package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * El tipo de contacto
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * mete un nuevo contacto
     *
     * @param name  el nombre del contacto
     * @param phone el numero telefono
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * devuelve el nombre
     *
     * @return el nombre
     */
    public String getName() {
        return this.name;
    }

    /**
     * devuelve el telefono
     *
     * @return el telefono
     */
    public List<String> getPhones() {
        return this.phones;
    }
}