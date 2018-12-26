/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: IUserDaoTest
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/9 16:58
 * <p>
 * Description: 陈俊仕
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.juneto.dao;

import com.juneto.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author cjs

 * @create 2018/12/9

 * @since 1.0.0

 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getId());
    }

}