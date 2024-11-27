package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
