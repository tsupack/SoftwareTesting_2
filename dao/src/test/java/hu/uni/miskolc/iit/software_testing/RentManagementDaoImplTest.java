package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.exception.RentNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.Rent;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class RentManagementDaoImplTest {
    private File rentDatabase;
    private RentManagementDaoImpl rentManagementTest=new RentManagementDaoImpl(rentDatabase);
    private Rent rent_Test;
    private Rent rent_Test2;
    public ExpectedException thrown =ExpectedException.none();

    @Before
    public void setUp(){
        this.rent_Test= new Rent(1, 10, 100, new Date(2018, 12, 12), new Date(2018, 12, 17), 5, 200, 30, 10, true);
        this.rent_Test2= new Rent(2, 20, 200, new Date(2018, 12, 12), new Date(2018, 12, 17), 5, 200, 30, 10, true);

    }


    @Test
    public void createRent() {

        assertEquals(rent_Test, rentManagementTest.createRent(rent_Test));
    }

    @Test
    public void getRentById() throws Exception {
        assertEquals(rent_Test, rentManagementTest.getRentById(1));
    }

    @Test
    public void deleteRentException() throws Exception{
        thrown.expect(RentNotFoundException.class);
        rentManagementTest.deleteRent(rent_Test2);
    }

    @Test
    public void exists() {
        assertEquals(false, rentManagementTest.exists(rent_Test2));
    }


}

