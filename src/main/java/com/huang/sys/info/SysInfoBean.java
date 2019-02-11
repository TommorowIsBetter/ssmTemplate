package com.huang.sys.info;

import lombok.Data;

/**
 * Created by huang on 2019/1/27.
 */
@Data
public class SysInfoBean {
    private String hashAlgorithmName;  //加密算法名称

    private int hashIterations; //加密次数

    private String selfSalt; //自定义盐

    private String defaltUserName;//默认用户名

    private String defaltUserPassword;//默认密码

    private String unknowName;//用户名不存在

    private String successInfo;//操作成功

    private String failureInfo;//操作失败


}
