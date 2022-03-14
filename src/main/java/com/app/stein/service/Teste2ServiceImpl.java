package com.app.stein.service;

import com.app.stein.model.Teste2;
import com.app.stein.repository.Teste2Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class Teste2ServiceImpl implements Teste2Service{
    private final Teste2Repository teste2Repository;

    @Override
    public List<Teste2> findAll(){
        return teste2Repository.findAll();
    }
}
