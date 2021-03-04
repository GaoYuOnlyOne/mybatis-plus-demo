package com.example.gen.demo.gen;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.sun.javafx.PlatformUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CodeGenerator {
    /**
     * 全局配置
     * @param autoGenerator
     */
    public static void globalConfig(AutoGenerator autoGenerator){
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("gapui");
        autoGenerator.setGlobalConfig(gc);
    }
    /**
     * 数据源配置
     * @param autoGenerator
     */
    public static void dataSourceConfig(AutoGenerator autoGenerator){
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://59.110.234.26:3306/saber?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        autoGenerator.setDataSource(dsc);
    }
    /**
     * 包设置
     * @param autoGenerator
     */
    public static void packageConfig(AutoGenerator autoGenerator){
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("com.example.gem.demo");
        autoGenerator.setPackageInfo(pc);
    }
    /**
     * 自定义属性
     * @param autoGenerator
     */
    public static void defineConfig(AutoGenerator autoGenerator){
        InjectionConfig injectionConfig = new InjectionConfig() {
            //自定义属性注入:abc
            //在.ftl(或者是.vm)模板中，通过${cfg.abc}获取属性
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        autoGenerator.setCfg(injectionConfig);
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        globalConfig(mpg);
        // 数据源配置
        dataSourceConfig(mpg);
        // 包配置
        packageConfig(mpg);
        // 自定义配置
        defineConfig(mpg);

    }

}