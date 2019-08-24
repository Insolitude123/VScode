package graph;

/**
 * VerTex
 */
public class VerTex {

    private String val="";
    
    public VerTex(){

    }

    public VerTex(String val){
        this.val = val;
    }

    public String getVal() {
        return val;
    }
    
    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}