package com.springrecipe.springrecipe.repositories;

import com.springrecipe.springrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
