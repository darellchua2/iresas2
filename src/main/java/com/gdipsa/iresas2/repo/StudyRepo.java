package com.gdipsa.iresas2.repo;

import com.gdipsa.iresas2.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepo  extends JpaRepository<Study, Integer> {
}
