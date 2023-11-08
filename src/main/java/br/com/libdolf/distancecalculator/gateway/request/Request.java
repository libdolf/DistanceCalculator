package br.com.libdolf.distancecalculator.gateway.request;

import br.com.libdolf.distancecalculator.entitiy.Location;

public record Request(Location location1, Location location2) {
}
