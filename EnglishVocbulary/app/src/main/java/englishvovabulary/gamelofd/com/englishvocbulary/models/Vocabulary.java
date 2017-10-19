package englishvovabulary.gamelofd.com.englishvocbulary.models;

/**
 * Created by DELL on 8/23/2017.
 */

public class Vocabulary {
    private String name;
    private String pronupronunciation;
    private String mean;
    private int topicId;

    public Vocabulary(String name, String pronupronunciation, String mean, int topicId) {
        this.name = name;
        this.pronupronunciation = pronupronunciation;
        this.mean = mean;
        this.topicId = topicId;
    }

    public Vocabulary() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronupronunciation() {
        return pronupronunciation;
    }

    public void setPronupronunciation(String pronupronunciation) {
        this.pronupronunciation = pronupronunciation;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "name='" + name + '\'' +
                ", pronupronunciation='" + pronupronunciation + '\'' +
                ", mean='" + mean + '\'' +
                ", topicId=" + topicId +
                '}';
    }
}
