package io.espy.tac;

import org.springframework.data.annotation.Id;

public class ServiceAccount {

	@Id private String id;

	private String saAdName;

	public String getSaAdName() {
		return saAdName;
	}

	public void setSaAdName(String saAdName) {
		this.saAdName = saAdName;
	}

}