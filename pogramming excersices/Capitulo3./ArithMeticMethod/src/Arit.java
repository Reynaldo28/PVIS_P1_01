/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author reynaldoaros
 */
public class Arit {
    private Integer num;
    
    public Integer sumauno(){
        Integer r = num + 10;
        return r;
    }
    public Integer sumaDos(){
        Integer r2 = num + 100;
        return r2;
    }
    public Integer sumaTres(){
        Integer r3 = num + 1000;
        return r3;
    }
    public void setNum(Integer num){
        this.num = num;
    }
    public Integer getNum(){
        return this.num;
    }
}