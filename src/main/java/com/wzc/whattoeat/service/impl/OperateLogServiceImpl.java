package com.wzc.whattoeat.service.impl;

import com.wzc.whattoeat.dao.intf.OperateLogMapper;
import com.wzc.whattoeat.domain.OperateLog;
import com.wzc.whattoeat.service.intf.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OperateLogServiceImpl implements OperateLogService {

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Override
    public List<OperateLog> findAll() throws Exception {
        return operateLogMapper.findAll();
    }

    @Override
    public void save(OperateLog log) throws Exception {
        operateLogMapper.save(log);
    }
}
