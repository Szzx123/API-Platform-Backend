package com.pck.project.service;

import com.pck.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author shizhuzexuan
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-02-24 21:52:17
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
