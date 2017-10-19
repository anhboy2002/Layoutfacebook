package englishvovabulary.gamelofd.com.englishvocbulary.controllers;

import java.util.ArrayList;

import englishvovabulary.gamelofd.com.englishvocbulary.models.Topic;
import englishvovabulary.gamelofd.com.englishvocbulary.models.Vocabulary;

/**
 * Created by DELL on 8/23/2017.
 */

public class TopicManager {
    private ArrayList<Topic> mTopicList;
    private  ArrayList<Vocabulary> mVocabularyList;

    public TopicManager(ArrayList<Topic> aTopicList, ArrayList<Vocabulary> vocabularyArrayList) {
        this.mTopicList = aTopicList;
        this.mVocabularyList = vocabularyArrayList;
    }

    public TopicManager() {
    }

    public TopicManager(ArrayList<Topic> mTopicList) {
        this.mTopicList = mTopicList;
    }

    public ArrayList<Topic> getTopicList(){
         return mTopicList;
    }
        public ArrayList<Vocabulary> getVocabularyArrayList(Topic topic ) {
            ArrayList<Vocabulary> list  =new ArrayList<>();
            for (Vocabulary vocabulary : mVocabularyList) {
                if (vocabulary.getTopicId()== topic.getId()){
                    list.add(vocabulary);
                }
            }
           return list;
        }
    }

