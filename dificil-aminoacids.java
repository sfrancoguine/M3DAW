//donada la següent seqüencia d'ARN indica quants aminoàcids sortirien de la seva transcripció i posterior
//traducció sabent que cada aminoàcid es codifica amb tres bases i sabent també que el codó d'inici és
//AUG i es tradueix en l'aminoàcid metionina i el codó final en aquest cas prendrem que és NOMÉS el codó
//UGA, que no codifica cap aminoàcid.
class Main {
  public static void main(String[] args) {
   
    char[] cadena1 = {'C','G','G','A','U','G','C','G','G','U','U','G','U','G','C','C','A','A','U','G','A','C','C','U'};
       
    boolean iniciada = false;
    boolean ficadena = false;
    int coincidencies=0;
    int nombrebases=0;
    int aminoacids=0;
    int i=0;
    while(!ficadena){
        if(!iniciada){
          if(coincidencies == 0){
                if(cadena1[i]=='A'){
                  coincidencies=1;
                }else{
                  coincidencies=0;
                }
            }else if(coincidencies == 1){
                if(cadena1[i]=='U'){
                  coincidencies=2;
                }else{
                  coincidencies=0;
                } 
            }else if(coincidencies == 2){
              if(cadena1[i]=='G'){
                  iniciada=true;
                  nombrebases=3;
              }else{
                  coincidencies=0;
              } 
            }
        }else{
            nombrebases+=1;
            if(coincidencies == 0){
                if(cadena1[i]=='U'){
                  coincidencies=1;
                }else{
                  coincidencies=0;
                }
            }else if(coincidencies == 1){
                if(cadena1[i]=='G'){
                  coincidencies=2;
                }else{
                  coincidencies=0;
                } 
            }else if(coincidencies == 2){
              if(cadena1[i]=='A'){
                  ficadena=true;
                  nombrebases-=3;
              }else{
                  coincidencies=0;
              } 
            }
        }
      i++;
    }
    aminoacids=nombrebases/3;
    System.out.println("El nombre d'aminoàcids és "+ aminoacids);

  }
}
