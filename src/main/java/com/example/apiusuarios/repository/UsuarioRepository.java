package com.example.apiusuarios.repository;


import com.example.apiusuarios.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {



}
