public class Thief {
    private int x;
    private int y;
    private String get;

    public Thief(int xr,int yr){
        x = xr;
        y = yr;
    }
    public void setThiefPosition(int xs,int ys){
        x = xs;
        y = ys;
    }
    public int getXThiefPosition(){
        return x;
    }

    public int getYThiefposition(){
        return y;
    }

    public void setGet(String f){
        get = f;
    }
    public String getGet(){
        return get;
    }
}
