package isp.lab5.exercise3;

public class ProxyVideo implements Playable {
    private ColorVideo colorVideo;

    private BlackAndWhiteVideo blackAndWhiteVideo;

    private String fileName;

    private String videoType;

    /**
     *  ProxyVideo the constructor
     * @param fileName name of the video file that has to be played
     * @param videoType the type of the video -("Color","black and white")
     */
    public ProxyVideo(String fileName,String videoType){
        this.fileName = fileName;
        this.videoType=videoType;
    }

    /**
     * play method play the right video given by videoType
     */
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
