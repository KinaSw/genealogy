

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Osoba {
    int pesel;
    String name;
    public Osoba(int pesel, String name) {
        this.pesel = pesel;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "pesel=" + pesel +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        Osoba o1 = new Osoba(111,"alice");
        Osoba o2 = new Osoba(222,"bob");
        Osoba o3 = new Osoba(111,"carl");

        osoby.add(o1);
        osoby.add(o2);
        osoby.add(o3);

        for (int i=0;i<osoby.size();i++)
            System.out.println(osoby.get(i));
        osoby.remove(o3);

        for(Osoba o : osoby){
            System.out.println(o);
        }

        osoby.add(o3);
        Map<Integer,Osoba> mapa = new HashMap<>();
        for (int i=0; i<osoby.size();i++){
            var oc = osoby.get(i);
            mapa.put(oc.pesel,oc);
        }


        for (Map.Entry<Integer, Osoba> para : mapa.entrySet()) {
            Integer klucz = para.getKey();
            Osoba wartosc = para.getValue();
            System.out.println(klucz + " -> " + wartosc);
        }

        for (Osoba o : mapa.values()){
            o.name="ZMIANA "+o.name;
        }
        for (Integer pesel  : mapa.keySet()){
            System.out.println(pesel);
        }

        System.out.println("wyszukanie: "+mapa.get(111));

        mapa.remove(111);
        System.out.println(mapa);

        System.out.println(osoby);
    }
}
