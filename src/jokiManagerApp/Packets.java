/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokiManagerApp;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Yatora
 */
public class Packets {
    private int warrior=500, elite=500, master=1000,grandmaster=2000,epic=3000,legend=4000,mythic=15000, otherPacket=2000;
    
    public static String[] getCbRankSP(){    
        String[] cbItem = {"Warior","Elite","Master","Grandmaster","Epic","Legend","Mythic","Mythical Honor", "Mythical Glory"};
        return cbItem;
    }
    public static String[] getTemplateStarSP(){
        String[] item = {"9","16","25","25","70"};
        return item;
    }
    public static List<String> getCbRankPR(){
        List<String> item = new ArrayList<>();
        String[] ranks = {"Grandmaster - Epic", "Epic - Legend", "Legend - Mythic","Mythic - Mythic Honor","Mythic Honor - Mythic Glory"};
        for(String rank:ranks){
            item.add(rank);
        }
        return item;
    }
    public static String[] getCbOther(){
        String[] item = {"Classic Match","Magic Chess","MMR Hero(Request section)"};
        return item;
    }
    public static String[] getCbPaymentMethod(){
        String[] item = {"empty","Dana","Gopay","Qris","OVO","Other Bank"};
        return item;
    }
    public static String[] getCbConfimationMethod(){
        String[] item = {"empty","Email","WA"};
        return item;
    }
    public static String[] getCbPackets(){
        String[] item = {"empty","Star/Poin Packet", "Rank Packet", "Other Packet"};
        return item;
    }
    
    public int getHargaPS(int qty, String rank){
        int result = 0;
        if(rank.equalsIgnoreCase("warior")){
          result = warrior*qty; 
        }else if(rank.equalsIgnoreCase("elite")){
            result = elite*qty;
        }else if(rank.equalsIgnoreCase("master")){
            result = master*qty;
        }else if(rank.equalsIgnoreCase("grandmaster")){
            result = grandmaster*qty;
        }else if(rank.equalsIgnoreCase("epic")){
            result = epic*qty;
        }else if(rank.equalsIgnoreCase("legend")){
            result = legend*qty;
        }else{
            result = mythic*qty;
        }
        return result;
    }
    public int getHargaPR(String packet){
        int result = 0;
        if(packet.equals("Grandmaster - Epic")){
            result = 90000;
        }else if(packet.equals("Epic - Legend")){
            result = 140000;
        }else if(packet.equals("Legend - Mythic")){
            result = 185000;
        }else if(packet.equals("Mythic - Mythic Honor")){
            result = 430000;
        }else if(packet.equals("Mythic Honor - Mythic Glory")){
            result = 600000;
        }
        return result;
    }
    
    public int getHargaOther(int qty, String packet){
        int result = 0;
        result = otherPacket * qty;
        return result;
    }

    public int getWarrior() {
        return warrior;
    }

    public void setWarrior(int warrior) {
        this.warrior = warrior;
    }

    public int getElite() {
        return elite;
    }

    public void setElite(int elite) {
        this.elite = elite;
    }

    public int getMaster() {
        return master;
    }

    public void setMaster(int master) {
        this.master = master;
    }

    public int getGrandmaster() {
        return grandmaster;
    }

    public void setGrandmaster(int grandmaster) {
        this.grandmaster = grandmaster;
    }

    public int getEpic() {
        return epic;
    }

    public void setEpic(int epic) {
        this.epic = epic;
    }

    public int getLegend() {
        return legend;
    }

    public void setLegend(int legend) {
        this.legend = legend;
    }

    public int getMythic() {
        return mythic;
    }

    public void setMythic(int mythic) {
        this.mythic = mythic;
    }

    public int getOtherPacket() {
        return otherPacket;
    }

    public void setOtherPacket(int otherPacket) {
        this.otherPacket = otherPacket;
    }
    
    
}