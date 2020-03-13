package com.jyh.log;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @Author jiangyonghua
 * @Date 2020/2/5 13:47
 * @Version 1.0
 **/
@Controller
@Slf4j
public class LogController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        return "log";
    }

    @RequestMapping("/log")
    public void log() {

        System.out.println("查看日志");
        logger.info("info logger");
        logger.error("error logger");
        logger.debug("debug logger");
        logger.warn("warn logger");
    }
}
