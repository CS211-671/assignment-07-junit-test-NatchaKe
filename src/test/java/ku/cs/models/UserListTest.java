package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init() {
        userList = new UserList();
        userList.addUser("Rei", "unit00-prototype");
        userList.addUser("Shinji", "unit01");
        userList.addUser("Asuka", "unit02");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User user = userList.findUserByUsername("Rei");
        // TODO: assert that UserList found User
        String expected = "Rei";
        String actual = user.getUsername();
        //assertEquals(expected, actual);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user
        userList.changePassword("Rei", "unit00-prototype", "mark00");
        // TODO: assert that user can change password
        assertTrue(userList.findUserByUsername("Rei").validatePassword("mark00"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User loginUser = userList.login("Rei", "unit00-prototype");
        // TODO: assert that User object is found
        assertEquals(userList.findUserByUsername("Rei"),loginUser);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        //User loginUser = userList.login("Shinji", "unit13");
        // TODO: assert that the method return null
        assertNull(userList.login("Shinji", "unit13"));
    }

}