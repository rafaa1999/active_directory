package com.rafaa.inventoryservice.controller;

import com.rafaa.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInTheBase(@RequestParam("sku-code") String skuCode){
        return inventoryService.isInTheBase(skuCode);
    }
}
