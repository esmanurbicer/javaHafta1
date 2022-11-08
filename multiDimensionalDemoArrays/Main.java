package multiDimensionalDemoArrays;

public class Main {

	public static void main(String[] args) {
    String[][] sehirler = new String[3][3];
    
    sehirler[0][0] = "Ankara";
    sehirler[0][1] = "Osmaniye";
    sehirler[0][2] = "Çorum";
    sehirler[1][0] = "Sinop";
    sehirler[1][1] = "Trabzon";
    sehirler[1][2] = "Ağrı";
    sehirler[2][0] = "İstanbul";
    sehirler[2][1] = "Balıkesir";
    sehirler[2][2] = "Antalya";
    for(int i=0; i<=2; i++) {
    	System.out.println("-----------");
    	for(int j=0; j<=2; j++) {
    		System.out.println(sehirler[i][j]);
    	}
    	}
    }
    
}
