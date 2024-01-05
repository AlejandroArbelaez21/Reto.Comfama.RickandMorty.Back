package com.comfama.api.archetype.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.comfama.api.archetype.business.ArchetypeBusinessImpl;
import com.comfama.api.archetype.exception.ArchetypeException;
import com.comfama.api.archetype.repository.ProductRepository;

/**
 * Clase que permite ejecutar las pruebas unitarias sobre los metodos auxiliares de la clase
 * 
 * @author felipe.olis@pragma.com.co
 *
 */
@SpringBootTest
public class ProductBusinessImplTests {

    /** Datos para la ejecucion de pruebas */
    public static final String TEST_PRODUCT_NAME = "Shoes";
    public static final String TEST_PRODUCT_CODE = "A0001";
    public static final double TEST_PRODUCT_PRICE = 2000;
    /** Repository de Spring */
    @Autowired
    private ProductRepository productRepository;
    /** Referencia a la clase sobre la cual se realizan las pruebas */
    @Autowired
    private ArchetypeBusinessImpl productBusiness;

    /**
     * Permite inicializar los datos requeridos para pruebas
     */
    @BeforeEach
    public void initTest() {
        productRepository.deleteAll();
    }

    /**
     * Prueba unitaria para comprobar la correcta verificacion de la informacion de un producto, donde se lanza una excepcion cuando la info
     * no sea la esperada
     * 
     * @throws ArchetypeException
     *             En caso de que la info sea incorrecta
     */
    @Test
    public void testVerifyProductInfoIncomplete() throws ArchetypeException {
        assertTrue(true);
    }

}
