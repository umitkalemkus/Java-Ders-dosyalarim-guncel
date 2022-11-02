package j24_AccesModifier.farkliPackage;

import j24_AccesModifier.C01_AccessModifier;

public class C03_AccessModifier {


    private String privateTeamLead = "Hakan Aydin";
    String defaultName = "cebrail bey";
    protected String protectedName = "Dilek hanim";
    public String publicName = "Gamze Hanim";


    public static void main(String[] args) {


        C01_AccessModifier obj9= new C01_AccessModifier(23,63);//public val
        System.out.println("obj9.publicYas = " + obj9.publicYas);//publicvaluable
        //obj9.defaultYas// default variable package disi erisilemez
        //protected void protectedMethod() package disi call edilemez.



    }





}