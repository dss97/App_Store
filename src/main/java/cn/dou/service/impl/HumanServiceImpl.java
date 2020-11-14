package cn.dou.service.impl;

import cn.dou.dao.HumanMapper;
import cn.dou.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanServiceImpl implements HumanService {

    @Autowired
    private HumanMapper humanMapper;

    @Override
    public Object getHuman(int id) {
        return humanMapper.getHuman(id);
    }

    @Override
    public List<Object> getAll() {
        return humanMapper.getAll();
    }

    @Override
    public int updateHuman(int id) {
        if (getHuman(id) == null) {
            return -1;
        }

        int rows = humanMapper.updateHuman(id);

        if (rows > 0) {
            return rows;
        }
        return 0;
    }

    @Override
    public int deleteHuman(int id) {
        if (getHuman(id) == null) {
            return -1;
        }
        int rows = humanMapper.deleteHuman(id);

        if (rows > 0) {
            return rows;
        }
        return 0;

    }

    @Override
    public int insertHuman() {
        int rows = humanMapper.insertHuman();

        if (rows > 0) {
            return rows;
        }
        return 0;
    }
}
