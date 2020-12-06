package com.company.objects;

public class Clients {
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String tel;
    private String email;

   /* public Clients(int id, String firstname, String lastname, String address, String tel){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.tel=tel;
    }*/

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "[" +
                "ID: " + id +
                " ; First name: " + firstname +
                " ; Last name: " + lastname +
                " ; Address: " + address +
                " ; Telephone number: " + tel +
                " ; Email: " + email +
                "]";
    }
}
