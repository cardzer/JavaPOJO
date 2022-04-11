package basic.JavaPOJOs;

import com.google.gson.Gson;

public class Application {
    public static void main(String[] args) {
        // gson is a library used to convert objects into something more readable
        Gson gson = new Gson();

        // this is going to encapsulate Person, Contact, Vehicle inside a Response object
        Person person = new Person("Male", "Dan","Searle");
        Contact contact = new Contact("adsfasdf", "asdff", 123123123);
        Vehicle vehicle = new Vehicle("Audi", "Black", "A4");
        Response response = new Response(person, contact, vehicle);

        // This is going to log out the fully constructed object
        System.out.println(gson.toJson(response));
    }
}
