package catsAndOwners.models;

import java.util.List;

public class Owner {
    private String name;
    private String address_one;
    private String address_two;
    private String postcode;
    // here you can see the cat object is
    // being encapsulated inside the owner object
    private List<Cat> cat;

    public Owner() {
    // null constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_one() {
        return address_one;
    }

    public void setAddress_one(String address_one) {
        this.address_one = address_one;
    }

    public String getAddress_two() {
        return address_two;
    }

    public void setAddress_two(String address_two) {
        this.address_two = address_two;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public List<Cat> getCat() {
        return cat;
    }

    public void setCat(List<Cat> cat) {
        this.cat = cat;
    }

    public Owner(String name, String address_one, String address_two, String postcode, List<Cat> cat) {
        this.name = name;
        this.address_one = address_one;
        this.address_two = address_two;
        this.postcode = postcode;
        this.cat = cat;
    }

    // This group of methods are used to generate Owner objects.
    public Owner generateOwner() {
        return new Owner("Dan", "dolor sit amet", "incididunt ut labore", "Purus semper eget", null);
    }

    public Owner generateOwner(String name) {
        return new Owner(name, "dolor sit amet", "incididunt ut labore", "Purus semper eget", null);
    }

    public Owner generateOwner(String name, String address_one) {
        return new Owner("Dan", "dolor sit amet", "incididunt ut labore", "Purus semper eget", null);
    }
}


