package Service;

import Model.User;
import Service.UserService;
import Service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    UserService userService;
    String firstName="Prachi";
    String lastName="Roshan";
    String email="abc@gmail.com";
    String password="12345678";
    String repeatPassword="12345678";
    @BeforeEach
    void beforeEachTestMethod(){
        //Arrange
         userService= new UserServiceImpl();     //command option v

    }


    @Test
    void testCreateUserWhenUserDetailsProvidedReturnUserDetails(){

        //Act
        User user=userService.createUser(firstName,lastName,email,password,repeatPassword);


        //Assert
        assertNotNull(user);
    }


    @Test
    void testCreateUserWhenUserCreatedReturnedUserObjectContainsSameFirstNameLastNameEmail(){


        //Act
        User user=userService.createUser(firstName,lastName,email,password,repeatPassword);

        //assert
        assertEquals(firstName,user.getFirstName());
        assertEquals(lastName,user.getLastName());
        assertEquals(email,user.getEmail());
        assertNotNull(user.getId());

    }
}
