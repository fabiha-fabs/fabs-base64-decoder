package com.fabs.base64decoder.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabs.base64decoder.dto.DecryptedTransactionResponse;
import com.fabs.base64decoder.dto.EncryptedTransactionRequest;
import com.fabs.base64decoder.services.Base64DecoderService;

@RestController
@RequestMapping("/base64")
public class Base64Controller {

	@Autowired
	private Base64DecoderService base64DecoderService;
	
	@PostMapping("/decode")
	public ResponseEntity<DecryptedTransactionResponse> decodeBase64(@Valid @RequestBody EncryptedTransactionRequest transactionRequest) {
		return ResponseEntity.ok(base64DecoderService.getDecodedResponse(transactionRequest));
	}
}
