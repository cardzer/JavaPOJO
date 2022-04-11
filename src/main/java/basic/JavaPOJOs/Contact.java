package basic.JavaPOJOs;

public class Contact {
    private String address;
    private String address2;
    private Integer phoneNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String address, String address2, Integer phoneNumber) {
        this.address = address;
        this.address2 = address2;
        this.phoneNumber = phoneNumber;
    }
}
