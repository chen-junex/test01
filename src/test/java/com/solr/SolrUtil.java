/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: SolrUtil
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/25 15:38
 * <p>
 * Description: tset
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.solr;


import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.beans.DocumentObjectBinder;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈tset〉
 *
 * @author cjs

 * @create 2018/12/25

 * @since 1.0.0

 */

public class SolrUtil {
    private static SolrClient client;
    private static String url;
    static {
        url = "http://localhost:8888/solr/new_core";
        client = new HttpSolrClient.Builder(url).build();
    }
    /**
     * 保存或者更新solr数据
     *
     *
     */
    public static <T> boolean saveSolrResource(T solrEntity) {

        DocumentObjectBinder binder = new DocumentObjectBinder();
        SolrInputDocument doc = binder.toSolrInputDocument(solrEntity);
        try {
            client.add(doc);
            client.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 删除solr 数据
     *
     * @param id
     */
    public static boolean removeSolrData(String id) {
        try {
            client.deleteById(id);
            client.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * 查询
     *
     * @param keywords
     */
    public static QueryResponse query(String keywords) throws SolrServerException, IOException {
        SolrQuery query = new SolrQuery();
        query.setQuery(keywords);
        QueryResponse rsp = client.query(query);
        return rsp;
    }

    public static void main(String []args){
        Article article = new Article();
article.setCategoryId("11");
        SolrUtil.saveSolrResource(article);
        try {
            QueryResponse respone = SolrUtil.query("药店");
            List<Article> articleList = respone.getBeans(Article.class);
            System.out.println(articleList);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}