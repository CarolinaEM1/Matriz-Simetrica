
package video97;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Video97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean simetrica=true;
        int matriz[][], nFilas, nCol;
        
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas:"));
        
        matriz = new int [nFilas][nCol];
        
        System.out.println("Digite la matriz: ");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        if(nFilas== nCol){
            int i,j;
            i=0;
            while(i<nFilas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if(matriz[i][j]!= matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            
            if(simetrica==true){
                JOptionPane.showMessageDialog(null,"La matriz es simetrica");
            }
            else {
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
                    
        }
    }
    
}
