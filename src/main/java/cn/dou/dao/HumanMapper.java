package cn.dou.dao;

import java.util.List;

public interface HumanMapper {

    public  Object getHuman(int id);

    public List<Object> getAll();

    public  int updateHuman(int id);

    public  int deleteHuman(int id);

    public  int insertHuman();
}
