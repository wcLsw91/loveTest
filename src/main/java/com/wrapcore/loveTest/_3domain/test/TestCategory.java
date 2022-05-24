package com.wrapcore.loveTest._3domain.test;/*
 * author		: sp91l
 * date			: 2022-05-23_오전 10:59
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-23_오전 10:59	    sp91l				최초생성
 * */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@Table(name = "test_category")
public class TestCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String cateName;
}
