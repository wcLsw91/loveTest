package com.wrapcore.loveTest._1web.dto.test;/*
 * author		: sp91l
 * date			: 2022-05-19_오후 1:51
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-19_오후 1:51	    sp91l				최초생성
 * */

import com.sun.istack.NotNull;
import lombok.*;

public class CreateChoice {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request_DTO {
        @NotNull
        private String content;
    }
}
