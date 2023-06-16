package com.springrecipe.springrecipe.services;

import com.springrecipe.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
