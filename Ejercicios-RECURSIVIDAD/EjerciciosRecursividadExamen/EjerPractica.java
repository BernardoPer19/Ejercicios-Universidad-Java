
public class EjerPractica{

    public String repe(String cad){
        return repe(cad,0,0);
    }

    private String repe(String cad, int pos, int cont){

        if (pos == cad.length() - 1) {
            return cad.charAt(pos) + "" + cont;
        }

        char actual = cad.charAt(pos);
        char sig = cad.charAt(pos+1);

        if(actual == sig){
            return repe(cad, pos+1, cont+1);
        }else{
            return actual + "" + (char)('0' + cont) + repe(cad, pos + 1, 1);
        }

    }

}
