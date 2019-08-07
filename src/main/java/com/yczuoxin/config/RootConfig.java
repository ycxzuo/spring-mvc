package com.yczuoxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration
@ComponentScan(basePackages = "com.yczuoxin",
        excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class))
public class RootConfig {

    public static class WebPackage extends RegexPatternTypeFilter {
        // 排除 controller 层，防止被加载两次
        public WebPackage() {
            super(Pattern.compile("com.yczuoxin.controller"));
        }
    }

}
