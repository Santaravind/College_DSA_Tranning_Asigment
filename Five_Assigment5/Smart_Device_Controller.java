package Assigment.Five_Assigment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Device{
    void turnOn();
}
class AC implements Device{

    @Override
    public void turnOn() {
        System.out.println("AC  is on");
    }
}
class Fan implements Device{

    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }
}
class Light implements Device{

    @Override
    public void turnOn() {
        System.out.println("Light is on ");
    }
}
public class Smart_Device_Controller {
    public static void main(String[] args) {
        List<Device> list=new ArrayList<Device>();
        list.add(new AC());
        list.add(new Fan());
        list.add(new Light());

        Iterator<Device>ti= list.iterator();
        while (ti.hasNext()){
            ti.next().turnOn();
        }
    }
}
