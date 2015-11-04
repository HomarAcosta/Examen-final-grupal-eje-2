
package pkgfinal.santu;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

public class FinalSantu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
   
   
   
        int i,rcorrectas=0,rincorrectas=0;

int op = JOptionPane.showConfirmDialog(null,"<html><h1 style=\"color:Fuchsia\" >  ********BIENVENIDO*******.</h1></html>"+ "  \n"  + 
                                   "<html><h3 style=\"color:Navy\" >Se Realizaran Algunas Preguntas Para Medir Su Conocimiento sobre: </h3></html>" + "  \n"  + 
                                   "<html><h3 style=\"color:Navy\" >---El santuario---  </h3></html> \n "+    "  \n"  +               
                                   "<html><h2 style=\"color:Navy\" > ¿Desea Continuar? </h3></html> \n " + "  \n"   ,"BIENVENIDOS",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);


if(op == YES_OPTION){
String preguntas [] = new String [30];
preguntas [0] = "01) " + " ¿Los planos del santuario fueron dados por Dios mismo? (Exo. 26)\n" ;
preguntas [1] = "02) " + " ¿Dios mando a hacer el Santuario para habitar en medio de su pueblo? (Exo. 25: 9)\n";
preguntas [2] = "03) " + " ¿El santuario original es el de la tierra? (Heb. 8: 1-2) \n";
preguntas [3] = "04) " + " Cuando Dios pidió una ofrenda para el Santuario\n" 
        +"¿Él les dijo exactamente en qué cantidad debían traer sus ofrendas? (Exo. 25:1-8) \n";
preguntas [4] = "05) " + " El santuario contaba con tres secciones o partes:\n" 
        +"atrio externo, el lugar santo y el lugar santísimo ¿Sí o no?\n";                         
preguntas [5] = "06) " + " ¿El velo del templo estaba cosido con solo un tipo de hilos? (Exo. 26: 31-35) \n";
preguntas [6] = "07) " + " ¿El altar donde se hacían los sacrificios era de oro? (exo. 27: 1-8)\n";
preguntas [7] = "08) " + " ¿El altar donde se quemaba el incienso era de madera de acacia? (Exo. 30: 1)";
preguntas [8] = "09) " + " Moisés era quien quemaba el incienso del altar del incienso?(Exo. 30:7-10) \n";
preguntas [9] = "10 " + " ¿El candelabro de oro que se encontraba en el lugar santo, tenía 12 lámparas? (Exo. 25: 31-40) \n";
preguntas [10] = "11) " + " ¿El aceite de las lámparas era de oliva? (Exo. 27: 20-21)\n";
preguntas [11] = "12) " + " ¿El tabernáculo terrenal es una copia o tipo del original que está en el cielo? (Heb 9:24)";
preguntas [12] = "13 " + " ¿El primer sacrificio que se registra en la Biblia fue en el santuario del desierto? (Géne. 3:9-21)"; 
preguntas [13] = "14) " + " ¿Jesucristo era comparado con un cordero? (juan 1:29) ";
preguntas [14] = "15) " + " ¿Jesús es nuestro sumo sacerdote en el cielo(Heb. 9)";
preguntas [15] = "16) " + " ¿Jesús es el sacrificio por los pecados de toda la humanidad? (Heb. 5)\n";
preguntas [16] = "17) " + " ¿los únicos sacrificios eran los corderos? (Éxo. 12:21-27; Lev. 2:1-3; Éxo. 25:2-7; Lev. 4:27-31) ";
preguntas [17] = "18) " + " ¿son más importantes los sacrificios que la obediencia? (1 Sam. 15:22 y Miq. 6:6 al 8)\n";
preguntas [18] = "19) " + " ¿el Arca del Testimonio era  el  símbolo supremo de la presencia y la santidad de Dios? (exo. 25: 21-22)";
preguntas [19] = "20) " + " ¿Al lugar santísimo se entraba solo una vez al año para el día de la expiación? (levi. 16)\n";
preguntas [20] = "21) " + " ¿La mesa de los panes estaba recubierta de oro? (Exo. 25:23-24) ";
preguntas [21] = "22) " + " ¿Los doce panes de la mesa de la propiciación simbolizaban\n" 
        +" un sacrificio de parte de las  doce tribus de Israel? (PyP capítulo 30; CBA Éxodo 25:30)";
preguntas [22] = "23) " + " ¿El arca del pacto estaba hecha con madera de roble?(Exo. 25: 10-11)\n";
preguntas [23] = "24) " + " ¿Al comer la carne del sacrificio, el sacerdote cargaba con las culpas del pueblo? (lev.10: 16-18)\n";
preguntas [24] = "25) " + " ¿el día de la expiación el santuario era limpiado y/o purificado los pecados del pueblo? (Lev. 16) ";
preguntas [25] = "26) " + " ¿El sacerdote usaba ropas especiales el día de la expiación? (Levítico 16:32-34) si\n";
preguntas [26] = "27) " + " ¿el macho cabrío que llevaban al desierto lo dejaban morir ahí? (Levítico 16:20-22) \n";
preguntas [27] = "28) " + " Si un cordero tenia manchas o defectos físicos ¿Aun se podía usar como sacrificio? (Exo. 12: 5) \n";
preguntas [28] = "29) " + " El santuario celestial también fue purificado? (Dan. 8:14)";
preguntas [29] = "30) " + " ¿La familia escogida para el sacerdocio era la de Aarón? (Exo. 28:1-3) ";


int RrC [] = {1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,1,0,1,1};
for(i=0; i<=29;i++){
int respuesta =JOptionPane.showConfirmDialog(null, preguntas[i],"Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 if(respuesta == RrC[i]){
		rincorrectas = rincorrectas + 1;
		}
         else
                rcorrectas = rcorrectas + 1;
}
int rcorrecta = (rcorrectas * 3)+10;
{JOptionPane.showMessageDialog(null, "Su puntaje es:  " +rcorrecta+"/100");
if (rincorrectas==0)  { 
JOptionPane.showMessageDialog(null, "Felicidtaciones Usted Tiene Un Puntaje maximo ","",JOptionPane.PLAIN_MESSAGE);
}else{
if ((rincorrectas<=15)&& (rincorrectas>0)) {
JOptionPane.showMessageDialog(null, " Muy Bien, Pero Esfuersate Un Poco Mas ","",JOptionPane.PLAIN_MESSAGE);
}else{
JOptionPane.showMessageDialog(null, " Debes Esforzarte Mas ","",JOptionPane.PLAIN_MESSAGE);
} 
}  }


    
}
    }
}
