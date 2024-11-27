package Observer;

import Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable;

    public EmailNotificationAlertObserver(StockObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMsgOnEmail(email,"Product is there!");
    }

    private void sendMsgOnEmail(String email, String s) {
        System.out.println("msg sent to: "+email);
    }
}
