package com.comfama.api.archetype.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfama.api.archetype.business.ArchetypeBusiness;
import com.comfama.api.archetype.domain.Response;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@SwaggerDefinition(tags = { @Tag(name = "general", description = "RestController para el arquetipo") })
public class ArchetypeRest {

    private final ArchetypeBusiness productBusiness;

    @Autowired
    public ArchetypeRest(ArchetypeBusiness productBusiness) {
        super();
        this.productBusiness = productBusiness;
    }

    @ApiOperation(value = "Permite crear un producto en el sistema", notes = "Crea un nuevo registro en la base de datos"
            + " sobre la tabla PRODUCT, con base en el JSON recibido", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiParam(name = "product", value = "JSON con la informacion del producto", required = true, type = "ProductDTO")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "El producto fue creado exitosamente", response = Response.class),
            @ApiResponse(code = 400, message = "Error en la creacion del producto, debido a un error en los datos de la peticion recibida", response = Response.class),
            @ApiResponse(code = 500, message = "Error en la creacion del producto, generado por un error en el servidor", response = Response.class) })
    @PostMapping(value = "/product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<Void> createProduct() {
        // return this.productBusiness.createProduct(product);
        return null;
    }
}
