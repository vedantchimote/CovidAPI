package tech.vedantchimote.CovidAPI.controller;

import tech.vedantchimote.CovidAPI.service.CovidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @eo.api-type http
 * @eo.path /covid
 */

@RestController
@RequestMapping("/covid")
@RequiredArgsConstructor
public class CovidController {

    private final CovidService covidService;
    /**
     * @eo.name callRapidEndpointToGetCovidData
     * @eo.url /get-all-country-covid-data
     * @eo.method get
     * @eo.request-type formdata
     * @return ResponseEntity
     */
    @GetMapping("/get-all-country-covid-data")
    public ResponseEntity<?> callRapidEndpointToGetCovidData(){
        return ResponseEntity.ok(covidService.getAllCountryCovidData());

    }
}
