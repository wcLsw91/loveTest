package com.wrapcore.loveTest._2service.test;

import com.google.gson.Gson;
import com.wrapcore.loveTest._1web.dto.test.CreateTest;
import com.wrapcore.loveTest._3domain.test.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {
    private final TestRepostiory testRepostiory;
    private final QuestionRepostiory questionRepostiory;
    private final ChoiceRepostiory choiceRepostiory;
    private final ModelMapper modelMapper;
    private final Gson gson;

    @Transactional
    public Long saveTest(CreateTest.Request_DTO dto_Test){
        Test testEntity = modelMapper.map(dto_Test, Test.class);
        log.info("CreateTest DTO -> Entity: {}",gson.toJson(testEntity));

        // 컬렉션 따로 빼기
        List<Question> questions = testEntity.getQuestions();
        testEntity.setQuestions(null);
        // Test Save
        Test testSaved = testRepostiory.save(testEntity);
        log.info("testSaved: {}",gson.toJson(testSaved));
        Long savedTestId = testSaved.getId();
        log.info("savedTestId: {}",savedTestId);

        questions.forEach(question -> {
            question.setTest(testSaved);
            List<Choice> choices = question.getChoices();
            question.setChoices(null);
            // Question Save
            Question questionSaved = questionRepostiory.save(question);
            log.info("questionSaved: {}",gson.toJson(questionSaved));

            choices.forEach(choice -> {
                choice.setQuestion(questionSaved);
                // Choice Save
                Choice choiceSaved = choiceRepostiory.save(choice);
                log.info("choiceSaved: {}",gson.toJson(choiceSaved));
            });
        });
        log.info("saveTest end");
        return savedTestId;
    }

    @Transactional
    public CreateTest.Response_DTO readTestByTest_id(Long test_id){
        Test foundTest = testRepostiory.findById(test_id).orElseThrow();
        CreateTest.Response_DTO testResDTO = modelMapper.map(foundTest, CreateTest.Response_DTO.class);
        log.info("testResDTO: {}",gson.toJson(testResDTO));
        return testResDTO;
    }
}
