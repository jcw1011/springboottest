package com.jcw;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 * @description
 */
public class MpGenerator {

    public static void main(String[] args) {

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setActiveRecord(true)
                .setOutputDir("D:\\Program Files\\IntelliJ IDEA\\workspace\\springboottest\\src\\main\\java") // 输出目录
                .setFileOverride(true) // 是否覆盖文件
                .setAuthor("Jin Chenwu"); // 作者

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8")// 数据库连接
                .setUsername("root")
                .setPassword("888");

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig()
                .setInclude(new String[]{"user"}) // 数据表
                .setNaming(NamingStrategy.underline_to_camel); // 表名生成策略
                // .setCapitalMode(true) // 全局大写命名
                // .setEntityLombokModel(false) // 是否为Lombok模型，默认false

        // 包配置
        PackageConfig packageConfig = new PackageConfig()
                .setParent("com.jcw"); // 包路径

        new AutoGenerator()
                .setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }
}
