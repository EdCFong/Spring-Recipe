package com.springrecipe.springrecipe.repositories;

import com.springrecipe.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CatagoryRepository extends CrudRepository<Category, Long> {
}
