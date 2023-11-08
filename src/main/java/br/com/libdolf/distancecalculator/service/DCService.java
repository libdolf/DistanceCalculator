package br.com.libdolf.distancecalculator.service;

import br.com.libdolf.distancecalculator.entitiy.Location;
import br.com.libdolf.distancecalculator.gateway.request.Request;
import br.com.libdolf.distancecalculator.gateway.response.Response;
import org.springframework.stereotype.Service;

@Service
public class DCService {
    public Response findDistanceBetweenTwoPoints(Request request) {
        return new Response(calculateDistance(request.location1(), request.location2()),
                createMapsUrl(request.location1(),request.location2()));
    }

    private static Double calculateDistance(Location location1, Location location2){
        double R = 6371.0;

        double lat1 = Math.toRadians(location1.getLatitude());
        double lon1 = Math.toRadians(location1.getLongitude());
        double lat2 = Math.toRadians(location2.getLatitude());
        double lon2 = Math.toRadians(location2.getLongitude());

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }

    private static String createMapsUrl(Location location1, Location location2){
       final String BASE_URL = "https://www.google.com/maps/dir/";
        return BASE_URL+location1.getLatitude()+","+location1.getLongitude()+"/"+location2.getLatitude()+","+location2.getLongitude();
    }

}
