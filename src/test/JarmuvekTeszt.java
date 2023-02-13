/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author benedek
 */
import model.Auto;
import model.Jarmu;

class Hajo extends Jarmu {

    Hajo() {
        super();
    }
}

public class JarmuvekTeszt {

    public static void main(String[] args) {
        new JarmuvekTeszt();
    }

    public JarmuvekTeszt() {
        //this.mintaTeszt();
        this.haladBeinditassalAutoTeszt();
        this.haladBeinditasNlkAutoTeszt();
        
        this.hajoBeinditvaBeinditassalTeszt();
        this.hajoBeinditvaBeinditasNlkTeszt();
        
        this.hajoKifogyottHaladassalTeszt();
        this.hajoKifogyottHaladasNlkTeszt();
        
        this.hajoMegerkezettHaladassalTeszt();
        this.hajoMegerkezettHaladasNlkTeszt();
    }

    public void mintaTeszt() {
        int kapott = 7;
        int vart = 7;
        assert kapott == vart : "nem egyeznek";
    }

    private void haladBeinditasNlkAutoTeszt() {
        Auto auto = new Auto();
        auto.halad();
        boolean kapott = auto.isMegerkezett();
        boolean vart = false;
        assert vart == kapott : "nem tud haladni nlk";
    }

    private void haladBeinditassalAutoTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        auto.halad();
        boolean kapott = auto.isMegerkezett();
        boolean vart = true;
        assert vart == kapott : "nem tud haladni";
    }

    private void hajoBeinditvaBeinditassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.isBeinditva();
        boolean vart = true;
        assert vart == kapott : "nem indítja be a hajót";
    }

    private void hajoBeinditvaBeinditasNlkTeszt() {
        Hajo hajo = new Hajo();

        boolean kapott = hajo.isBeinditva();
        boolean vart = false;
        assert vart == kapott : "A hajó bevan indítva kezdetben.";
    }

    private void hajoKifogyottHaladassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        hajo.halad();
        boolean kapott = hajo.isUzemanyag();
        boolean vart = false;
        assert vart == kapott : "Maradt üzemanyag a hajóban";
    }

    private void hajoKifogyottHaladasNlkTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.isUzemanyag();
        boolean vart = true;
        assert vart == kapott : "Nincs üzemanyag";
    }

    private void hajoMegerkezettHaladassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        hajo.halad();
        boolean kapott = hajo.isMegerkezett();
        boolean vart = true;
        assert vart == kapott : "Nem érkezett meg a hajó haladással.";
    }

    private void hajoMegerkezettHaladasNlkTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.isMegerkezett();
        boolean vart = true;
        assert vart == kapott : " Megérkezett a hajó haladás nélkül.";
    }
}
