package com.rafaa.activedirectoryservice.service;

import com.rafaa.activedirectoryservice.dto.ActiveDirectoryRequest;
import com.rafaa.activedirectoryservice.dto.ActiveDirectoryResponse;
import com.rafaa.activedirectoryservice.model.ActiveDirectory;
import com.rafaa.activedirectoryservice.repository.ActiveDirectoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActiveDirectoryService {

    private final ActiveDirectoryRepository activeDirectoryRepository;

    public void createActiveDirectory(ActiveDirectoryRequest activeDirectoryRequest){
        ActiveDirectory activeDirectory = ActiveDirectory.builder().
                                            name(activeDirectoryRequest.getName())
                                            .description(activeDirectoryRequest.getDescription())
                                            .build();
        activeDirectoryRepository.save(activeDirectory);
        log.info("Active Directory {} is Saved", activeDirectory.getId());
    }

    public List<ActiveDirectoryResponse> getAllActiveDirectories() {
        List<ActiveDirectory> activeDirectories = activeDirectoryRepository.findAll();
        return activeDirectories.stream().map(activeDirectory -> mapToActiveDirectoryResponse(activeDirectory)).toList();
    }

    private ActiveDirectoryResponse mapToActiveDirectoryResponse(ActiveDirectory activeDirectory) {
        return ActiveDirectoryResponse.builder()
                .id(activeDirectory.getId())
                .name(activeDirectory.getName())
                .description(activeDirectory.getDescription())
                .build();
    }
}
