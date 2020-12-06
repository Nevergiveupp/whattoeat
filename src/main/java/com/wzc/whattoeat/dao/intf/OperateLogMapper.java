package com.wzc.whattoeat.dao.intf;

import com.wzc.whattoeat.domain.OperateLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈用户Dao〉<br>
 * 〈功能详细描述〉
 *
 * @author 20022335
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface OperateLogMapper {

    List<OperateLog> findAll();

    void save(OperateLog log);
}
