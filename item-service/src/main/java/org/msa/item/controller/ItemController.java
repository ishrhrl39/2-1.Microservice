package org.msa.item.controller;

import org.msa.item.dto.ItemDTO;
import org.msa.item.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="v1/item")
@Slf4j
public class ItemController {
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<ResponseDTO> add(@RequestBody ItemDTO itemDTO){
		ResponseDTO.ResponseDTOBuilder responseBuilder = ResponseDTO.builder();
		
		log.debug("request add item id = {}", itemDTO.getId());
		
		responseBuilder.code("200").message("success");
		return ResponseEntity.ok(responseBuilder.build());
	}
}
