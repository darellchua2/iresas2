package com.gdipsa.iresas2.repo;

import com.gdipsa.iresas2.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepo  extends JpaRepository<Sample, Integer> {
}
