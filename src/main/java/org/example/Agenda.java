package org.example;

import java.util.*;

/**
 * La clase Agenda
 */
public class Agenda {

    private List<Contacto> contacts; // Lista de Contacto


    public Agenda() {
        this.contacts = new ArrayList<>();
    }


    /**
     * Añade contacto
     *
     * @param name  el nombre
     * @param phone el numero de telefono
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Quitar contacto
     *
     * @param name el nombre
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica numero de telefono
     *
     * @param name     nombre
     * @param oldPhone telefono viejo
     * @param newPhone telefono nuevo
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve el contacto
     *
     * @return contacto
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}