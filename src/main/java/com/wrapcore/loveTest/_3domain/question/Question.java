package com.wrapcore.loveTest._3domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id; // 문제 고유 번호

    @Column(length = 20, nullable = false)
    private String examSubject; // 시험 주제 ex)연애고사, 전생테스트 등

    @Column(length = 3, nullable = false)
    private Integer qNumber; // 문제 번호

    @Column(length = 50, nullable = false)
    private String question; // 문제

//    private MultipartFile questionFile; //문제 이미지
//    private String questionFilename; // 믄제 이미지 이름
}
