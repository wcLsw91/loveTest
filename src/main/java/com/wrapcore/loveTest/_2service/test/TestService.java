package com.wrapcore.loveTest._2service.test;

import com.google.gson.Gson;
import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest._3domain.test.Test;
import com.wrapcore.loveTest._3domain.test.TestRepostiory;
import com.wrapcore.loveTest.common.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {
    private final TestRepostiory testRepostiory;
    private final ModelMapper modelMapper;
    private final Gson gson;

    @SneakyThrows
    @Transactional
    public ApiResponse CreateTest(CreateTest.Request_DTO request){
        log.info("");
        Test dtoToEntity = modelMapper.map(request, Test.class);
        log.info("CreateTest DtoToEntity: {}",gson.toJson(dtoToEntity));
        Test resEntity = testRepostiory.save(dtoToEntity);
        CreateTest.Response_DTO resDTO = modelMapper.map(resEntity, CreateTest.Response_DTO.class);
        log.info("CreateTest Response_DTO: {}",gson.toJson(resDTO));
        return new ApiResponse(resDTO);
    }
}
