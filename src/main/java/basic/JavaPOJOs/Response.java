package basic.JavaPOJOs;

public class Response {
    private Person person;
    private Contact contact;
    private Vehicle vehicle;

    public Response(Person person, Contact contact, Vehicle vehicle) {
        this.person = person;
        this.contact = contact;
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
