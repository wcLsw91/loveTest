package com.wrapcore.loveTest._1web;

import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest.common.api.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
@RequestMapping("/api")
public class TestController {

    @PostMapping("/test")
    public ApiResponse createTest(@RequestBody @Valid CreateTest.Request_DTO test) {
        log.info("----CreateTest: {}", test.toString());

        return new ApiResponse(test);
    }
}
