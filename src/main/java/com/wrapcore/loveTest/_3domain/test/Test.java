package com.wrapcore.loveTest._3domain.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Long id; // 시험 고유 번호

    @Column(length = 20, nullable = false)
    private String title; // 시험명 ex)연애고사, 전생테스트 등

    @Column(length = 100, nullable = false)
    private String description; // 시험 설명

//    @Column(nullable = false)
//    private Long image_id; // 썸네일 이미지 id

    @Column(length = 15, nullable = false)
    private String button_text; // 하단 버튼명

    @CreatedDate
    private LocalDateTime createdAt; // 생성시간

    @LastModifiedDate
    private LocalDateTime updatedAt; // 수정시간

    @OneToMany(mappedBy = "test", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();
}
