package com.examplediru.demo17.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examplediru.demo17.model.Task;

public interface TaskRepositary extends JpaRepository<Task, Long> {

}
