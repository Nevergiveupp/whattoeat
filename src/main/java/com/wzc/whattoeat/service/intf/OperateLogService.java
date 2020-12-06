package com.wzc.whattoeat.service.intf;

import com.wzc.whattoeat.domain.OperateLog;

import java.util.List;

public interface OperateLogService {

    void save(OperateLog operateLog) throws Exception;

    List<OperateLog> findAll() throws Exception;
}
