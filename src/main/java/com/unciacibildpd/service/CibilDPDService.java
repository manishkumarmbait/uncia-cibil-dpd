package com.unciacibildpd.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unciacibildpd.model.Cibil;
import com.unciacibildpd.model.Response;

@Service
public class CibilDPDService {

	@Autowired
	private KieContainer kieContainer;
	//Account account = new Account();
//	public Rate getRate(Participant applicantRequest) {
//		Rate rate = new Rate();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
//		kieSession.insert(applicantRequest);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return rate;
//	}
//==========================working=======================================
	public Cibil getResponse(Cibil cibil) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(cibil);
		kieSession.fireAllRules();
		kieSession.dispose();
		return cibil;
	}
//================================================================	
//	public Response getResponse(List<Deviation> guarantorList) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(guarantorList);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
//======================== running =================================================
	
//	public List<Account> getResponse(Cibil cibil) {
//		Response response = new Response();
//		List<Account> listOfAccount = cibil.getListOfAccount();
//		for(Account account : listOfAccount) {
////			Account account = new Account();
////			Cibil cibil1 = new Cibil();
//			KieSession kieSession = kieContainer.newKieSession();
////			kieSession.setGlobal("cibil", cibil1);
//			kieSession.setGlobal("response", response);
//			kieSession.setGlobal("account", account);
//			kieSession.insert(cibil);
//			kieSession.fireAllRules();
//			kieSession.dispose();			
//		}
//		return listOfAccount;
//	}
	
}
