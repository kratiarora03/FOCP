class box{
    float width;
    float height;
    float depth;

    public box(){
        this.width=5;
        this.height=5;
        this.depth=5;
    }

    public box(float width,float height,float depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public float getwidth(){
        return width;
    }
    public void setwidth(float width){
        this.width=width;
    }
    public float getheight(){
        return height;
    }
    public void setheight(float height){
        this.height=height;
    }
    public float getdepth(){
        return depth;
    }
    public void setdepth(float depth){
        this.depth=depth;
    }
    public float volume(){
        return width*height*depth;
    }
}

class box_weight extends box{
    float weight;
    //copy constructor
    public box_weight(){
        super();
        this.weight=1;

    }
    //parametrized constructor
    public box_weight(float width,float height,float depth,float weight){
        super(width, height, depth);
        this.weight=weight;
    }
    public float getweight(){
        return weight;
    }
    public void setweight(float weight){
        this.weight=weight;
    }
    public float weight(){
        return weight;
    }

}

public class box_weightdemo {
    public static void main(String[] args) {
        box b = new box(7, 6, 4);
        System.out.println("Width : " + b.getwidth() + "Height : " + b.getheight() + "Depth : " + b.getdepth());
        box_weight w = new box_weight(4, 6, 2, 8);
    }
}

