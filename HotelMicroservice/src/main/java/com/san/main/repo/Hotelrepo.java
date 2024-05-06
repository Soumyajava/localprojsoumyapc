package com.san.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.main.model.Hotels;

@Repository
public interface Hotelrepo extends JpaRepository<Hotels, String>{

}
