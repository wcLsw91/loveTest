package com.wrapcore.loveTest._3domain.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepostiory extends JpaRepository<Test, Long> {
}
