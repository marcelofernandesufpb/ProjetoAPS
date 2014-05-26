import static org.junit.Assert.*;

import org.junit.Test;


public class PessoaTest {

	@Test
	public void test() {
		Pessoa m = new Pessoa();
		assertTrue("não iniciado", m.isIniciado());
		assertFalse("iniciado", m.isTerminado());
		m.setNome("Maria");
		assertEquals("Maria", m.getNome());
		assertNotEquals("João", m.getNome());
		m.setIdade(21);
		assertTrue("idade errada", m.getIdade()==21);
		assertFalse("idade certa", m.getIdade()!=21);
		m.setCidade("Rio Tinto");
		assertEquals("Rio Tinto", m.getCidade());
		assertNotEquals("Mamanguape",m.getCidade());
	}

}
