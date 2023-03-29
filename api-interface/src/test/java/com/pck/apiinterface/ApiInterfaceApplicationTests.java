package com.pck.apiinterface;

import com.pck.apiclient.client.PckClient;
import com.pck.apiclient.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private PckClient pckClient;

    @Test
    void contextLoads() {

        String result = pckClient.getNameByGet("szzx");
        User user = new User();
        user.setUsername("szzx2");
        String usernameByPost = pckClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
