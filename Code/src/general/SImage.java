package general;

public class SImage implements Comparable<SImage>{
    private String path;
    
    public SImage(String path){
        this.path = path;
    }

    @Override
    public int compareTo(SImage image) {
        return this.path.compareTo(image.path);
    }
}
