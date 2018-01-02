package com.shimofuri.damashiuchi.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * TOP画面を表示するコントローラ
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("damashiuchi")
public class indexController {

    /**
     * TOP画面を表示する（GET）
     * "/damashiuchi"で表示する。
     * @param model
     * @return templates/index.html
     */
    @RequestMapping(method = GET)
    public String index(Model model){
        model.addAttribute("hello", "hello world!");
        return "index";
    }
}
