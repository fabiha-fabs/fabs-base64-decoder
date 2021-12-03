# fabs-base64-decoder

# How to run the microservice:
1. After downloading the project, go to the root directory
2. Run following set of commands:
	
		mvn clean install
		mvn spring-boot:run
		
# End points:
1. Once the project is running, you can access the only endpoint that this microservice offers:

		Request Method: POST
		End-point: http://localhost:8282/base64/decode
		Request body: 
				{
					"requestId": "A32W4ER2341",
					"requester": "XYZ App",
					"transactionType": "VFJBTlNGRVI=",
					"sourceAccountNumber":"MzIzNDEyMDA5MjM0ODc=",
					"destinationAccountNumber": "MDAxMjQxMDA5MjExNDM5",
					"amount": "MTUwMC41MA==",
					"note": "Test data"
				}

# NOTE:
As we are having this application as a microservice, it has dependency on Eureka discovery server project. That application should be running before we run this one..
