//donada la cadena d'ADN cadena1, escriu la cadena complementària.
//Recordeu que les bases complementàries són A-T i C-G
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  
    char[] cadena1 = {'C','C','G','A','T','A','C','G','G','A'};
    char[] cadena2 = new char[10];
   
    int i = 0;
    while(i<10){
        if(cadena1[i]=='C') cadena2[i]='G';
        if(cadena1[i]=='G') cadena2[i]='C';
        if(cadena1[i]=='A') cadena2[i]='T';
        if(cadena1[i]=='T') cadena2[i]='A';
        i++;
    }
    System.out.println(cadena2);

  }
}