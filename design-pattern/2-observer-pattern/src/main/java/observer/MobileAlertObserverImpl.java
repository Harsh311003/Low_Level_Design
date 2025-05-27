package observer;

import observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    public void update(){
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to: " + userName);
    }
}
