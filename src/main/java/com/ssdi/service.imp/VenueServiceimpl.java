package com.ssdi.service.impl;

import com.ssdi.converter.VenueConverter;
import com.ssdi.dto.VenueDto;
import com.ssdi.repository.VenueRepository;
import com.ssdi.service.VenueService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueServiceimpl implements VenueService {
	@Autowired
	VenueRepository venueRepository;

	@Override
	public VenueDto getVenueById(Integer venueId) {
		return VenueConverter.entityToDto(venueRepository.getOne(venueId));
	}

	@Override
	public void saveVenue(VenueDto venueDto) {
		venueRepository.save(VenueConverter.dtoToEntity(venueDto));
	}

	@Override
	public List<VenueDto> getAllVenues() {
		return venueRepository.findAll().stream().map(VenueConverter::entityToDto).collect(Collectors.toList());
	}
}
