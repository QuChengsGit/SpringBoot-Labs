package cn.iocoder.springboot.lab03.kafkademo.fortress;


import lombok.Data;

import java.util.List;

/**
 * 会话审计日志传往数据中心的实体类
 *
 * @author : leijunfeng
 * create at:  2022/5/26  16:24
 */
@Data
public class SessionPO  {

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 资产ID
     */
    private String instanceId;

    /**
     * 会话ID
     */
    private String sessionId;
    /**
     * 会话类型，eg:SHELL
     */
    private Integer sessionType;
    /**
     * 会话协议,eg:SSH
     */
    private Integer sessionProtocol;
    /**
     * 会话开始时间
     */
    private Long sessionStart;
    /**
     * 会话结束时间
     */
    private Long sessionStop;
    /**
     * 运维方式 H5 BS
     */
    private Integer omSource;
    /**
     * 会话文件大小
     */
    private String sessionFileSize;
    /**
     * 主机资产IP
     */
    private String serverIp;
    /**
     * 主机资产名称
     */
    private String serverName;
    /**
     * 登录主机资产的账户名
     */
    private String serverUser;
    /**
     * 主机端口
     */
    private String serverPort;
    /**
     * 主机网络名称
     */
    private String vpcName;
    /**
     * 运维规则列表
     */
    private List<String> authRuleNames;
    /**
     * 客户端操作用户的ID
     */
    private String clientUser;
    /**
     * 客户端操作用户名称
     */
    private String clientUname;
    /**
     * 客户端IP
     */
    private String clientIp;
    /**
     * 是否审阅(0-否 1-是)
     */
    private Integer isPlayed;

    private String timeStamp;

}
