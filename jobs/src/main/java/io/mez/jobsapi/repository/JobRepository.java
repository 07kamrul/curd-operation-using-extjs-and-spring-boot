package io.mez.jobsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mez.jobsapi.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
