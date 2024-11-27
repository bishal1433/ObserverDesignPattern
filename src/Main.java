import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailNotificationAlertObserver;
import Observer.MobileNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver user1 = new MobileNotificationAlertObserver("bhowmikbishal1433@gmail.com", iphoneObservable);
        NotificationAlertObserver user2 = new EmailNotificationAlertObserver(iphoneObservable, "bbhowmik@visa.com");

        iphoneObservable.add(user1);
        iphoneObservable.add(user2);


        iphoneObservable.setStockCount(30);
        int stockCount = iphoneObservable.getStockCount();
        System.out.println("Stock count for Iphone is :"+stockCount);


    }
}