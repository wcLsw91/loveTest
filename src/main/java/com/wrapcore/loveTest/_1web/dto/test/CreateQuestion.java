package com.wrapcore.loveTest._1web.dto.test;/*
 * author		: sp91l
 * date			: 2022-05-19_오후 1:46
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-19_오후 1:46	    sp91l				최초생성
 * */

import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;

public class CreateQuestion {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request_DTO {
        @NotNull
        private String content;

        @NotNull
        private Integer score;

        @NotNull
        private Integer answer;

        @NotNull
        private List<CreateChoice.Request_DTO> choices;
    }
}
