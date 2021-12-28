package com.github.levphilippov.inventoryfailover.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {

    @RequestMapping(path = "/inventory-failover", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BeerInventoryDto>> getFailoverMock(){
        return new ResponseEntity(List.of(BeerInventoryDto.builder()
                                            .id(UUID.randomUUID())
                                            .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                                            .createdDate(OffsetDateTime.now())
                                            .lastModifiedDate(OffsetDateTime.now())
                                            .quantityOnHand(999)
                                            .build()
        ), HttpStatus.OK);
    }
}
