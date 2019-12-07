//donada la següent cadena d'ADN, digues quina és la base nitrogenada
//que apareix més vegades.
class Main {
  public static void main(String[] args) {
   
    char[] cadena1 = {'C','G','G','A','T','A','C','G','G','A'};
       
    int i = 0;
    int numC=0; int numG=0; int numA=0; int numT=0; int max=0;
    char cmax=' ';
    while(i<10){
        if(cadena1[i]=='C'){
          numC++;
          if(numC>max) cmax='C'; max=numC;
        } 
        if(cadena1[i]=='G') {
          numG++;
          if(numG>max) cmax='G'; max=numG;
        } 
        if(cadena1[i]=='A'){
          numA++;
          if(numA>max) cmax='A'; max=numA;
        } 
        if(cadena1[i]=='T') {
          numT++;
          if(numT>max) cmax='T'; max=numT;
        } 
        i++;
    }
    System.out.println("La base nitrogenada que es repeteix més és "+ cmax);

  }
}