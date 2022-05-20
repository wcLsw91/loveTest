package com.wrapcore.loveTest._2service.test;

import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest._3domain.test.TestRepostiory;
import com.wrapcore.loveTest.common.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepostiory testRepostiory;
    private final ModelMapper modelMapper;

//    @Transactional
//    public ApiResponse CreateTest(CreateTest.Request_DTO request){
//
//    }
}
