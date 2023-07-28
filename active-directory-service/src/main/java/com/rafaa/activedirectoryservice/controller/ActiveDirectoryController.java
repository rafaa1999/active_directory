package com.rafaa.activedirectoryservice.controller;

import com.rafaa.activedirectoryservice.dto.ActiveDirectoryRequest;
import com.rafaa.activedirectoryservice.dto.ActiveDirectoryResponse;
import com.rafaa.activedirectoryservice.service.ActiveDirectoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/active-directory")
@RequiredArgsConstructor
public class ActiveDirectoryController {

    private final ActiveDirectoryService activeDirectoryService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createActiveDirectory(@RequestBody ActiveDirectoryRequest activeDirectoryRequest){
        activeDirectoryService.createActiveDirectory(activeDirectoryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ActiveDirectoryResponse> getAllActiveDirectories(){
        return activeDirectoryService.getAllActiveDirectories();
    }
}
