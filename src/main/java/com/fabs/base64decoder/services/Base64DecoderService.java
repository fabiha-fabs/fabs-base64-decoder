package com.fabs.base64decoder.services;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabs.base64decoder.dto.DecryptedTransactionResponse;
import com.fabs.base64decoder.dto.EncryptedTransactionRequest;


@Service
public class Base64DecoderService {

	@Autowired
	private Base64 base64;

	private String getDecodedString(String base64EncodedStr) {
		return new String(base64.decode(base64EncodedStr.getBytes()));
	}

	public DecryptedTransactionResponse getDecodedResponse(EncryptedTransactionRequest encryptedTransactionRequest) {
		return null;
	}
}
