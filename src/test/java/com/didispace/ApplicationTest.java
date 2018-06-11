package com.didispace;


import com.dkx.search.db.TestDao;
import com.dkx.search.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@SpringBootApplication

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class ApplicationTest {

    @Autowired
    private TestDao testDao;

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        Map<String, Object > map = new HashMap<>();
        map.put("userName","张三");
        List<User> users = testDao.selectUserList(map);

        for (User user : users
             ) {
            System.out.print(user.toString());
        }

    }

}
