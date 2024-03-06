package org.example;

import java.util.*;

/**
 * La clase Agenda
 */
public class agendaContactos implements IContactos {

    private List<Persona> contacts; // Lista de Contacto


    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }


    /**
     * Añadir contacto
     *
     * @param name  nombre
     * @param phone telefono
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }
    /**
     * Elimina contacto
     *
     * @param name nombre
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

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
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
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
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}