Accenture assessment project:

1. Open the command prompt from within the project folder and run the runApi.bat file to start the application.
2. Once the application has started, open a browser and visit http://localhost:8080/swagger-ui.html.
3. Endpoints are as under:
	a. /v1/countries/highestAirports -> This endpoint responds with the top 10 countries having the highest number of airports.
	b. /v1/runways -> - This endpoint responds with the list of runways based on the country provided. 
					  - Either country code or country name can be provided as input. If none of the inputs are given, the endpoint will return a 400 Bad Request error. If multiple countries are retrieved based on the input provided, the endpoint will return a 300 Multiple Choice error. 
					  - This endpoint also supports partial/fuzzy country code/name as input parameter, e.g. entering 'x' in country code will result in 'Kosovo', entering 'zimb' in country name will result in 'Zimbabwe', etc.
