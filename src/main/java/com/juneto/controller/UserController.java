/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserController
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/11/27 19:17
 * <p>
 * Description: cjs
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.juneto.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juneto.model.User;
import com.juneto.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 〈一句话功能简述〉<br> 
 * 〈cjs〉
 *
 * @author cjs

 * @create 2018/11/27

 * @since 1.0.0

 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
       System.out.println("chen");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
       long userId = Long.parseLong(request.getParameter("id"));
       User user = this.userService.selectUser(userId);
        System.out.println(user.getId());
        ObjectMapper mapper = new ObjectMapper();
       response.getWriter().write(mapper.writeValueAsString(user));
      // response.getWriter().write(mapper.writeValueAsString("chen"));
       response.getWriter().close();

    }


}