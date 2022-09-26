package com.se.kttkpmlabth04.controller;

import com.se.kttkpmlabth04.entity.ChuyenBay;
import com.se.kttkpmlabth04.service.ChuyenBayService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chuyenbay/")
public class ChuyenBayController {
    
    @Autowired
    private ChuyenBayService chuyenBayService;
    
    @Operation(summary = "cau1")
    @GetMapping("/cau1/{gaDi}")
    public ResponseEntity<Object> cau1(@PathVariable String gaDi) {
        return ResponseEntity.ok().body(chuyenBayService.cau1(gaDi));
    }
    
    @Operation(summary = "cau4")
    @GetMapping("/cau4/{less}/{than}")
    public ResponseEntity<Object> cau4(@PathVariable int less, @PathVariable int than) {
        return ResponseEntity.ok().body(chuyenBayService.cau4(less, than));
    }
}
