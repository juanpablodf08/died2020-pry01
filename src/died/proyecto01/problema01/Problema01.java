/**
 * 
 */
package died.proyecto01.problema01;

import java.util.Random;

/**
 * @author admin
 *
 */
public class Problema01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte [] nrosApostados = {4,6,-1}; //new byte[3];
		float[] montoApostado = {3.5f,6.0f,0.0f};//new float[3];
		
		Random r = new Random();
		int nroSorteado = r.nextInt(37);
		//si aposte un num y gano, cobro 36. si aposte 2 num y gano, cobro 18. si aposte 3 numeros y gano, cobro 12
		//si sale cero, pierdo
		int cuantosAposto =0;
		for(int i=0;i < montoApostado.length; i++){
			if(montoApostado[i]>0) cuantosAposto++; // veo cuantos numeros aposto
		}
		
		int acerto = 0;
		for(byte unNro: nrosApostados){
			if(unNro ==nroSorteado){
				break;
			}else{
				acerto++;
			}
		}
		System.out.println("Nro sorteado: "+nroSorteado);
		System.out.println("Indice acepto: "+acerto);
		float premio = 0.0f;
		
		if(acerto<3){
				
			switch(cuantosAposto){
				case 1:
					premio = montoApostado[acerto]*36;
					break;
				case 2:
					premio = montoApostado[acerto]*18;
					break;
				case 3:
					premio = montoApostado[acerto]*12;
					break;
			}
		
		}
		
		if(nroSorteado ==0 || acerto>=3){
			System.out.println("La casa gana");
		} else {
			System.out.println("Premio: "+premio);
		  }
		
	}

}















