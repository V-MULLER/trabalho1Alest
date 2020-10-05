package Trabalho1;
import java.util.Date;

public class Acidente {

	private String nomeLogradouro;

	private Date dataHora;

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

	public Acidente(String nomeLogradouro, Date dataHora, String diaDaSemana, int feridos, int fatais, int auto,
			int taxi, int lotacao, int onibusUrb, int onibusInt, int caminhao, int moto, int carroca, int bicicleta,
			String tempo, String turno, String regiao) {
		super();
		this.nomeLogradouro = nomeLogradouro;
		this.dataHora = dataHora;
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

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public int getFeridos() {
		return feridos;
	}

	public void setFeridos(int feridos) {
		this.feridos = feridos;
	}

	public int getFatais() {
		return fatais;
	}

	public void setFatais(int fatais) {
		this.fatais = fatais;
	}

	public int getAuto() {
		return auto;
	}

	public void setAuto(int auto) {
		this.auto = auto;
	}

	public int getTaxi() {
		return taxi;
	}

	public void setTaxi(int taxi) {
		this.taxi = taxi;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public int getOnibusUrb() {
		return onibusUrb;
	}

	public void setOnibusUrb(int onibusUrb) {
		this.onibusUrb = onibusUrb;
	}

	public int getOnibusInt() {
		return onibusInt;
	}

	public void setOnibusInt(int onibusInt) {
		this.onibusInt = onibusInt;
	}

	public int getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(int caminhao) {
		this.caminhao = caminhao;
	}

	public int getMoto() {
		return moto;
	}

	public void setMoto(int moto) {
		this.moto = moto;
	}

	public int getCarroca() {
		return carroca;
	}

	public void setCarroca(int carroca) {
		this.carroca = carroca;
	}

	public int getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(int bicicleta) {
		this.bicicleta = bicicleta;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public int totalAcidentes() {
		return getFeridos() + getFatais() + getAuto() + getTaxi() + getLotacao() + getOnibusUrb() + 
				getOnibusInt() + getCaminhao() + getMoto() + getCarroca() + getBicicleta();
	}



}
