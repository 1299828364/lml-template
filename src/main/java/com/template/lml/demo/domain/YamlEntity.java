package com.template.lml.demo.domain;

/**
 * @ClassName yamlTest
 * @Description
 * @Author lml
 * @Date2019/8/20 13:25
 * @Version V1.0
 **/
import com.sun.xml.internal.ws.dump.LoggingDumpTube;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * YAML 语法实体类
 * 切记点：
 * 一、冒号后面加空格，即 key:(空格)value
 * 二、每行参数左边空格数量决定了该参数的层级，不可乱输入。
 */

@Data
@Component
@ConfigurationProperties(prefix = "yaml")
public class YamlEntity {

    // 字面值，字符串，布尔，数值
    private String str; // 普通字符串
    private String specialStr; // 转义特殊字符串
    private String specialStr2;// 输出特殊字符串
    private Boolean flag;   // 布尔类型
    private Integer num;    // 整数
    private Double dNum;    // 小数
    private Integer pageSize;
    private String secret;

    // 数组，List和Set，两种写法： 第一种：-空格value，每个值占一行，需缩进对齐；第二种：[1,2,...n] 行内写法
    private List<Object> list;  // list可重复集合
    private Set<Object> set;    // set不可重复集合

    // Map和实体类，两种写法：第一种：key空格value，每个值占一行，需缩进对齐；第二种：{key: value,....} 行内写法
    private Map<String, Object> map; // Map K-V
    private List<LoggingDumpTube.Position> positions;  // 复合结构，集合对象

    // 省略getter，setter，toString方法
}
