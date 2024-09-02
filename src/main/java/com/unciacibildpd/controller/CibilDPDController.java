package com.unciacibildpd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unciacibildpd.model.Cibil;
import com.unciacibildpd.service.CibilDPDService;

@RestController
@RequestMapping("/ruleservice")
public class CibilDPDController {

	@Autowired
	private CibilDPDService cibilDPDService;

	@PostMapping("/getDPD")
	public ResponseEntity<Cibil> getRate(@RequestBody Cibil cibil) {
		Cibil cibil1 = cibilDPDService.getResponse(cibil);
		return new ResponseEntity<>(cibil1, HttpStatus.OK);
	}

}
