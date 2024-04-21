package com.joaodev.propostaapp.service;

import com.joaodev.propostaapp.dto.PropostaRequestDto;
import com.joaodev.propostaapp.dto.PropostaResponseDto;
import com.joaodev.propostaapp.entity.Proposta;
import com.joaodev.propostaapp.mapper.PropostaMapper;
import com.joaodev.propostaapp.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDto);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }

    public List<PropostaResponseDto> obterProposta() {
        return PropostaMapper.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());
    }
}
