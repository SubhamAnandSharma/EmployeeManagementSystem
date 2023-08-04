package com.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.entities.LeaveRequest;

public interface LeaveRequestService extends JpaRepository<LeaveRequest, Integer> {

}
