package com.ascklrt.api.heart.controller;

import com.ascklrt.common.annotation.DescriptionLog;
import com.ascklrt.api.model.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjiawei
 * @description
 * @date 2022/3/25 5:03 下午
 */
@DescriptionLog
@RestController
@RequestMapping(value = "/heart")
public class HeartController {

    @RequestMapping(value = "/beat", method = RequestMethod.GET)
    public CommonResult beat() {
        return new CommonResult(true, "beat is normal");
    }
}