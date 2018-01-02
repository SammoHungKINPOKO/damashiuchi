package com.shimofuri.damashiuchi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring MVC設定のカスタマイズを行うクラス。
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 記述した設定内容を反映する。
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // TODO MVC設定を入力
    }
}
