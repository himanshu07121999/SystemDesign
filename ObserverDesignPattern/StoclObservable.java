package ObserverPattern;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StoclObservable {
	public void add(NotificationAlertObserver observer);
	public void remove(NotificationAlertObserver observer);
	public void notifySubscriber();
	public void setStockCount(int newStockAdded);
	public int getStockCount();
}
