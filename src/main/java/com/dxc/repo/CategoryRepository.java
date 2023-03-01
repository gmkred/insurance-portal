package com.dxc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dxc.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
