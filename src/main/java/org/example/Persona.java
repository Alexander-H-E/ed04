package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * El tipo de contacto
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * mete un nuevo contacto
     *
     * @param name  el nombre del contacto
     * @param phone el numero telefono
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}