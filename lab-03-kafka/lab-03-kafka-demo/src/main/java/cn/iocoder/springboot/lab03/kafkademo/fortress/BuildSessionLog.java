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
        result.setTenantId("1698872312842764289");
        result.setInstanceId("instance_id_003");
        result.setSessionId("session_id_001");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneWeekAgo = now.minus(Duration.ofDays(1)).withHour(0).withMinute(0).withSecond(0).withNano(0);
        // 获取当前时间和一周前的时间的秒数
        long oneWeekAgoInSeconds = oneWeekAgo.atZone(ZoneId.of("Asia/Shanghai")).toEpochSecond();
        result.setSessionStart(oneWeekAgoInSeconds);
        result.setSessionStop(oneWeekAgoInSeconds);
        result.setOmSource(0);
        result.setSessionFileSize("156");
        result.setServerIp("127.0.0.1");
        result.setServerName("server_name_001");
        result.setServerUser("server_user");
        result.setServerPort("1001");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user");
        result.setClientIp("127.0.0.1");
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
        result.setTenantId("1732716487692947458");
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();

        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间为字符串
        String formattedTime = currentTime.format(formatter);

        result.setTimeStamp(formattedTime);
        result.setEventTime(System.currentTimeMillis()/1000);
        result.setSessionId("session_id_004");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        result.setServerIp("127.0.0.1");
        result.setServerName("server_name_001");
        result.setServerUser("server_user");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user");
        result.setClientIp("127.0.0.1");
        result.setClientUname("client_uname");
        result.setCmdLine("ls");

        return result;
    }

    public static FileEventPO buildFileEventPO() {
        FileEventPO result = new FileEventPO();
        result.setTenantId("1732716487692947458");
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();

        // 定义日期时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间为字符串
        String formattedTime = currentTime.format(formatter);

        result.setTimeStamp(formattedTime);
        result.setEventTime(System.currentTimeMillis()/1000);
        result.setSessionId("session_id_004");
        result.setSessionType(1);
        result.setSessionProtocol(1);
        result.setServerIp("127.0.0.1");
        result.setServerName("server_name_001");
        result.setServerUser("server_user");
        result.setVpcName("vpc_name");
        result.setClientUser("client_user");
        result.setClientIp("127.0.0.1");
        result.setClientUname("client_uname");
        result.setFilename("file_name_002");

        return result;
    }
}
