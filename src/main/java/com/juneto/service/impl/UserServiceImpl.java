/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: UserServiceImpl
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/11/27 19:35
 * <p>
 * Description: cjs
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.juneto.service.impl;


import com.juneto.dao.IUserDao;
import com.juneto.model.User;
import com.juneto.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈cjs〉
 *
 * @author cjs

 * @create 2018/11/27

 * @since 1.0.0

 */
@Service("userService")
public class UserServiceImpl implements IUserService {

@Resource
    private IUserDao userDao;

@Override
public User selectUser(long userId) {
    return this.userDao.selectUser(userId);
}
}