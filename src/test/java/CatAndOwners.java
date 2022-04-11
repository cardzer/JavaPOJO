import catsAndOwners.models.Cat;
import catsAndOwners.models.Owner;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

// this is the test class
public class CatAndOwners {
    // this is a test using the JUnit framework. this is going to
    // validate that the result of generateOwner is equal to Dan.
    @Test
    public void testOwners() {
        Owner owner = new Owner().generateOwner();
        assertEquals("Dan", owner.getName());
    }

    // This is going to validate that the name of the cat that has
    // been microchipped's name is Rex.
    @Test
    public void testCats() {
        List<Cat> cats = new Cat().generateCats();
        assertEquals("Rex", cats.stream().filter(Cat::isMicrochip).collect(Collectors.toList()).get(0).getName());
    }
}
