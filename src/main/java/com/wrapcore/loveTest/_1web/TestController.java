package com.wrapcore.loveTest._1web;

import com.google.gson.Gson;
import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest._2service.test.TestService;
import com.wrapcore.loveTest.common.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

    private final TestService testService;
    private final Gson gson;

    @PostMapping("/test")
    public ApiResponse createTest(@RequestBody @Valid CreateTest.Request_DTO test) {
        log.info("CreateTest Request_DTO: {}",gson.toJson(test));
        return testService.CreateTest(test);
    }
}
