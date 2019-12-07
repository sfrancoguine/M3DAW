//donada la següent seqüencia d'ARN indica quants codons d'inici trobaríem en ella.
//Recorda que els codons d'inici són els de la forma AUG
class Main {
  public static void main(String[] args) {
   
    char[] cadena1 = {'C','G','G','A','U','G','C','G','G','U','U','G','A','U','G','C','C'};
       
    int i = 0;
    int coincidencies=0; int codo=0;
    while(i<17){
      if(coincidencies == 0 && cadena1[i]=='A'){
        coincidencies=1;
      }
      if(coincidencies == 1 && cadena1[i]=='U'){
        coincidencies=2;
      }
      if(coincidencies == 2 && cadena1[i]=='G'){
        coincidencies=0;
        codo+=1;
      }
      i++;
    }
    System.out.println("El nombre de codons d'inici és "+ codo);

  }
}