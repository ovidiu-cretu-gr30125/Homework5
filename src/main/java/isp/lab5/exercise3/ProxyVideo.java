package isp.lab5.exercise3;

/**
 * ProxyVideo the constructor
 * public method play() play the right video witch is give in videoType parameter
 * @param type - one of the values("Color", "black and white")
 */

public class ProxyVideo implements Playable {
    private ColorVideo colorVideo;

    private BlackAndWhiteVideo blackAndWhiteVideo;

    private String fileName;

    private String videoType;

    public ProxyVideo(String fileName,String videoType){
        this.fileName = fileName;
        this.videoType=videoType;
    }

    @Override
    public void play() {
       if(videoType.equals("Color")){
           if(colorVideo==null){
               colorVideo = new ColorVideo(fileName);
           }
           colorVideo.play();
       }
       else
           if(videoType.equals("black and white")){
               if(blackAndWhiteVideo==null){
                    blackAndWhiteVideo = new BlackAndWhiteVideo(fileName);
               }
               blackAndWhiteVideo.play();
           }
    }

}
