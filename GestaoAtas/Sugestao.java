package poo.gestaodeatas;

import java.util.Date;

public class Sugestao {
	private Date dataSugestao;
	private String descricaoSugestao;
	
	public Sugestao(Date data, String descricao) {
		this.dataSugestao = data;
		this.descricaoSugestao = descricao;
	}
	
	
	/*
	 * A critério do emissor, migram para o estado “em processo de revisão”. Neste
	 * momento, os participantes serão avisados por e-mail que a ata está disponível
	 * para revisão (simule o envio de e-mail com a criação de um arquivo de texto).
	 * Neste caso, uma ata pode receber sugestões de alteração pelos revisores
	 * (membros da reunião). 
	 * 
	 * Sugestões devem ter a data e descrição e estar associada a apenas uma ata, porém uma ata pode ter várias sugestões. A ata
	 * permanece neste estado (em processo de revisão) até que o emissor declare-a
	 * como “emitida”, podendo ser consultada pelos funcionários da organização.
	 */
	
}
