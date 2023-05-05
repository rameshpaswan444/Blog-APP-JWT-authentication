package com.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
