package com.dxc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
