package com.wrapcore.loveTest._3domain.test;/*
 * author		: sp91l
 * date			: 2022-05-18_오후 11:32
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-18_오후 11:32	    sp91l				최초생성
 * */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Test test;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer score;

    @Column(nullable = false)
    private Integer answer;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(nullable = false)
    private List<Choice> choices = new ArrayList<>();

}


