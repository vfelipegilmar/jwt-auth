package com.app.stein.service;

import com.app.stein.model.Teste;
import com.app.stein.repository.TesteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TesteServiceImpl implements TesteService{

    private final TesteRepository testeRepository;

    @Override
    public  List<Teste> findAll() {
        return testeRepository.findAll();
    }
}
