package hu.uni.miskolc.iit.software_testing;

import hu.uni.miskolc.iit.software_testing.exception.UserNotFoundException;
import hu.uni.miskolc.iit.software_testing.model.User;
import hu.uni.miskolc.iit.software_testing.model.UserType;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;

import static org.junit.Assert.*;

public class UserManagementDaoImplTest {

    private User User_Test;
    private User User_Test2;
    private File UserDatabase;
    private UserManagementDaoImpl userManagementTest= new UserManagementDaoImpl(UserDatabase);
    public ExpectedException thrown =ExpectedException.none();

    @Before
    public void setUp(){
        this.User_Test =new User(1, "Peter", "user address", 12345678, 30, "849TS6598AD", UserType.USER);
        this.User_Test2 =new User(2, "Anna", "user address", 87654321, 30, "849TS6654AD", UserType.USER);

    }


    @Test
    public void addUser() {
        assertEquals(User_Test, userManagementTest.addUser(User_Test));
    }

    @Test
    public void getUserById() throws Exception{
        assertEquals(User_Test, userManagementTest.getUserById(1));
    }

    @Test
    public void deleteUser() throws Exception {
        thrown.expect(UserNotFoundException.class);
        userManagementTest.deleteUser(User_Test2);
    }


    @Test
    public void exists() {
        assertEquals(false, userManagementTest.exists(User_Test2));
    }


}