package Observable;

import Observer.NotificationAlertObserver;

import java.util.*;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> ls = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        ls.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        ls.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:ls){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        this.stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
