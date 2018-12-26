/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: Article
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/25 15:52
 * <p>
 * Description: test
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.solr;


import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author cjs

 * @create 2018/12/25

 * @since 1.0.0

 */

public class Article {
    // 文章id
    @Field
    private String id;
    // 文章分类id
    private String categoryId;
    // 作者id
    private String authorId;
    // 文章标题
    @Field
    private String name;
    // 文章内容
    @Field
    private String content;
    // 发布时间
    @Field
    private Date createTime;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    // 省去 getter setter toString方法
}
