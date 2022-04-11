package catsAndOwners;

import com.google.gson.Gson;
import catsAndOwners.models.Cat;
import catsAndOwners.models.Owner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // gson is a library that is used to convert objects into "readable" strings.
        Gson gson = new Gson();

        // here we are creating an owner object using the generateOwner method.
        // this is using the constructor to populate the object with various values.
        Owner owner = new Owner().generateOwner();

        // here we care creating a list of cat objects.
        // we are then steaming the list which will give us additional methods that
        // can be used to alter the list. In this case we are sorting the list by
        // comparing the cats age and ordering them in descending order and then
        // is collecting the results for that and putting them back into a list
        // of cat.
        List<Cat> list = new Cat().generateCats().stream()
                .sorted(Comparator.comparingInt(Cat::getAge)
                        .reversed())
                .collect(Collectors.toList());

        // this for each is going to log out every cat's name.
        list.forEach(x -> System.out.println("Cat: " + x.getName() + " has been sorted."));

        // this stream is s going to filter out all of the cats that haven't been
        // microchipped and then for every one that has they will be logged out.
        list.stream().filter(Cat::isMicrochip).forEach(x -> System.out.println(x.getName() + " has been microchipped"));

        // this is assigning the list of cats to the owner.
        owner.setCat(list);

        // this is going to log out the list of cats using the gson library.
        System.out.println(gson.toJson(list));

        // these methods are referencing the generateOwner method through the means of polymorphism.
        // What this basically means is in this case the method name can be the same but the amount of
        // parameters in this must be different.
        Owner ownerTwo = new Owner().generateOwner("Mauris");
        Owner ownerThree = new Owner().generateOwner("Mauris", "Feugiat scelerisque");

        // this is going to add all of the owners to the list that have all been generated
        // using a different polymorphic method.
        List<Owner> ownerList = new ArrayList<>();
        ownerList.add(owner);
        ownerList.add(ownerTwo);
        ownerList.add(ownerThree);

        System.out.println("Owner list using polymorphism: " + gson.toJson( ownerList));
    }
}