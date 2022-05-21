package com.wrapcore.loveTest._1web.dto.test;/*
 * author		: sp91l
 * date			: 2022-05-19_오후 12:13
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-19_오후 12:13	    sp91l				최초생성
 * */


import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateTest {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request_DTO {
        @NotNull
        private String title;

        @NotNull
        private String description;

        @NotNull
        private String button_text;

        @NotNull
        private List<CreateQuestion.Request_DTO> questions;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response_DTO {
        private String title;
        private String description;
        private String button_text;
        private List<CreateQuestion.Request_DTO> questions;
    }
}
