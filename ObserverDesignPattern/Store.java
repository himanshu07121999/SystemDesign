package ObserverPattern;

import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoclObservable iphone = new IphoneObeservable();
		NotificationAlertObserver observer1 =new MobileAlertObserver("abc@gmail.com", iphone);
		iphone.add(observer1);
		iphone.setStockCount(10);
	}

}
