package com.example.gasuutility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gasuutility.entity.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
}
