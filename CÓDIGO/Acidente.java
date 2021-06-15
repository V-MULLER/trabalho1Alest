package CÓDIGO;//package Trabalho1;
import java.time.LocalDateTime;
import java.util.Date;

public class Acidente {

	private  String logradouro;

	private String nomeLogradouro;

	private String tipoAcidente;

	//private Date dataHora;
	private LocalDateTime dataa;

	private String diaDaSemana;

	private int feridos;

	private int fatais;

	private int auto;

	private int taxi;

	private int lotacao;

	private int onibusUrb;

	private int onibusInt;

	private int caminhao;

	private int moto;

	private int carroca;

	private int bicicleta;

	private String tempo;

	private String turno;

	private String regiao;
	
	public Acidente() {
	}

	public Acidente(String logradouro, String nomeLogradouro, String tipoAcidente, LocalDateTime data, String diaDaSemana, int feridos, int fatais, int auto,
			int taxi, int lotacao, int onibusUrb, int onibusInt, int caminhao, int moto, int carroca, int bicicleta,
			String tempo, String turno, String regiao) {
		super();
		this.logradouro = logradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.tipoAcidente = tipoAcidente;
		//this.dataHora = dataHora;
		this.data = data;
		this.diaDaSemana = diaDaSemana;
		this.feridos = feridos;
		this.fatais = fatais;
		this.auto = auto;
		this.taxi = taxi;
		this.lotacao = lotacao;
		this.onibusUrb = onibusUrb;
		this.onibusInt = onibusInt;
		this.caminhao = caminhao;
		this.moto = moto;
		this.carroca = carroca;
		this.bicicleta = bicicleta;
		this.tempo = tempo;
		this.turno = turno;
		this.regiao = regiao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public String getTipoAcidente() {
		return tipoAcidente;
	}

	//public Date getDataHora() {
	public LocalDateTime getData(){
		return data;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public int getFeridos() {
		return feridos;
	}

	public int getFatais() {
		return fatais;
	}

	public int getAuto() {
		return auto;
	}

	public int getTaxi() {
		return taxi;
	}

	public int getLotacao() {
		return lotacao;
	}

	public int getOnibusUrb() {
		return onibusUrb;
	}

	public int getOnibusInt() {
		return onibusInt;
	}

	public int getCaminhao() {
		return caminhao;
	}

	public int getMoto() {
		return moto;
	}

	public int getCarroca() {
		return carroca;
	}

	public int getBicicleta() {
		return bicicleta;
	}

	public String getTempo() {
		return tempo;
	}

	public String getTurno() {
		return turno;
	}

	public String getRegiao() {
		return regiao;
	}

	public int totalAcidentes() {
		return getFeridos() + getFatais() + getAuto() + getTaxi() + getLotacao() + getOnibusUrb() + 
				getOnibusInt() + getCaminhao() + getMoto() + getCarroca() + getBicicleta();
	}

	@Override
	public String toString() {
		return "Acidente{" +
				"nomeLogradouro='" + nomeLogradouro + '\'' +
				", dataHora=" + data+
				", diaDaSemana='" + diaDaSemana + '\'' +
				", feridos=" + feridos +
				", fatais=" + fatais +
				", auto=" + auto +
				", taxi=" + taxi +
				", lotacao=" + lotacao +
				", onibusUrb=" + onibusUrb +
				", onibusInt=" + onibusInt +
				", caminhao=" + caminhao +
				", moto=" + moto +
				", carroca=" + carroca +
				", bicicleta=" + bicicleta +
				", tempo='" + tempo + '\'' +
				", turno='" + turno + '\'' +
				", regiao='" + regiao + '\'' +
				'}';
	}
}
