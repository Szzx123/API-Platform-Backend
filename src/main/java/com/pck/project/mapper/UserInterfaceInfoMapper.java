package com.pck.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pck.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author shizhuzexuan
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-02-28 15:34:52
* @Entity com.pck.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




