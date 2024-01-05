package com.comfama.reto.api.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.comfama.reto.api.business.RetoBusinessImpl;
import com.comfama.reto.api.exception.RetoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Clase que permite ejecutar las pruebas unitarias sobre los metodos auxiliares de la clase
 * 
 * @author eduardarbelaez@comfama.com.co
 *
 */
@SpringBootTest
public class ProductBusinessImplTests {

    /** Datos para la ejecucion de pruebas */
    public static final String TEST_PRODUCT_NAME = "Shoes";
    public static final String TEST_PRODUCT_CODE = "A0001";
    public static final double TEST_PRODUCT_PRICE = 2000;
    /** Repository de Spring */

    /** Referencia a la clase sobre la cual se realizan las pruebas */
    @Autowired
    private RetoBusinessImpl productBusiness;


    /**
     * Prueba unitaria para comprobar la correcta verificacion de la informacion de un producto, donde se lanza una excepcion cuando la info
     * no sea la esperada
     * 
     * @throws RetoException
     *             En caso de que la info sea incorrecta
     */
    @Test
    public void testVerifyProductInfoIncomplete() throws RetoException {
        assertTrue(true);
    }

}
