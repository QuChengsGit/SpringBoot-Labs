package cn.iocoder.springboot.lab03.kafkademo.fortress;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author ：qucheng
 * @version : 1.0
 * @description ：TODO
 * @date ：2023/12/7 15:02
 */
public class BuildSessionLog {

    public static SessionPO buildSessionLog() {
        SessionPO result = new SessionPO();
        result.setTenantId("test_001");
        result.setInstanceId("instance_id_003");
        result.setSessionId("session_id_002");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneWeekAgo = now.minus(Duration.ofDays(1)).withHour(0).withMinute(0).withSecond(0).withNano(0);
        // 获取当前时间和一周前的时间的秒数
        long oneWeekAgoInSeconds = oneWeekAgo.atZone(ZoneId.of("Asia/Shanghai")).toEpochSecond();
        result.setSessionStart(oneWeekAgoInSeconds);
        result.setSessionStop(oneWeekAgoInSeconds);
        result.setOmSource(0);
        result.setSessionFileSize("159");
        result.setServerIp("127.0.0.1");
        result.setServerName("server_name_002");
        result.setServerUser("server_user");
        result.setServerPort("1001");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user_003");
        result.setClientIp("127.0.0.6");
        result.setClientUname("client_uname");

        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();

        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间为字符串
        String formattedTime = currentTime.format(formatter);

        result.setTimeStamp(formattedTime);
        result.setIsPlayed(0);
        result.setAuthRuleNames(new ArrayList<String>());

        return result;
    }

    public static CharEventPO buildCharEventPO() {
        CharEventPO result = new CharEventPO();
        result.setTenantId("test_001");
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();

        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间为字符串
        String formattedTime = currentTime.format(formatter);

        result.setTimeStamp(formattedTime);
        result.setEventTime(System.currentTimeMillis()/1000);
        result.setSessionId("session_id_005");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        result.setServerIp("127.0.0.1");
        result.setServerName("server_name_002");
        result.setServerUser("server_user");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user_003");
        result.setClientIp("127.0.0.2");
        result.setClientUname("client_uname");
        result.setCmdLine("pwd");

        return result;
    }

    public static FileEventPO buildFileEventPO() {
        FileEventPO result = new FileEventPO();
        result.setTenantId("test_0001");
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();

        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间为字符串
        String formattedTime = currentTime.format(formatter);

        result.setTimeStamp(formattedTime);
        result.setEventTime(System.currentTimeMillis()/1000);
        result.setSessionId("session_id_006");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        result.setServerIp("127.0.0.2");
        result.setServerName("server_name_001");
        result.setServerUser("server_user");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user_002");
        result.setClientIp("127.0.0.2");
        result.setClientUname("client_uname");
        result.setFileName("file_name_004");
        result.setWorkDir("workdir");

        return result;
    }
}
