package cn.iocoder.springboot.lab03.kafkademo.fortress;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: QuCheng
 * @date: 2023/6/6
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventPO {

    /**
     * 租户ID
     */
    private String tenantId;
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
     * 事件ID
     */
    private String eventId;
    /**
     * 事件类型
     */
    private Integer eventType;
    /**
     * 事件时间
     */
    private Long eventTime;
    /**
     * 主机网络名称
     */
    private String vpcName;
    /**
     * 操作结果
     */
    private Integer statusCode;
    /**
     * 运维规则列表
     */
    private List<String> authRuleNames;


    private String timeStamp;
}
