package com.lnsoft.controller;

import com.lnsoft.po.UserInfo;
import com.lnsoft.resp.ReturnResult;
import com.lnsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created By Chr on 2019/1/14/0014.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserInfo> findAll() {

        return userService.findAllUser();
    }

    @RequestMapping("/findAll2")
    @ResponseBody
    public Callable<ReturnResult> findAll2() {

        return new Callable<ReturnResult>() {

            @Override
            public ReturnResult call() throws Exception {
                List<UserInfo> allUser = userService.findAllUser();
                return ReturnResult.create(allUser);
            }
        };
    }
}
