package javaapplication66;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Random;

public class JavaApplication66 {

    public static void main(String[] args) {
        int dia, mes, ano, sexo, estadoc;
        String nome;
        Scanner ler = new Scanner(System.in);
       
        
        System.out.println("insira seu nome: ");
        nome = ler.nextLine();
        System.out.println("Dia que nasceu: ");
        dia = ler.nextInt();
        System.out.println("Mês que nasceu: ");
        mes = ler.nextInt();
        System.out.println("Ano que Nasceu: ");
        ano = ler.nextInt();
        System.out.println("(1)Feminino e (2)Masculino");
        sexo = ler.nextInt();
        System.out.println("casado(1), solteiro(2)");
        estadoc = ler.nextInt();
        //
        
        
        
        System.out.println(estadoc(sexo, estadoc) + nome + " nascido no dia " + dia + " - " + mes + " - " + ano + " é do signo de " + signo(dia, mes, ano) + " - você tem " + idade(dia, mes, ano) + " anos - seu Número da sorte é:  " + sorte() + " e sua cor é: " + gerarcor()+"."  );

    }
////////////////////////////////////////////////////////////////

    public static String signo(int d, int m, int a) {
        String signo = "";

        if (d >= 21 && d <= 31 && m == 3 || d >= 1 && d <= 20 && m == 4) {
            signo = " Áries";
        } else if (d >= 21 && d <= 31 && m == 5 || d >= 1 && d <= 20 && m == 6) {
            signo = " Gêmeos";
        } else if (d >= 22 && d <= 31 && m == 7 || d >= 1 && d <= 22 && m == 8) {
            signo = "Leão";
        } else if (d >= 23 && d <= 31 && m == 9 || d >= 1 && d <= 22 && m == 10) {
            signo = "Libra";
        } else if (d >= 22 && d <= 31 && m == 11 || d >= 1 && d <= 21 && m == 12) {
            signo = "Sagitário";
        } else if (d >= 21 && d <= 31 && m == 1 || d >= 1 && d <= 19 && m == 2) {
            signo = "Aquário";
        } else if (d >= 21 && d <= 30 && m == 4 || d >= 1 && d <= 20 && m == 5) {
            signo = "Touro";
        } else if (d >= 21 && d <= 30 && m == 6 || d >= 1 && d <= 21 && m == 7) {
            signo = "Câncer";
        } else if (d >= 23 && d <= 30 && m == 8 || d >= 1 && d <= 22 && m == 9) {
            signo = "Virgem";
        } else if (d >= 23 && d <= 30 && m == 10 || d >= 1 && d <= 21 && m == 11) {
            signo = "Escorpião";
        } else if (d >= 22 && d <= 30 && m == 12 || d >= 1 && d <= 20 && m == 1) {
            signo = "Capricórnio";
        } else if (d >= 20 && d <= 28 && m == 2 || d >= 1 && d <= 20 && m == 3) {
            signo = "Peixes";
        }
        return signo;
////////////////////////////////////////////////////////
    }

    public static String estadoc(int sexo, int estadoc) {
        String resp = "";
        if (sexo == 1 && estadoc == 1) {
            resp = "sra. ";

        } else if (sexo == 2 && estadoc == 1) {
            resp = "sr. ";

        } else if (sexo == 1 && estadoc == 2) {
            resp = "";
        } else if (sexo == 2 && estadoc == 2) {
            resp = "";
        }
        return resp;
    }
/////////////////////////////////////////////////////////

    public static int idade(int dia, int mes, int ano) {
        int idade;
         int diaA, mesA, anoA;
        Calendar hoje = Calendar.getInstance();
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);
        
        
        idade=((anoA*365+mesA*12+diaA)-(ano*365+mes*12+dia))/365;

        return idade;
    }

    public static String gerarcor() {
        String[] cor = {"azul", "vermelho", "verde"};
        Random ncor = new Random();
        int vet = cor.length;
        int i = ncor.nextInt(vet);
        String cores = cor[i];
        return cores;

    }
    public static int sorte(){
        int sorte;
        sorte = (int) 1 + (int) (Math.random() * 100);
    return sorte;
}
}