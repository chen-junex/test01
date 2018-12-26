package com.solr;


import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.util.List;
import java.util.Map;

public interface SolrService {


    /**
     * 按条件查询搜索引擎
     *
     * @author  wangwensheng@yxj.org.cn
     * @param coreName
     * @param query
     * @return
     * @since
     */
    public SolrDocumentList querySolrIndex(String coreName, String query);

    /**
     * 向solr插入数据
     *
     * @author  wangwensheng@yxj.org.cn
     * @param coreName
     * @param input
     * @return
     * @since
     */
    public boolean pushDataIntoSolr(String coreName, List<SolrInputDocument> input);


    /**
     * 根据ID 删除数据
     *
     * @author wangwensheng@yxj.org.cn
     * @param coreName
     * @param ids
     * @return
     * @since
     */
    public boolean deleteSolrByIds(String coreName, List<String> ids);

    /**
     *
     *
     * @author  wangwensheng@yxj.org.cn
     * @param coreName
     * @param id
     * @param maps 属性名称，属性值键值对
     * @return
     * @since
     */
    public boolean updateSolrById(String coreName, String id, Map<String, String> maps);

}

