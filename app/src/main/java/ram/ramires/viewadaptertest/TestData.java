package ram.ramires.viewadaptertest;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public List<Entity> getData(){
        Entity ferrari1=new Entity(Brand.FERRARI.name(), "ferrari_512_tr_1991","512 TR 1991","Скорость: 309 км/ч.Мощность: 428 л.с.Разгон до 100: 4.8 сек.",Class.SPORTCAR.name(),"13200000");
        Entity ferrari2=new Entity(Brand.FERRARI.name(), "ferrari_enzo_2010","Enzo Gemballa MIG-U1 2010","Скорость: 350 км/ч.Мощность: 700 л.с.Разгон до 100: 3.5 сек.", Class.SPORTCAR.name(),"99000000");
        Entity ferrari3=new Entity(Brand.FERRARI.name(), "ferrari_f40_1987","F40 1987","Скорость: 324 км/ч.Мощность: 478 л.с.Разгон до 100: 4.1 сек.", Class.SPORTCAR.name(),"101640000");
        Entity ferrari4=new Entity(Brand.FERRARI.name(), "ferrari_f50_1995","F50 1995", "Скорость: 325 км/ч.Мощность: 520 л.с.Разгон до 100: 3.9 сек.",Class.SPORTCAR.name(), "207240000");
        Entity ferrari5=new Entity(Brand.FERRARI.name(), "ferrari_f50_gt_1996","GT 1996", "Скорость: 378 км/ч.Мощность: 750 л.с.Разгон до 100: 2.9 сек.",Class.SPORTCAR.name(), "105600000");
        Entity ferrari6=new Entity(Brand.FERRARI.name(), "ferrari_f512_m_1994","F512 M 1994", "Скорость: 315 км/ч.Мощность: 440 л.с.Разгон до 100: 4.7 сек.",Class.SPORTCAR.name(), "16500000");
        Entity ferrari7=new Entity(Brand.FERRARI.name(), "ferrari_fxx_2005", "FXX 2005", "Скорость: 351 км/ч.Мощность: 800 л.с.Разгон до 100: 3 сек.",Class.SPORTCAR.name(),"145200000");
        Entity ferrari8=new Entity(Brand.FERRARI.name(), "ferrari_p4_pininfarina_2006", "P4/5 Pininfarina 2006", "Скорость: 352 км/ч.Мощность: 660 л.с.Разгон до 100: 3.2 сек.", Class.SPORTCAR.name(),"264000000");

        Entity ford1=new Entity(Brand.FORD.name(), "ford_falcon_2014","Falcon FPV GT F 2014", "Скорость: 297 км/ч.Мощность: 477 л.с.Разгон до 100: 4.7 сек.",Class.MUSLECAR.name(), "3960000");
        Entity ford2=new Entity(Brand.FORD.name(), "ford_falcon_fpv_gt_cobra_2007", "Ford Falcon FPV GT Cobra R-spec 2007", "Скорость: 276 км/ч.Мощность: 411 л.с.Разгон до 100: 5.4 сек.",Class.SPORTCAR.name(), "11220000");
        Entity ford3=new Entity(Brand.FORD.name(), "ford_gt_2017","GT 2017", "Скорость: 348 км/ч.Мощность: 655 л.с.Разгон до 100: 3.1 сек.Дизайн: 10", Class.SPORTCAR.name(),"3960000");
        Entity ford4=new Entity(Brand.FORD.name(),"ford_gt_avro_720_mirage_2008","GT Avro 720 Mirage 2008","Скорость: 354 км/ч.Мощность: 720 л.с.Разгон до 100: 3.4 сек.",Class.MUSLECAR.name(), "4620000");
        Entity ford5=new Entity(Brand.FORD.name(), "ford_gt_geigercars_2010", "GT GeigerCars HP790 2010","Скорость: 360 км/ч.Мощность: 790 л.с.Разгон до 100: 3.6 сек.", Class.SPORTCAR.name(),"19800000");
        Entity ford6=new Entity(Brand.FORD.name(),"ford_gt40_mk_1965","GT40 Mk I 1965","Скорость: 306 км/ч.Мощность: 380 л.с.Разгон до 100: 5.5 сек.",Class.SPORTCAR.name(), "15840000");
        Entity ford7=new Entity(Brand.FORD.name(),"ford_mustang_gt_fastback_1965","Mustang GT Fastback 1965","Скорость: 176 км/ч.Мощность: 271 л.с.Разгон до 100: 7.5 сек.",Class.MUSCLE_RETRO.name(),"10560000");
        Entity ford8=new Entity(Brand.FORD.name(), "ford_mustang_rtr_package_2011", "Mustang RTR Package 2011","Скорость: 250 км/ч.Мощность: 428 л.с.Разгон до 100: 4.5 сек.", Class.SPORTCAR.name(),"8580000");

        Entity lambo1=new Entity(Brand.LAMBORGHINI.name(), "lambo_huraca_performante_2018", "Huracan Performante 2018", "Скорость: 335 км/ч.Мощность: 640 л.с.Разгон до 100: 2.9 сек.Дизайн: 8.25", Class.SPORTCAR.name(),"17820000");
        Entity lambo2=new Entity(Brand.LAMBORGHINI.name(), "lambo_countach_1974", "Countach LP400 1974","Скорость: 316 км/ч.Мощность: 375 л.с.Разгон до 100: 5.5 сек.",Class.RETRO.name(),"33000000");

        Entity dodge1=new Entity(Brand.DODGE.name(),"dodge_challenger_2019", "Challenger SRT Hellcat Redeye 2019","Скорость: 327 км/ч.Мощность: 808 л.с.Разгон до 100: 3.5 сек.Дизайн: 10", Class.MUSLECAR.name(),"5280000");

        Entity porsche1=new Entity(Brand.PORSCHE.name(),"porsche_918_spyder_2014","918 Spyder 2014", "Скорость: 345 км/ч.Мощность: 887 л.с.Разгон до 100: 2.8 сек.",Class.SPORTCAR.name(), "85800000");

        List<Entity> list=new ArrayList<>();
        list.add(ferrari1); list.add(ferrari2); list.add(ferrari3);list.add(ferrari4); list.add(ferrari5);
        list.add(ferrari6);list.add(ferrari7);list.add(ferrari8);
        list.add(ford1);list.add(ford2);list.add(ford3);list.add(ford4);list.add(ford5);
        list.add(ford6);list.add(ford7);list.add(ford8);
        list.add(lambo1);list.add(lambo2);list.add(dodge1);list.add(porsche1);
        return list;
    }
}
