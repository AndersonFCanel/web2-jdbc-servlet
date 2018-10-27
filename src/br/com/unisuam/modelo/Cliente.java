package br.com.unisuam.modelo;

import java.util.Date;

import sun.security.krb5.internal.ccache.CCacheInputStream;

public class Cliente extends Usuario{

	private Integer numeroCartao;
	private String dataVencimento;
	
	CartaoDeCredito cc = new CartaoDeCredito();

	public CartaoDeCredito getCc() {
		return cc;
	}

	public void setCc(CartaoDeCredito cc) {
		this.cc.setNumeroCarto(numeroCartao);
		this.cc.setDataVencimento(dataVencimento);
	}

	
}
