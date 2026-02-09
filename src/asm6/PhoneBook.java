package asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p : PhoneList){
            if (p.name.equals(name)){
                if (!p.phone.contains(phone)){
                    p.phone.add(phone);
                }
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        for (int i = 0; i<PhoneList.size();i++){
            if (PhoneList.get(i).name.equals(name)){
                PhoneList.remove(i);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber p : PhoneList){
            if (p.name.equals(name)){
                p.phone.clear();
                p.phone.add(newphone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p : PhoneList){
            if (p.name.equals(name)){
                System.out.println(p.name +":"+ p.phone);
                return;
            }
            System.out.println("No Information!");
        }
    }

    @Override
    public void sort() {
//        for (int i = 0; i<PhoneList.size()-1;i++){
//            for (int j=0;j<PhoneList.size()-i-1;j++){
//                if (PhoneList.get(j).name.compareTo(PhoneList.get(j+1).name)>0){
//                    PhoneNumber p = PhoneList.get(j);
//                    PhoneList.set(j, PhoneList.get(j+1));
//                    PhoneList.set(j+1,p);
//                }
//            }
//        }
//
//        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

//        Collections.sort(PhoneList, ((o1, o2) -> o1.name.compareTo(o2.name)));

        Collections.sort(PhoneList,Comparator.comparing(PhoneNumber::getName));

    }
}
