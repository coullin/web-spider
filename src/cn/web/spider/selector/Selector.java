package cn.web.spider.selector;

import java.util.List;


public interface Selector {


    public String select(String text);

 
    public List<String> selectList(String text);

}
