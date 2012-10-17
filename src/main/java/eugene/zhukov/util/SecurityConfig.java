package eugene.zhukov.util;

import org.springframework.core.io.Resource;

public class SecurityConfig {

	private String unauthorizedXML;
	private String unauthorizedJSON;
	private Resource privateKey;
	private long tokenValidityTime;

	public Resource getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(Resource privateKey) {
		this.privateKey = privateKey;
	}
	public String getUnauthorizedXML() {
		return unauthorizedXML;
	}
	public void setUnauthorizedXML(String unauthorizedXML) {
		this.unauthorizedXML = unauthorizedXML;
	}
	public String getUnauthorizedJSON() {
		return unauthorizedJSON;
	}
	public void setUnauthorizedJSON(String unauthorizedJSON) {
		this.unauthorizedJSON = unauthorizedJSON;
	}
	public long getTokenValidityTime() {
		return tokenValidityTime;
	}
	public void setTokenValidityTime(long tokenValidityTime) {
		this.tokenValidityTime = tokenValidityTime;
	}
}
