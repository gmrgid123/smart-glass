package com.h2prop.blueno_ble;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.h2prop.blueno_ble.BlunoLibrary;

@SuppressLint("OverrideAbstract")
public class SmsNotificationListener extends NotificationListenerService {

    //TextView temp1,temp2;
    String tempstr;


    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        if(MainActivity.mConnectionState == BlunoLibrary.connectionStateEnum.isConnected) {
            final String packageName = sbn.getPackageName();
            Log.d("packagename", packageName);

            if (!TextUtils.isEmpty(packageName) && packageName.equals("com.samsung.android.messaging")) { // 삼성SMS
                Notification notification = sbn.getNotification();

                Bundle extras = notification.extras;
                String title = extras.getString(Notification.EXTRA_TITLE); // SMS 보낸 사람
                int id = sbn.getId();
                CharSequence text = extras.getCharSequence(Notification.EXTRA_TEXT); // SMS 문자 내용
                CharSequence subText = extras.getCharSequence(Notification.EXTRA_SUB_TEXT);

                /*if (id == 123) {  */
                    if(id==123 && !title.equals("메시지")){

                        String msg ="7새로운^메시지알림이^도착했습니다/";


                    Log.d("temptest", msg);
                    if (MainActivity.mConnectionState == BlunoLibrary.connectionStateEnum.isConnected) {
                        //BluetoothGattCharacteristic temp=null;
                        //temp.setValue(msg);
                        MainActivity.mSCharacteristic.setValue(msg);
                        MainActivity.mBluetoothLeService.writeCharacteristic(MainActivity.mSCharacteristic);
                        Log.d("temptest", msg + "2");

                    }
                }

            /*if (id == 2){ // 팝업 데이터 분류를 위한 IF문
                String msg = "S : " + title + "\n" +
                        "M : " + text;
                if (MainActivity.textView1 != null){
                    temp = MainActivity.textView1;
                    temp.setText(msg); // 메시지 전송
                }
            }*/

                //Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

                //Toast.makeText(this,"카카오톡 메시지가 있습니다",Toast.LENGTH_SHORT).show();
            }

            if (!TextUtils.isEmpty(packageName) && packageName.equals("com.kakao.talk")) {
                Notification notification = sbn.getNotification();

                Bundle extras = sbn.getNotification().extras;
                String title = extras.getString(Notification.EXTRA_TITLE); // 카톡 보낸 사람
                int id = sbn.getId();
                //CharSequence text = extras.getCharSequence(Notification.EXTRA_TEXT); // 카톡 문자 내용
                //CharSequence subText = extras.getCharSequence(Notification.EXTRA_SUB_TEXT);
/*

            String msg = "packageName : " + packageName + "\n" +
                    "id : " + sbn.getId() + "\n" +
                    "Title : " + title + "\n" +
                    "text : " + text + "\n" +
                    "subText : " + subText;
*/
                if (id == 2) { // 팝업 데이터 분류를 위한 IF문
                    String msg = "8새로운^카톡알림이^도착했습니다/";;
                    Log.d("temptest", msg);
                    if (MainActivity.mConnectionState == MainActivity.connectionStateEnum.isConnected) {
                        // BluetoothGattCharacteristic temp=null;
                        //temp.setValue(msg);

                        MainActivity.mSCharacteristic.setValue(msg);
                        MainActivity.mBluetoothLeService.writeCharacteristic(MainActivity.mSCharacteristic);

                    }

                /*if (MainActivity.textView2 != null) {
                    temp2 = MainActivity.textView2;
                    temp2.setText(msg); // 메시지 전송
                    Log.d("arduino",msg);
                }*/
                }

                //Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

                //Toast.makeText(this,"카카오톡 메시지가 있습니다",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
