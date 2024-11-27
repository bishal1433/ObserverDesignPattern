package Observer;

import Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{
    String user;
    StockObservable observable;

    public MobileNotificationAlertObserver(String user, StockObservable observable) {
        this.user = user;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnPhone(user,"Product is there!");
    }

    private void sendMsgOnPhone(String user, String s) {
        System.out.println("msg sent to: "+user);
    }
}
