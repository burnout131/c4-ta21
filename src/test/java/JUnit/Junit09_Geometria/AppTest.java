package JUnit.Junit09_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class AppTest {
	
	Geometria geo1 = new Geometria();
	Geometria geo2 = new Geometria(2);

	@Test
	void testGeometriaInt() {
		Geometria geoTest = new Geometria(3);
		String respuesta = geoTest.figura(geoTest.getId());
		String esperado = "Triangulo";
		assertEquals(esperado, respuesta);
	}

	@Test
	void testGeometria() {
		Geometria geoTest = new Geometria();
		String respuesta = geoTest.figura(geoTest.getId());
		String esperado = "Default";
		assertEquals(esperado, respuesta);
	}

	@Test
	void testAreacuadrado() {
		//fail("Not yet implemented");
		int respuesta = geo1.areacuadrado(8);
		int esperado = 64;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testAreaCirculo() {
		double respuesta = geo1.areaCirculo(20);
		double esperado = 1256.637;
		double delta = 1;
		assertEquals(esperado, respuesta, delta);
	}

	@Test
	void testAreatriangulo() {
		int respuesta = geo1.areatriangulo(5, 2);
		int esperado = 5;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearectangulo() {
		int respuesta = geo1.arearectangulo(5, 8);
		int esperado = 40;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testAreapentagono() {
		int respuesta = geo1.areapentagono(5, 6);
		int esperado = 15;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearombo() {
		int respuesta = geo1.arearombo(10, 2);
		int esperado = 10;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testArearomboide() {
		int respuesta = geo1.arearomboide(5, 5);
		int esperado = 25;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testAreatrapecio() {
		int respuesta = geo1.areatrapecio(15, 5, 5);
		int esperado = 50;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testFigura() {
		String respuesta1 = geo1.figura(1);
		String esperado1 = "cuadrado";
		assertEquals(esperado1, respuesta1);
		
		String respuesta4 = geo1.figura(4);
		String esperado4 = "Rectangulo";
		assertEquals(esperado4, respuesta4);
		
		String respuesta5 = geo1.figura(5);
		String esperado5 = "Pentagono";
		assertEquals(esperado5, respuesta5);
		
		String respuesta6 = geo1.figura(6);
		String esperado6 = "Rombo";
		assertEquals(esperado6, respuesta6);
		
		String respuesta7 = geo1.figura(7);
		String esperado7 = "Romboide";
		assertEquals(esperado7, respuesta7);
		
		String respuesta8 = geo1.figura(8);
		String esperado8 = "Trapecio";
		assertEquals(esperado8, respuesta8);
	}

	@Test
	void testGetId() {
		int respuesta = geo1.getId();
		int esperado = 9;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testSetId() {
		geo1.setId(2);
		int esperado = 2;
		assertEquals(esperado, geo1.getId());
	}

	@Test
	void testGetNom() {
		String respuesta = geo2.getNom();
		String esperado = "Circulo";
		assertEquals(esperado, respuesta);
	}

	@Test
	void testSetNom() {
		Geometria geoTest = new Geometria();
		geoTest.setNom("Hola Nom");
		String respuesta = geoTest.getNom();
		assertEquals("Hola Nom", respuesta);
	}

	@Test
	void testGetArea() {
		geo2.areaCirculo(20);
		double respuesta = geo2.getArea();
		double esperado = 1256.637;
		double delta = 1;
		assertEquals(esperado, respuesta, delta);
	}

	@Test
	void testSetArea() {
		geo1.setArea(100);
		double respuesta = geo1.getArea();
		double esperado = 100;
		assertEquals(esperado, respuesta);
	}

	@Test
	void testToString() {
		String respuesta = geo1.toString();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, respuesta);
	}

}
