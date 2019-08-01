import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void statementKids() {
    Customer customer=new Customer("little kid");
    Movie movie=new Movie("Dumbo",2);
    customer.addRental(new Rental(movie,5));
    String actual=customer.statement();
    String expected="Rental Record for little kid\n" +
            "\tDumbo\t4.5\n" +
            "Amount owed is 4.5\n" +
            "You earned 1 frequent renter points";
    assertEquals(actual,expected);

    }

    @Test
    void statementRegular() {
        Customer customer=new Customer("uncle pancho");
        Movie movie=new Movie("Rambo First Blood",0);
        customer.addRental(new Rental(movie,7));
        String actual=customer.statement();
        String expected="Rental Record for uncle pancho\n" +
                "\tRambo First Blood\t9.5\n" +
                "Amount owed is 9.5\n" +
                "You earned 1 frequent renter points test commit";
        assertEquals(actual,expected);

    }

    @Test
    void statementNewRelease() {
        Customer customer=new Customer("new bossy");
        Movie movie=new Movie("Anabelle",1);
        customer.addRental(new Rental(movie,5));
        String actual=customer.statement();
        String expected="Rental Record for new bossy\n" +
                "\tAnabelle\t15.0\n" +
                "Amount owed is 15.0\n" +
                "You earned 2 frequent renter points";
        assertEquals(actual,expected);

    }


}