package cn.iocoder.springboot.lab03.kafkademo.fortress;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author: QuCheng
 * @date: 2023/6/6
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CharEventPO extends EventPO {

    private String acl;

    /**
     * 动作，1-允许/2-告警/3-拒绝/4-命令审批/5-强制退出
     */
    private Integer action;

    /**
     * 日志监控级别,5种级别0-普通，1-重要，2-警告，3-危险，4-致命
     */
    private Integer logLevel;

    /**
     * 输入的命令
     */
    private String cmdLine;

}
