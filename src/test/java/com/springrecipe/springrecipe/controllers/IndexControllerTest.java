package com.springrecipe.springrecipe.controllers;

import com.springrecipe.springrecipe.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class IndexControllerTest {

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;
    IndexController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {
        String response = controller.getIndexPage(model);

        assertEquals("index", response);
        verify(model, times(1)).addAttribute("recipes", recipeService.getRecipes());
    }
}