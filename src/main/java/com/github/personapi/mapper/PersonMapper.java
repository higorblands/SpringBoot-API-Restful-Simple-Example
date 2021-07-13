package com.github.personapi.mapper;

import com.github.personapi.dto.request.PersonDTO;
import com.github.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
