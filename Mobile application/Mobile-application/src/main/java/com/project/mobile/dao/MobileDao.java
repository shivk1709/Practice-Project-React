package com.project.mobile.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mobile.entity.MobileEntity;

public interface MobileDao extends JpaRepository<MobileEntity, Integer> {

}
