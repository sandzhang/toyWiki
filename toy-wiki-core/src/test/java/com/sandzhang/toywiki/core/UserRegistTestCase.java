package com.sandzhang.toywiki.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.sandzhang.toywiki.core.entity.User;
import com.sandzhang.toywiki.core.service.UserService;

@ContextConfiguration("/spring/*.xml")
public class UserRegistTestCase extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Before
    public void initialize() {
    }

    @Test
    public void testRegist() {
        User userInsert = new User();
        userInsert.setName("nn");
        userInsert.setEmail("ee");
        userInsert.setPassword("pp");
        userService.regist(userInsert);
        User userFind = userService.findUserById(userInsert.getId());
        assertEquals("nn", userFind.getName());
        assertEquals("ee", userFind.getEmail());
        assertEquals("pp", userFind.getPassword());
        assertEqualsUser(userInsert, userFind);
    }

    private void assertEqualsUser(User usera, User userb) {
        assertEquals(usera.getName(), userb.getName());
        assertEquals(usera.getEmail(), userb.getEmail());
        assertEquals(usera.getPassword(), userb.getPassword());
    }

}
