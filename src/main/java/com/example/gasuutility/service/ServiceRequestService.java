package com.example.gasuutility.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasuutility.dto.ServiceRequestDTO;
import com.example.gasuutility.entity.ServiceRequest;
import com.example.gasuutility.repository.ServiceRequestRepository;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    public void createServiceRequest(ServiceRequestDTO serviceRequestDTO) {
        ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setName(serviceRequestDTO.getName());
        serviceRequest.setRequestType(serviceRequestDTO.getRequestType());
        serviceRequest.setDescription(serviceRequestDTO.getDescription());
        serviceRequestRepository.save(serviceRequest);
    }

    public List<ServiceRequest> getAllServiceRequests() {
        return serviceRequestRepository.findAll();
    }

    public ServiceRequest getServiceRequestById(Long id) {
        return serviceRequestRepository.findById(id).orElseThrow(() -> new RuntimeException("Service Request not found"));
    }

    public void deleteServiceRequest(Long id) {
        serviceRequestRepository.deleteById(id);
    }
}
