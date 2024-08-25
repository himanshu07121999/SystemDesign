package ObserverPattern.Observer;

import ObserverPattern.StoclObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
	String username;
	StoclObservable observable;
	
	public MobileAlertObserver(String emailId, StoclObservable observable) {
		this.observable = observable;
		this.username = emailId;
	}
	public void update() {sendMsgonMobile(username, "prodduct in stock");}
	public void sendMsgonMobile(String username,String msg) {
		System.out.println("msg sent to :"+username);
	}
}
