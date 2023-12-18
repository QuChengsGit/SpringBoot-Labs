package cn.iocoder.springboot.lab03.kafkademo.fortress;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author : wangdong
 * create at:  2022/6/2  09:18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileEventPO extends EventPO implements Serializable {

/*
            "copied": 40960, //读写字节数
            "speed": 40960, //传输速度
            "fd": 1, //文件句柄
            "flag": 16, //文件状态标记
            "result":0, //执行结果
            "elapsed":0, //传输时间
            "start_time": 1650941261, //开始时间
            "hash": "5b184e331076be9f25a2bc8b60b0789f468d3c5a", //hash值
            "err_msg":"", //错误信息
            "work_dir":"", //操作目录
            "filename": "axhelper.exe", //文件名
            "new_filename": "", //文件改名
*/

    private Long copied;

    private Long speed;

    private Integer fd;

    private Integer flag;

    private Integer result;

    private Integer elapsed;

    private Integer startTime;

    private String hash;

    private String errMsg;

    private String workDir;

    private String filename;

    private String newFilename;


}
