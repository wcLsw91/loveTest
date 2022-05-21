package com.wrapcore.loveTest._1web;

import com.google.gson.Gson;
import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest._2service.test.TestService;
import com.wrapcore.loveTest._3domain.test.ChoiceRepostiory;
import com.wrapcore.loveTest._3domain.test.QuestionRepostiory;
import com.wrapcore.loveTest.common.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

    private final TestService testService;
    private final QuestionRepostiory questionRepostiory;
    private final ChoiceRepostiory choiceRepostiory;
    private final Gson gson;

    @PostMapping("/test")
    public ApiResponse createTest(@RequestBody @Valid CreateTest.Request_DTO test) {
        log.info("CreateTest Request_DTO: {}",gson.toJson(test));
        Long savedTestId = testService.saveTest(test);
        return new ApiResponse(testService.readTestByTest_id(savedTestId));
    }

    @GetMapping("/question/{test_id}")
    public ApiResponse questionsByTestId(@PathVariable("test_id") Long test_id) {
        return new ApiResponse(testService.readTestByTest_id(test_id));
    }
}
