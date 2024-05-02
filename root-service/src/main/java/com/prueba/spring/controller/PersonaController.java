/*
 * Copyright (c) 2021.
 *
 * Superintendencia de Econom&iacute;a Popular y Solidaria
 * Todos los derechos reservados
 */

package com.prueba.spring.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author ecasa on 2024/05/02.
 * @version 1.0.0
 */
@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@SecurityRequirement(name = "Bearer")
public class PersonaController {

}
