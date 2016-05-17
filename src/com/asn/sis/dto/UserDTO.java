/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asn.sis.dto;

/**
 *
 * @author Dell
 */
public class UserDTO {
    private int id;
    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String perAddress;
    private String tempAddress;
    private String contact;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerAddress() {
        return perAddress;
    }

    public void setPerAddress(String perAddress) {
        this.perAddress = perAddress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
