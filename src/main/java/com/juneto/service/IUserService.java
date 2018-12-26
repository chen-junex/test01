/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: IUserService
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/11/27 19:30
 * <p>
 * Description: cjs
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.juneto.service;


import com.juneto.model.User;

/**
 * 〈一句话功能简述〉<br> 
 * 〈cjs〉
 *
 * @author cjs

 * @create 2018/11/27

 * @since 1.0.0

 */

public interface IUserService {


    public User selectUser(long userId);

}