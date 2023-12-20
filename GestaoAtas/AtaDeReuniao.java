package poo.gestaodeatas;

//import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class AtaDeReuniao {
	private String tituloReuniao;
	private Date dataEmissao;
	// participantes;
	private Calendar inicioReuniao;
	private Calendar terminoReuniao;
	private String pautaReuniao;
	// private ArrayList<Sugestao> sugestoes = new ArrayList<>();
	
	private String setorAta;
	
	// private int statusAta;
	private boolean visibilidadeAta = true; //true - publica || false - privada
	/*
	 * Quais setores? RH, Financeiro, TI, Jurídico, 
	 * 
	 * As atas devem conter os seguintes dados: 
	 * título da reunião, OK
	 * data de emissão, OK
	 * participantes (funcionários), 
	 * data e hora de início 
	 * data e hora de término, 
	 * pauta (assuntos discutidos), 
	 * setor da organização ao qual a ata pertence, OK
	 * a descrição do que foi abordado,
	 * um conjunto de no mínimo uma e máximo cinco palavras-chave para ajudar em em possíveis buscas pela ata.
	 * Toda ata deve ter um mínimo de dois participantes – o emissor e pelo menos mais um
	 * participante.
	 * 
	 * private boolean isAtaValida() {
	 *  	if (this.participantes.length() >= 2) {
	 *  	  return true;
	 *  	} 
	 *  	else 
	 *  	 return false;
	 * }
	 * 	  
	 * 
	 * 
	 * Como padrão as atas serão classificadas em públicas – aquelas podem ser
	 * visualizadas por todos os funcionários –, porém, a critério do emissor, elas
	 * podem ser classificadas em privadas – aquelas que só podem ser visualizadas
	 * pelos membros da reunião.
	 * 
	 * Outro requisito desejado é que o sistema permita que pessoas externas à
	 * empresa possam ser incluídas como participantes das reuniões. Neste caso,
	 * deve-se documentar o nome, e-mail e a empresa (opcional) a qual ele pertence.
	 * 
	 * Quando emitidas as atas ficam no estado de “pré-emitidas”, não podendo ser
	 * visualizadas, a não ser pelo emissor.
	 * 
	 * A critério do emissor, migram para o estado “em processo de revisão”. Neste
	 * momento, os participantes serão avisados por e-mail que a ata está disponível
	 * para revisão (simule o envio de e-mail com a criação de um arquivo de texto).
	 * Neste caso, uma ata pode receber sugestões de alteração pelos revisores
	 * (membros da reunião). 
	 * 
	 * Sugestões devem ter a data e descrição e estar associada a apenas uma ata, porém uma ata pode ter várias sugestões. A ata
	 * permanece neste estado (em processo de revisão) até que o emissor declare-a
	 * como “emitida”, podendo ser consultada pelos funcionários da organização.
	 * 
	 * 
	 * O sistema deve guardar as atas geradas em um arquivo binário para posterior consulta. Pode ser usado um mapa
	 * (cuja chave é a data de emissão da ata) como estrutura de dado (ou outra estrutura que for julgada mais conveniente). 
	 * 
	 * Deve ser possível: criar uma ata, consultar, realizar sugestão, mudar o estado de uma ata, mostrar ata,
	 * excluir ata, entre outras funcionalidades de uma coleção. 
	 * 
	 * Se você desenhar o diagrama de classes terá um grande auxílio para trabalhar. 
	 * Tente também pensar no diagrama de sequência para as funcionalidades principais.
	 */

}
